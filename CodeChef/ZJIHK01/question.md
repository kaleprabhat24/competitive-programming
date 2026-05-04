# Chef Counts Unique Paths Practice Problem in Dynamic programming

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-04 |

---

## Problem Statement

### Chef Counts Unique Paths

Chef has a robot that starts at the top-left corner of a grid and wants to reach the bottom-right corner. The grid contains some obstacles, marked as 1, while free spaces are marked as 0. 

Chef’s robot can only move either down or right at any point in time. Chef wants to know how many unique paths exist from start to finish without passing through any obstacles. 

Help Chef calculate the total number of such valid paths.

## Function Declaration

### Function Name

countUniquePathscountUniquePathscountUniquePaths - This function calculates the number of unique paths from the top-left to the bottom-right corner of a grid, considering obstacles.

### Parameters

- gridgridgrid : A 2D grid where each cell is either 0 (free space) or 1 (obstacle).

- The grid dimensions can vary, and the function must handle grids with obstacles blocking the path.

### Return Value

- Returns a number representing the total number of unique paths from start to finish.

- The output counts only valid paths that do not pass through obstacles.

- If path starts with an obstacle then there is no path that exists.

- If no path exists, the function returns 0.

## Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- Let nnn be the number of rows in gridgridgrid.

- 1≤n≤1001 \leq n \leq 1001≤n≤100

- Each element in gridgridgrid is either 0 or 1.

- Rows∗Column≤300Rows*Column \leq 300Rows∗Column≤300

- The answer will be less than or equal to 2×1092 \times 10^92×109.

- The gridgridgrid may or may not be a square.

**The input and output formats given below are only if you want to test using custom inputs.**

### Input Format

- The first line contains TTT number of test cases.

- The first line contains nnn — the number of rows of the grid.

- The next nnn lines each contain integers (0 or 1) representing the grid.

### Output Format

- Print a single number — the total number of unique paths Chef’s robot can take from the top-left corner to the bottom-right corner without crossing any obstacles.

- If no such path exists, print 0.

### Sample 1:

Input

Output

```
2
3
[0 0 1]
[0 0 0]
[1 0 0]
4
[0 1 0 0]
[0 0 1 0]
[1 0 0 0]
[0 0 0 0]
```

```
4
3
```

### Explanation:

- For the first test case, four paths avoid obstacles (cells with 1) by moving right, down, down, right.

- In the second test case, three distinct paths navigate around obstacles to reach the bottom-right corner.

### Sample 2:

Input

Output

```
1
2
[0 0]
[0 0]
```

```
2
```

### Explanation:

- For the 2x2 grid with no obstacles, there are 2 ways to reach the bottom-right corner: right then down, or down then right.

### Sample 3:

Input

Output

```
1
5
[0 0 0 0 0]
[0 1 1 1 0]
[0 1 0 1 0]
[0 1 0 0 0]
[0 0 0 1 0]
```

```
1
```

### Explanation:

- The grid blocks paths with 1s; only 1 ways avoid obstacles from top-left to bottom-right by moving around them.
