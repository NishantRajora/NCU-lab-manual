import pandas as pd

data = [10, 20, 30, 40]
series = pd.Series(data)
print("Original Series:")
print(series)

print("\nSeries after adding 5 to each element:")
print(series + 5)
print("\nSeries after multiplying each element by 2:")
print(series * 2)

print("\nAccessing element at index 2:")
print(series[2])

print("\nSlicing the first two elements:")
print(series[:2])
print("\nFiltering elements greater than 25:")
print(series[series > 25])

custom_series = pd.Series(data, index=['a', 'b', 'c', 'd'])
print("\nSeries with custom index:")
print(custom_series)


