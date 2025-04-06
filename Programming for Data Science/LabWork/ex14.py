import random
array = []
for i in range(25):
    rand = random.randint(1, 100)
    array.append(rand)

maxvalue = max(array)
minvalue = min(array)
maxi = array.index(maxvalue)
mini = array.index(minvalue)

print("array:", array)
print("maximum value:", maxvalue)
print("index of max value:", maxi)
print("minimum value:", minvalue)
print("index of min value:", mini)

import numpy as np
arr= np.random.randint(1,100,(5,5))
print("Array - ",arr)
print("Minimun element - ",np.min(arr))
print("Maximun element - ",np.max(arr))
print("Index of minimun element - ",np.argmin(arr))
print("Index of minimun element - ",np.argmax(arr))