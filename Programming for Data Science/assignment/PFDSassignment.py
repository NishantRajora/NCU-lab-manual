import pandas as pd
import numpy as np
file_path = "D:\\PYTHON\\assignment\\Automobile_data.csv"
df = pd.read_csv(file_path, encoding='ISO-8859-1')
first_five = df.head()
last_five = df.tail()

#ex1
print("First five rows:")
print(first_five)    
print("Last five rows:")
print(last_five)
print()

#ex2
df.replace(['?', 'n.a'], np.nan, inplace=True)

#ex3
most_expensive_row = df.loc[df['price'].idxmax()]
print(most_expensive_row)
print()

#ex4
toyota_cars = df[df['company'] == 'toyota']
print(toyota_cars)
print()

#ex5
cars_per_company = df.groupby('company').size()
print(cars_per_company)
print()

#ex6
highest_price_per_company = df.loc[df.groupby('company')['price'].idxmax()]
print(highest_price_per_company)
print()

#ex7
average_mileage_per_company = df.groupby('company')['average-mileage'].mean()
print(average_mileage_per_company)
print()

#ex8
sorted_df_ascending = df.sort_values(by='price', ascending=True)
print(sorted_df_ascending)
print()

#ex9
GermanCars = {'Company': ['Ford', 'Mercedes', 'BMW', 'Audi'], 'Price': [23845, 171995, 135925, 71400]}
JapaneseCars = {'Company': ['Toyota', 'Honda', 'Nissan', 'Mitsubishi'], 'Price': [29995, 23600, 61500, 58900]}
df_german = pd.DataFrame(GermanCars)
df_japanese = pd.DataFrame(JapaneseCars)

df_concatenated = pd.concat([df_german, df_japanese], ignore_index=True)
print(df_concatenated)
print()

#ex10
Car_Price = {'Company': ['Toyota', 'Honda', 'BMW', 'Audi'], 'Price': [23845, 17995, 135925, 71400]}
car_Horsepower = {'Company': ['Toyota', 'Honda', 'BMW', 'Audi'], 'horsepower': [141, 80, 182, 160]}
df_price = pd.DataFrame(Car_Price)
df_horsepower = pd.DataFrame(car_Horsepower)

df_merged = pd.merge(df_price, df_horsepower, on='Company')
print(df_merged)

