import matplotlib.pyplot as plt

# Define possible outcomes (1 to 6 for a fair die)
outcomes = [1, 2, 3, 4, 5, 6]

# Define the PMF: Each outcome has equal probability 1/6
pmf = [1/6] * 6

# Print PMF values
print("Probability Mass Function for Rolling a Fair Die:")
for outcome, prob in zip(outcomes, pmf):
    print(f"P(X = {outcome}) = {prob}")

# Plotting the PMF
plt.figure(figsize=(8, 5))
plt.bar(outcomes, pmf, color='skyblue', edgecolor='black')
plt.xlabel('Outcome (X)')
plt.ylabel('P(X = x)')
plt.title('Probability Mass Function - Fair Die')
plt.xticks(outcomes)
plt.ylim(0, 0.25)
plt.grid(axis='y', linestyle='--', alpha=0.7)
plt.show()
