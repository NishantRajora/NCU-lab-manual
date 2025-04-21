import numpy as np
import scipy.stats as stats

# Outcomes and their probabilities
x = np.array([1, 2, 3, 4])
p = np.array([0.1, 0.2, 0.3, 0.4])

# Calculate Expectation (Mean)
mean = np.sum(x * p)

# Calculate Variance
variance = np.sum((x - mean)**2 * p)

# Calculate Standard Deviation
std_dev = np.sqrt(variance)

# Display Results
print(f"Outcomes: {x}")
print(f"Probabilities: {p}")
print(f"Expectation (Mean): {mean:.4f}")
print(f"Variance: {variance:.4f}")
print(f"Standard Deviation: {std_dev:.4f}")

# Using scipy.stats for verification
rv = stats.rv_discrete(name='X', values=(x, p))
print("\nUsing scipy.stats:")
print(f"Expectation (Mean): {rv.mean():.4f}")
print(f"Variance: {rv.var():.4f}")
print(f"Standard Deviation: {rv.std():.4f}")  
