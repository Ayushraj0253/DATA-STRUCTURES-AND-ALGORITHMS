# Searching Algorithms

Searching algorithms are designed to retrieve information stored within some data structure or calculated in the search space of a problem domain.

## Key Concepts
- **Linear Search**: Checks every element sequentially — $O(n)$ time.
- **Binary Search**: Efficient search on sorted arrays by repeatedly halving the search space — $O(\log n)$ time.
- **Overflow-safe Midpoint**: Calculating `mid = start + (end - start) / 2` avoids potential integer overflow compared to `(start + end) / 2`.

## Implemented Solutions

| Problem / Algorithm | Java File | Time Complexity | Space Complexity |
| :--- | :--- | :--- | :--- |
| **Binary Search (Iterative)** | [BinarySearch.java](BinarySearch.java) | $O(\log n)$ | $O(1)$ |
