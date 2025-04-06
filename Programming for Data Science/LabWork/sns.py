import matplotlib.pyplot as plt
import seaborn as sns
import pandas as pd
import numpy as np


data = pd.DataFrame({
    "Year": [2010, 2011, 2012, 2013],
    "Value": [100, 150, 200, 250]
})

import pandas as pd

# DataFrame 1: Personal Info
df1 = pd.DataFrame({
    'Employee_id': [101, 102],
    'Name': ['Alice', 'Bob'],
    'Address': ['NY', 'LA'],
    'Phone_number': ['1234567890', '0987654321']
})

# DataFrame 2: Academic Info
df2 = pd.DataFrame({
    'Employee_id': [101, 102],
    'Highest_Education': ['MBA', 'B.Tech'],
    'Year_of_Completion': [2020, 2019],
    'Courses_Pursing': ['AI', 'ML']
})

# Merge operations
inner = pd.merge(df1, df2, on='Employee_id', how='inner')
outer = pd.merge(df1, df2, on='Employee_id', how='outer')
left = pd.merge(df1, df2, on='Employee_id', how='left')
right = pd.merge(df1, df2, on='Employee_id', how='right')

# Print results
print("Inner Join:\n", inner)
print("Outer Join:\n", outer)
print("Left Join:\n", left)
print("Right Join:\n", right)
