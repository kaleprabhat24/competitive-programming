# Sums in a Triangle Practice Problem in Dynamic programming

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-22 |

---

## Problem Statement

### Sums in a Triangle

Given an integer NNN, let us consider a triangle of numbers of NNN lines in which a number a11a_{11}a11​ appears in the first line, two numbers a21a_{21}a21​ and a22a_{22}a22​ appear in the second line, three numbers a31a_{31}a31​, a32a_{32}a32​ and a33a_{33}a33​ appear in the third line, etc. In general, iii numbers ai1,ai2…aiia_{i1}, a_{i2} \dots a_{ii}ai1​,ai2​…aii​ appear in the ithi^{th}ith line for all 1≤i≤N1 \leq i \leq N1≤i≤N. Develop a program that will compute the largest of the sums of numbers that appear on the paths starting from the top towards the base, so that:

- on each path the next number is located on the row below, more precisely either directly below or below and one place to the right.

**Warning:** large Input/Output data, be careful with certain languages

### Input Format

- The first line of the input contains an integer TTT, the number of test cases.

- Then T test cases follow. Each test case starts with an integer NNN, the number of rows. Then NNN lines follow where in ithi^{th}ith line contains iii integers ai1,ai2…aiia_{i1}, a_{i2} \dots a_{ii}ai1​,ai2​…aii​.

### Output Format

For each test case print the maximum path sum in a separate line.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤N<1001 \leq N \lt 1001≤N<100

- 0≤aij<1000 \leq a_{ij} \lt 1000≤aij​<100

### Sample 1:

Input

Output

```
2
3
1
2 1
1 2 3
4
1
1 2
4 1 2
2 3 1 1

```

```
5
9
```

### Explanation:

**Test case 1:**

There are a total of 444 paths

- (1,1)→(2,1)→(3,1)(1,1) \rightarrow (2, 1) \rightarrow (3, 1)(1,1)→(2,1)→(3,1) with sum equal to 444.

- (1,1)→(2,1)→(3,2)(1,1) \rightarrow (2, 1) \rightarrow (3, 2)(1,1)→(2,1)→(3,2) with sum equal to 555.

- (1,1)→(2,2)→(3,2)(1,1) \rightarrow (2, 2) \rightarrow (3, 2)(1,1)→(2,2)→(3,2) with sum equal to 444.

- (1,1)→(2,2)→(3,3)(1,1) \rightarrow (2, 2) \rightarrow (3, 3)(1,1)→(2,2)→(3,3) with sum equal to 555.

Therefore, the maximum sum over all paths is equal to 555.

**Test case 2:**

There are a total of 888 paths

- (1,1)→(2,1)→(3,1)→(4,1)(1,1) \rightarrow (2, 1) \rightarrow (3, 1) \rightarrow (4, 1)(1,1)→(2,1)→(3,1)→(4,1) with sum equal to 888.

- (1,1)→(2,1)→(3,1)→(4,2)(1,1) \rightarrow (2, 1) \rightarrow (3, 1) \rightarrow (4, 2)(1,1)→(2,1)→(3,1)→(4,2) with sum equal to 999.

- (1,1)→(2,1)→(3,2)→(4,2)(1,1) \rightarrow (2, 1) \rightarrow (3, 2) \rightarrow (4, 2)(1,1)→(2,1)→(3,2)→(4,2) with sum equal to 666.

- (1,1)→(2,1)→(3,2)→(4,3)(1,1) \rightarrow (2, 1) \rightarrow (3, 2) \rightarrow (4, 3)(1,1)→(2,1)→(3,2)→(4,3) with sum equal to 444.

- (1,1)→(2,2)→(3,2)→(4,2)(1,1) \rightarrow (2, 2) \rightarrow (3, 2) \rightarrow (4, 2)(1,1)→(2,2)→(3,2)→(4,2) with sum equal to 777.

- (1,1)→(2,2)→(3,2)→(4,3)(1,1) \rightarrow (2, 2) \rightarrow (3, 2) \rightarrow (4, 3)(1,1)→(2,2)→(3,2)→(4,3) with sum equal to 555.

- (1,1)→(2,2)→(3,3)→(4,3)(1,1) \rightarrow (2, 2) \rightarrow (3, 3) \rightarrow (4, 3)(1,1)→(2,2)→(3,3)→(4,3) with sum equal to 666.

- (1,1)→(2,2)→(3,3)→(4,4)(1,1) \rightarrow (2, 2) \rightarrow (3, 3) \rightarrow (4, 4)(1,1)→(2,2)→(3,3)→(4,4) with sum equal to 666.

Therefore, the maximum sum over all paths is equal to 999.
