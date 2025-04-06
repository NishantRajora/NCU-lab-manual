
import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

geyser_data = sns.load_dataset('geyser')  

# #  Visualize Data in Tabular Format
# print("First 5 Rows of the Dataset:")
# print(geyser_data.head())

# # Display Descriptive Statistics
# print("\nDescriptive Statistics:")
# print(geyser_data.describe())

# # Create Histogram for "Duration" Field
# plt.figure(figsize=(8, 6))
# sns.histplot(data=geyser_data, x='duration', bins=20, kde=False, color='blue')
# plt.title("Histogram of Duration")
# plt.xlabel("Duration")
# plt.ylabel("Frequency")
# plt.show()

# #  Create Histogram for "Waiting" Field
# plt.figure(figsize=(8, 6))
# sns.histplot(data=geyser_data, x='waiting', bins=20, kde=False, color='green')
# plt.title("Histogram of Waiting")
# plt.xlabel("Waiting")
# plt.ylabel("Frequency")
# plt.show()

# #  Show Distribution Along with Histogram
# plt.figure(figsize=(8, 6))
# sns.histplot(data=geyser_data, x='duration', bins=20, kde=True, color='blue')
# plt.title("Histogram with Distribution Curve (Duration)")
# plt.xlabel("Duration")
# plt.ylabel("Density")
# plt.show()

# plt.figure(figsize=(8, 6))
# sns.histplot(data=geyser_data, x='waiting', bins=20, kde=True, color='green')
# plt.title("Histogram with Distribution Curve (Waiting)")
# plt.xlabel("Waiting")
# plt.ylabel("Density")
# plt.show()

#  Plot a Histogram of "Total Bill" and "Tips" (Using 'tips' Dataset)
tips_data = sns.load_dataset('tips')

plt.figure(figsize=(8, 6))
sns.histplot(data=tips_data, x='total_bill', bins=20, kde=True, color='purple')
plt.title("Histogram of Total Bill")
plt.xlabel("Total Bill")
plt.ylabel("Density")
plt.show()

plt.figure(figsize=(8, 6))
sns.histplot(data=tips_data, x='tip', bins=20, kde=True, color='orange')
plt.title("Histogram of Tips")
plt.xlabel("Tips")
plt.ylabel("Density")
plt.show()

#  Create Boxplot
plt.figure(figsize=(8, 6))
sns.boxplot(data=tips_data, x='day', y='total_bill', hue='time', palette='coolwarm')
plt.title("Boxplot of Total Bill by Day and Time")
plt.xlabel("Day")
plt.ylabel("Total Bill")
plt.legend(title="Time")
plt.show()

#  Create Histograms and Boxplots Grouped by Categories
plt.figure(figsize=(8, 6))
sns.histplot(data=tips_data, x='total_bill', hue='time', bins=20, kde=True, palette='husl')
plt.title("Histogram of Total Bill Grouped by Time")
plt.xlabel("Total Bill")
plt.ylabel("Density")
plt.show()

plt.figure(figsize=(8, 6))
sns.boxplot(data=tips_data, x='day', y='total_bill', hue='sex', palette='pastel')
plt.title("Boxplot of Total Bill Grouped by Day and Sex")
plt.xlabel("Day")

plt.ylabel("Total Bill")
plt.legend(title="Sex")
plt.show()