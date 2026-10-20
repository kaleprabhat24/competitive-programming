# Tyre problem Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-10-20 |

---

## Problem Statement

### Tyre problem

There are NNN bikes and MMM cars on the road.

- Each bike has 222 tyres.

- Each car has 444 tyres.

Find the total number of tyres on the road.

### Input Format

- The first line will contain TTT - the number of test cases. Then the test cases follow.

- The first and only line of each test case contains two integers N,MN, MN,M.

### Output Format

For each test case, output in a single line,  the total number of tyres on the road.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 0≤N,M≤1000 \leq N, M \leq 1000≤N,M≤100

### Sample 1:

Input

Output

```
2
2 1
3 0

```

```
8
6

```

### Explanation:

**Test Case 111:** There are 222 bikes and 111 car. Each bike has 222 tyres, so there are 2⋅2=42\cdot 2 = 42⋅2=4 bike tyres. Similarly, each car has 444 tyres, so there are 1⋅4=41\cdot 4 = 41⋅4=4 car tyres. Adding the tyres of all vehicles, we get 4+4=84+4=84+4=8 tyres in total.

**Test Case 222:** There are 333 bikes and 000 cars. Each bike has 222 tyres, so there are 3⋅2=63\cdot 2 = 63⋅2=6 bike tyres. There are no cars, so there are 0⋅4=00\cdot 4 = 00⋅4=0 car tyres. Adding the tyres of all vehicles, we get 6+0=66+0=66+0=6 tyres in total.
