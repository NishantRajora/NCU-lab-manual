from scipy import stats
import numpy as np

# Function to perform one-sample t-test
def hypothesis_test_t(sample_data, population_mean, alpha=0.05):
    """
    Perform a one-sample t-test

    Parameters:
    - sample_data: list or numpy array of sample values
    - population_mean: the hypothesized population mean (μ0)
    - alpha: significance level (default is 0.05)

    Returns:
    - t_statistic, p_value, result (Reject or Fail to Reject H0)
    """
    t_statistic, p_value = stats.ttest_1samp(sample_data, population_mean)

    print(f"T-statistic: {t_statistic:.4f}")
    print(f"P-value: {p_value:.4f}")

    if p_value < alpha:
        print("Result: Reject the null hypothesis (H0)")
    else:
        print("Result: Fail to reject the null hypothesis (H0)")

# Example usage
sample = [12.3, 11.7, 13.1, 14.2, 12.5, 11.9, 13.7, 12.8, 14.0, 12.2]
hypothesized_mean = 12.0
alpha = 0.05

print("Hypothesis Test for Unknown Variance (One-sample t-test)")
hypothesis_test_t(sample, hypothesized_mean, alpha)
