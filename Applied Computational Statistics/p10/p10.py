from scipy.stats import norm

def compute_critical_value(alpha, tail_type='two-tailed'):
    if tail_type == 'one-tailed':
        z_critical = norm.ppf(1 - alpha)
        return round(z_critical, 4)
    elif tail_type == 'two-tailed':
        z_critical = norm.ppf(1 - alpha/2)
        return round(z_critical, 4)
    else:
        raise ValueError("tail_type must be 'one-tailed' or 'two-tailed'")

# Example usage:
alpha = 0.05

z_one_tailed = compute_critical_value(alpha, 'one-tailed')
z_two_tailed = compute_critical_value(alpha, 'two-tailed')

print(f"Critical value for alpha = {alpha} (one-tailed): Z = {z_one_tailed}")
print(f"Critical value for alpha = {alpha} (two-tailed): Z = ±{z_two_tailed}")
