import os
import subprocess
import schedule
import time
from datetime import datetime, timedelta

# Path to the local repository
REPO_PATH = "/path/to/your/repo"

# Commit message template
COMMIT_MESSAGE = "Auto-commit on {date}"

# Function to make a commit
def auto_commit():
    os.chdir(REPO_PATH)
    date_str = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    commit_message = COMMIT_MESSAGE.format(date=date_str)
    
    try:
        # Add changes
        subprocess.run(["git", "add", "."], check=True)
        # Commit changes
        subprocess.run(["git", "commit", "-m", commit_message], check=True)
        # Push changes
        subprocess.run(["git", "push"], check=True)
        print(f"Committed and pushed successfully at {date_str}")
    except subprocess.CalledProcessError as e:
        print(f"An error occurred: {e}")

# Schedule the commit function daily for one month
start_date = datetime.now()
end_date = start_date + timedelta(days=30)

def schedule_commits():
    while datetime.now() < end_date:
        schedule.run_pending()
        time.sleep(1)

# Schedule the task
schedule.every().day.at("12:00").do(auto_commit)  # Change the time as needed

# Run the scheduler
print("Scheduler started. Auto-commit will run daily for one month.")
schedule_commits()
