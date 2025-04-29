import sys

def tsp_dp(cost):
    n = len(cost)
    VISITED_ALL = (1 << n) - 1

    # dp[mask][pos] = minimum cost to reach pos with visited cities in mask
    dp = [[float('inf')] * n for _ in range(1 << n)]
    dp[1][0] = 0  # Start from city 0

    for mask in range(1 << n):
        for u in range(n):
            if mask & (1 << u):  # If city u is visited
                for v in range(n):
                    if mask & (1 << v) and v != u:
                        prev_mask = mask ^ (1 << u)
                        dp[mask][u] = min(dp[mask][u], dp[prev_mask][v] + cost[v][u])

    # Complete the cycle: return to starting city 0
    min_cost = min(dp[VISITED_ALL][i] + cost[i][0] for i in range(1, n))
    return min_cost

# Example usage
cost_matrix = [
    [0, 10, 15, 20],
    [10, 0, 35, 25],
    [15, 35, 0, 30],
    [20, 25, 30, 0]
]
print("Minimum cost of TSP tour:", tsp_dp(cost_matrix))
