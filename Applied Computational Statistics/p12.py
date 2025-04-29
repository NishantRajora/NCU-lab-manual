import numpy as np
import matplotlib.pyplot as plt

# Function to demonstrate CLT
def demonstrate_clt(sample_size=5, num_samples=1000):
    # Uniform population from 0 to 10
    population = np.random.uniform(0, 10, size=100000)

    sample_means = []

    for _ in range(num_samples):
        sample = np.random.choice(population, size=sample_size, replace=True)
        sample_mean = np.mean(sample)
        sample_means.append(sample_mean)

    # Plotting the distribution of sample means
    plt.hist(sample_means, bins=30, color='skyblue', edgecolor='black', density=True)
    plt.title(f"Distribution of Sample Means (n = {sample_size})")
    plt.xlabel("Sample Mean")
    plt.ylabel("Density")
    plt.grid(True)
    plt.show()

# Run for different sample sizes
print("CLT Demonstration for n = 5")
demonstrate_clt(sample_size=5)

print("CLT Demonstration for n = 30")
demonstrate_clt(sample_size=30)
