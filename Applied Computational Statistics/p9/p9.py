import numpy as np
import matplotlib.pyplot as plt
from scipy.stats import norm, uniform

# Set up the figure
plt.figure(figsize=(14, 6))
mu = 0     # mean
sigma = 1  # standard deviation

# Generate data points
x_norm = np.linspace(mu - 4*sigma, mu + 4*sigma, 1000)

# PDF and CDF
pdf_norm = norm.pdf(x_norm, mu, sigma)
cdf_norm = norm.cdf(x_norm, mu, sigma)

# Plot Normal PDF
plt.subplot(2, 2, 1)
plt.plot(x_norm, pdf_norm, 'b', label='PDF')
plt.title("Normal Distribution - PDF")
plt.xlabel('x')
plt.ylabel('Probability Density')
plt.grid(True)
plt.legend()

# Plot Normal CDF
plt.subplot(2, 2, 2)
plt.plot(x_norm, cdf_norm, 'g', label='CDF')
plt.title("Normal Distribution - CDF")
plt.xlabel('x')
plt.ylabel('Cumulative Probability')
plt.grid(True)
plt.legend()
a = 0     # start
b = 10    # end

# Generate data points
x_uniform = np.linspace(a - 2, b + 2, 1000)

# PDF and CDF
pdf_uniform = uniform.pdf(x_uniform, a, b - a)
cdf_uniform = uniform.cdf(x_uniform, a, b - a)

# Plot Uniform PDF
plt.subplot(2, 2, 3)
plt.plot(x_uniform, pdf_uniform, 'r', label='PDF')
plt.title("Uniform Distribution - PDF")
plt.xlabel('x')
plt.ylabel('Probability Density')
plt.grid(True)
plt.legend()

# Plot Uniform CDF
plt.subplot(2, 2, 4)
plt.plot(x_uniform, cdf_uniform, 'm', label='CDF')
plt.title("Uniform Distribution - CDF")
plt.xlabel('x')
plt.ylabel('Cumulative Probability')
plt.grid(True)
plt.legend()

# Adjust layout and show plot
plt.tight_layout()
plt.show()
