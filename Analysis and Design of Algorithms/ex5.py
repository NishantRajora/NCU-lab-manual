import time

class Item:
    def __init__(self, value, weight):
        self.value = value
        self.weight = weight

def fractional_knapsack(capacity, items):
    items.sort(key=lambda x: x.value / x.weight, reverse=True)
    
    total_value = 0 
    for item in items:
        if capacity >= item.weight:
            capacity -= item.weight
            total_value += item.value
        else:
            total_value += item.value * (capacity / item.weight)
            break
    return total_value

items = [Item(60, 10), Item(100, 20), Item(120, 30)]
capacity = 50

start = time.time()
max_value = fractional_knapsack(capacity, items)
time_taken = time.time() - start

print("Maximum value in Knapsack =", max_value)
print("Execution time:", time_taken, "seconds")
