from scipy.stats import norm

# Function to find critical z-value for a given significance level α
def find_critical_value(alpha, tail='two-tailed'):
   
    if tail == 'two-tailed':
        z_critical = norm.ppf(1 - alpha/2)
        return -z_critical, z_critical
    elif tail == 'left-tailed':
        return norm.ppf(alpha)
    elif tail == 'right-tailed':
        return norm.ppf(1 - alpha)
    else:
        raise ValueError("tail must be 'two-tailed', 'left-tailed', or 'right-tailed'")

# Example usage
alpha = 0.05  # 95% confidence level
print("Two-tailed test critical values:", find_critical_value(alpha, 'two-tailed'))
print("Left-tailed test critical value:", find_critical_value(alpha, 'left-tailed'))
print("Right-tailed test critical value:", find_critical_value(alpha, 'right-tailed'))
