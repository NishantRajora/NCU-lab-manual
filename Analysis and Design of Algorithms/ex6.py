import heapq

def prim(graph, start=0):
    n = len(graph)
    visited = [False] * n
    min_heap = [(0, start)]  # (weight, node)
    mst_weight = 0

    while min_heap:
        weight, u = heapq.heappop(min_heap)
        if visited[u]:
            continue
        visited[u] = True
        mst_weight += weight
        for v, w in graph[u]:
            if not visited[v]:
                heapq.heappush(min_heap, (w, v))
    return mst_weight

# Example usage
# Graph as adjacency list: graph[u] = [(v1, w1), (v2, w2), ...]
graph = {
    0: [(1, 4), (2, 1)],
    1: [(0, 4), (2, 3), (3, 2)],
    2: [(0, 1), (1, 3), (3, 5)],
    3: [(1, 2), (2, 5)]
}
print("Prim's MST weight:", prim(graph))
