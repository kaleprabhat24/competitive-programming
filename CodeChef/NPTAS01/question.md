# Chef Finds Falling Path Practice Problem in Dynamic programming

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-05 |

---

## Problem Statement

### Chef Finds Falling Path

Chef has found a square matrix filled with integers and wants to find a special path through it. This path, called a falling path, starts from any element in the first row and moves downwards row by row. 

At each step, Chef can move to the element directly below or diagonally adjacent (left or right) in the next row. Chef wants to calculate the minimum possible sum of the elements along such a falling path from the top row to the bottom row. 

Help Chef by writing a function that computes this minimum sum efficiently.

## Function Declaration

### Function Name

calculateMinFallingPathSumcalculateMinFallingPathSumcalculateMinFallingPathSum

### Parameters

- inputMatrixinputMatrixinputMatrix : A 2D square matrix representing the grid of integers. The dimensions of the matrix are `rowCount x columnCount`, where `rowCount == columnCount`.

### Return Value

- Returns an integer representing the minimum sum achievable from a falling path through the matrix.

## Constraints

- 1≤T≤101 \leq T \leq 101≤T≤10

- 1≤n=rowCount=columnCount≤1001 \leq n = \text{rowCount} = \text{columnCount} \leq 1001≤n=rowCount=columnCount≤100

- −100≤inputMatrix[i][j]≤100-100 \leq \text{inputMatrix}[i][j] \leq 100−100≤inputMatrix[i][j]≤100 for 0≤i,j<n0 \leq i, j < n0≤i,j<n

**The input and output formats given below are only if you want to test using custom inputs.**

### Input Format

## Input Format

- The first line contains a single integer TTT — the number of test cases.

- For each test case:

The first line contains an integer nnn — the size of the square matrix.

- The next nnn lines each contain nnn space-separated integers representing the rows of Chef's matrix.

### Output Format

- 

For each test case, print a single integer — the minimum sum of any falling path through Chef's matrix.

- 

The input and output formats given below are only if you want to test using custom inputs.

### Sample 1:

Input

Output

```
2
3
[1 2 3]
[4 5 6]
[7 8 9]
4
[10 10 10 10]
[5 5 5 5]
[1 1 1 1]
[0 0 0 0]
```

```
12
16
```

### Explanation:

- For the first test case, the minimum falling path is 1 -> 4 -> 7, summing to 12.

- For the second test case, the minimum path is 10 -> 5 -> 1 -> 0, totaling 16.
