import time

# Insertion Sort
def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key
    return arr

# Selection Sort
def selection_sort(arr):
    for i in range(len(arr)):
        min_idx = i
        for j in range(i + 1, len(arr)):
            if arr[j] < arr[min_idx]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]
    return arr

data = [64, 25, 12, 22, 11]

start = time.time()
sorted_data = insertion_sort(data.copy())
print("Insertion Sort Time:", time.time() - start, "seconds")
print("Sorted Data (Insertion Sort):", sorted_data)

start = time.time()
sorted_data = selection_sort(data.copy())
print("Selection Sort Time:", time.time() - start, "seconds")
print("Sorted Data (Selection Sort):", sorted_data)
