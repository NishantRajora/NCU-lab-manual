
keys = ['a', 'b', 'c']
values = [1, 2, 3]

dictionary = {}

for i in range(len(keys)):
    dictionary[keys[i]] = values[i]

print(dictionary)


keyslist = []

for key in dictionary:
    keyslist.append(key)

print(keyslist)

valueslist = []
for value in dictionary.values():
    valueslist.append(value)
print(valueslist)

keystuple = tuple(keyslist)
valuestuple = tuple(valueslist)
print("Keys Tuple:", keystuple)
print("values Tuple :", valuestuple)

keysl = list(keystuple)
valuesl = list(valuestuple)
print("Keys list from tuple", keysl)
print("list from tuple:", valuesl)