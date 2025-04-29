import heapq

class Item:
    def __init__(self, weight, profit):
        self.weight = weight
        self.profit = profit
        self.ratio = profit / weight

class Node:
    def __init__(self, level, profit, weight, bound):
        self.level = level
        self.profit = profit
        self.weight = weight
        self.bound = bound
    def __lt__(self, other):
        return self.bound > other.bound  # Max-Heap behavior

def bound(node, n, W, items):
    if node.weight >= W:
        return 0

    profit_bound = node.profit
    j = node.level + 1
    totweight = node.weight

    while j < n and totweight + items[j].weight <= W:
        totweight += items[j].weight
        profit_bound += items[j].profit
        j += 1

    if j < n:
        profit_bound += (W - totweight) * items[j].ratio

    return profit_bound

def knapsack_branch_and_bound(W, profits, weights):
    n = len(profits)
    items = sorted([Item(weights[i], profits[i]) for i in range(n)], key=lambda x: x.ratio, reverse=True)

    queue = []
    v = Node(-1, 0, 0, 0)
    v.bound = bound(v, n, W, items)
    heapq.heappush(queue, v)

    max_profit = 0

    while queue:
        v = heapq.heappop(queue)

        if v.bound > max_profit and v.level < n - 1:
            u = Node(v.level + 1, 0, 0, 0)

            # Take the item
            u.weight = v.weight + items[u.level].weight
            u.profit = v.profit + items[u.level].profit
            if u.weight <= W and u.profit > max_profit:
                max_profit = u.profit
            u.bound = bound(u, n, W, items)
            if u.bound > max_profit:
                heapq.heappush(queue, u)

            # Don't take the item
            u2 = Node(v.level + 1, v.profit, v.weight, 0)
            u2.bound = bound(u2, n, W, items)
            if u2.bound > max_profit:
                heapq.heappush(queue, u2)

    return max_profit

# Example usage
profits = [60, 100, 120]
weights = [10, 20, 30]
W = 50
print("Maximum profit (Branch and Bound):", knapsack_branch_and_bound(W, profits, weights))
