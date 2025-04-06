import time
import numpy as np
def strassen_matrix_multiplication(A, B):
    if len(A) == 1:
        return A * B
    
    n = len(A)
    mid = n // 2 
    A11, A12 = A[:mid, :mid], A[:mid, mid:]
    A21, A22 = A[mid:, :mid], A[mid:, mid:]
    B11, B12 = B[:mid, :mid], B[:mid, mid:]
    B21, B22 = B[mid:, :mid], B[mid:, mid:]
    
    M1 = strassen_matrix_multiplication(A11 + A22, B11 + B22)
    M2 = strassen_matrix_multiplication(A21 + A22, B11)
    M3 = strassen_matrix_multiplication(A11, B12 - B22)
    M4 = strassen_matrix_multiplication(A22, B21 - B11)
    M5 = strassen_matrix_multiplication(A11 + A12, B22)
    M6 = strassen_matrix_multiplication(A21 - A11, B11 + B12)
    M7 = strassen_matrix_multiplication(A12 - A22, B21 + B22)
    
    C11 = M1 + M4 - M5 + M7
    C12 = M3 + M5
    C21 = M2 + M4
    C22 = M1 - M2 + M3 + M6
    
    C = np.vstack((np.hstack((C11, C12)), np.hstack((C21, C22))))
    return C

N = 4  
A = np.random.randint(1, 10, (N, N))
B = np.random.randint(1, 10, (N, N))

print("Matrix A:")
print(A)
print("Matrix B:")
print(B)

start = time.time()
C = strassen_matrix_multiplication(A, B)
time_taken = time.time() - start

print("Resultant Matrix C:")
print(C)
print("Time taken:", time_taken, "seconds")
