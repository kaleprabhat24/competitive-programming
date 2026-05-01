# Chef Finds Minimum Path Practice Problem in Dynamic programming

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-01 |

---

## Problem Statement

### Chef Finds Minimum Path

Chef has a grid gridgridgrid filled with non-negative numbers and wants to find a path from the top-left corner to the bottom-right corner that minimizes the sum of all numbers along the path. 

Chef can only move either down or right at any point in time. Help Chef determine the minimum possible sum for such a path.

## Function Declaration

### Function Name

calculateMinimumPathSumcalculateMinimumPathSumcalculateMinimumPathSum - This function calculates the minimum path sum from the top-left to the bottom-right corner of a grid by moving only down or right.

### Parameters

- gridgridgrid : A 2D matrix representing the grid of non-negative integers.

- Each element in numberGridnumberGridnumberGrid represents the cost or value at that grid cell.

### Return Value

- Returns a number representing the minimum sum path value.

- The return value is the smallest sum of numbers along a path from the top-left to bottom-right cell.

- The path can only move either down or right at any point in time.

## Constraints

- 1≤T≤101 \leq T \leq 101≤T≤10

- 1≤rowCount≤2001 \leq rowCount \leq 2001≤rowCount≤200

- 0≤numberGrid[i][j]≤2000 \leq numberGrid[i][j] \leq 2000≤numberGrid[i][j]≤200

- The gridgridgrid can be either rectangle or square.

### Input Format

- First line contains the TTT - test cases.

- The first line contains rowCountrowCountrowCount — the number rows in Chef's grid.

- The next rowCountrowCountrowCount lines each contain integers representing the values in gridgridgrid.

### Output Format

- Print a single integer — the minimum sum of numbers along a path from the top-left to the bottom-right corner of the grid, moving only down or right.

### Sample 1:

Input

Output

```
2
2
[1 2 3]
[4 5 6]
3
[10 1 10]
[1 10 1]
[10 1 10]
```

```
12
32
```

### Explanation:

- For the first test case, the minimum path is 1 -> 2 -> 3 -> 6 with sum 12.

- For the second test case, the minimum path is 10 -> 1 -> 10 -> 1 -> 10 with sum 32.

### Sample 2:

Input

Output

```
2
2
[0 0]
[0 0]
3
[7 2 3]
[1 0 4]
[2 1 0]
```

```
0
9
```

### Explanation:

- For the first test case, all values are zero, so the minimum path sum from top-left to bottom-right is 0.

- In the second test case, the minimum path is 7 -> 1 -> 0 -> 1 -> 0, summing up to 9.
