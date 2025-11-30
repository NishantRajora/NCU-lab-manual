# -------------------------------
# Part 1 — Core Algorithms
# -------------------------------

# Page Replacement Algorithms:
# FIFO, LRU, and Optimal
# -------------------------------

def fifo_page_replacement(reference_string, frames):
    memory = []
    page_faults = 0
    pointer = 0
    states = []

    for page in reference_string:
        if page not in memory:
            page_faults += 1
            if len(memory) < frames:
                memory.append(page)
            else:
                memory[pointer] = page
                pointer = (pointer + 1) % frames
        states.append(list(memory))

    return page_faults, states


def lru_page_replacement(reference_string, frames):
    memory = []
    page_faults = 0
    recent_use = {}
    states = []

    for i, page in enumerate(reference_string):
        if page not in memory:
            page_faults += 1
            if len(memory) < frames:
                memory.append(page)
            else:
                # find least recently used page
                lru_page = min(recent_use, key=recent_use.get)
                memory[memory.index(lru_page)] = page
                del recent_use[lru_page]
        recent_use[page] = i
        states.append(list(memory))

    return page_faults, states


def optimal_page_replacement(reference_string, frames):
    memory = []
    page_faults = 0
    states = []

    for i, page in enumerate(reference_string):
        if page not in memory:
            page_faults += 1

            if len(memory) < frames:
                memory.append(page)
            else:
                # find optimal page to replace
                farthest_index = -1
                page_to_replace = None

                for mem_page in memory:
                    if mem_page not in reference_string[i+1:]:
                        page_to_replace = mem_page
                        break
                    else:
                        idx = reference_string[i+1:].index(mem_page)
                        if idx > farthest_index:
                            farthest_index = idx
                            page_to_replace = mem_page

                memory[memory.index(page_to_replace)] = page

        states.append(list(memory))

    return page_faults, states

# -------------------------------
# Part 2 — Helper Functions + CLI
# -------------------------------

def print_states(states, title):
    print("\n" + "-" * 40)
    print(title)
    print("-" * 40)
    for i, state in enumerate(states):
        print(f"After reference {i + 1}: {state}")


def simulate_cli():
    print("\n=== PAGE REPLACEMENT POLICY VISUALIZER (CLI MODE) ===")

    # user input
    reference_string = input("Enter reference string (space-separated): ").split()
    reference_string = [int(x) for x in reference_string]

    frames = int(input("Enter number of frames: "))

    # FIFO
    fifo_faults, fifo_states = fifo_page_replacement(reference_string, frames)
    print_states(fifo_states, "FIFO Page Replacement")
    print(f"Total FIFO Page Faults = {fifo_faults}\n")

    # LRU
    lru_faults, lru_states = lru_page_replacement(reference_string, frames)
    print_states(lru_states, "LRU Page Replacement")
    print(f"Total LRU Page Faults = {lru_faults}\n")

    # Optimal
    opt_faults, opt_states = optimal_page_replacement(reference_string, frames)
    print_states(opt_states, "Optimal Page Replacement")
    print(f"Total Optimal Page Faults = {opt_faults}\n")

    print("=== Simulation Completed ===")

# -------------------------------
# Part 3 — GUI + Main Function
# -------------------------------

import tkinter as tk
from tkinter import ttk, messagebox


def run_algorithm(algo_name, reference_string, frames):
    if algo_name == "FIFO":
        return fifo_page_replacement(reference_string, frames)
    elif algo_name == "LRU":
        return lru_page_replacement(reference_string, frames)
    elif algo_name == "Optimal":
        return optimal_page_replacement(reference_string, frames)


def show_result(tree, states, faults):
    # Clear table
    for row in tree.get_children():
        tree.delete(row)

    # Insert states
    for i, state in enumerate(states):
        tree.insert("", tk.END, values=(i+1, str(state)))

    messagebox.showinfo("Page Faults", f"Total Page Faults = {faults}")


def start_gui():
    root = tk.Tk()
    root.title("Page Replacement Policy Visualizer")
    root.geometry("600x400")

    # Input Frame
    frame = tk.Frame(root)
    frame.pack(pady=10)

    tk.Label(frame, text="Reference String:").grid(row=0, column=0)
    txt_ref = tk.Entry(frame, width=30)
    txt_ref.grid(row=0, column=1, padx=10)

    tk.Label(frame, text="Frames:").grid(row=1, column=0)
    txt_frames = tk.Entry(frame, width=10)
    txt_frames.grid(row=1, column=1)

    # Output Table
    columns = ("Step", "Memory State")
    tree = ttk.Treeview(root, columns=columns, show="headings", height=10)
    tree.heading("Step", text="Step")
    tree.heading("Memory State", text="Memory State")
    tree.pack(pady=10)

    # Buttons
    def run_fifo():
        try:
            ref = list(map(int, txt_ref.get().split()))
            frames = int(txt_frames.get())
            faults, states = fifo_page_replacement(ref, frames)
            show_result(tree, states, faults)
        except:
            messagebox.showerror("Error", "Invalid Input!")

    def run_lru():
        try:
            ref = list(map(int, txt_ref.get().split()))
            frames = int(txt_frames.get())
            faults, states = lru_page_replacement(ref, frames)
            show_result(tree, states, faults)
        except:
            messagebox.showerror("Error", "Invalid Input!")

    def run_opt():
        try:
            ref = list(map(int, txt_ref.get().split()))
            frames = int(txt_frames.get())
            faults, states = optimal_page_replacement(ref, frames)
            show_result(tree, states, faults)
        except:
            messagebox.showerror("Error", "Invalid Input!")

    button_frame = tk.Frame(root)
    button_frame.pack()

    tk.Button(button_frame, text="Run FIFO", width=15, command=run_fifo).grid(row=0, column=0, padx=5)
    tk.Button(button_frame, text="Run LRU", width=15, command=run_lru).grid(row=0, column=1, padx=5)
    tk.Button(button_frame, text="Run Optimal", width=15, command=run_opt).grid(row=0, column=2, padx=5)

    root.mainloop()


# Main Launcher
if __name__ == "__main__":
    print("Choose mode:")
    print("1. CLI Mode")
    print("2. GUI Mode")

    choice = input("Enter choice: ")

    if choice == "1":
        simulate_cli()
    else:
        start_gui()
