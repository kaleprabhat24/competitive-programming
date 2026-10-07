# Fill the Bucket Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-10-07 |

---

## Problem Statement

### Fill the Bucket

Chef has a bucket having a capacity of KKK liters. It is already filled with XXX liters of water.

Find the **maximum** amount of extra water in liters that Chef can fill in the bucket without overflowing.

### Input Format

- The first line will contain TTT - the number of test cases. Then the test cases follow.

- The first and only line of each test case contains two space separated integers KKK and XXX - as mentioned in the problem.

### Output Format

For each test case, output in a single line, the amount of extra water in liters that Chef can fill in the bucket without overflowing.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X<K≤10001 \leq X \lt K \leq 10001≤X<K≤1000

### Sample 1:

Input

Output

```
2
5 4
15 6

```

```
1
9

```

### Explanation:

**Test Case 111:** The capacity of the bucket is 555 liters but it is already filled with 444 liters of water. Adding 111 more liter of water to the bucket fills it to (4+1)=5(4+1) = 5(4+1)=5 liters. If we try to fill more water, it will overflow.

**Test Case 222:** The capacity of the bucket is 151515 liters but it is already filled with 666 liters of water. Adding 999 more liters of water to the bucket fills it to (6+9)=15(6+9) = 15(6+9)=15 liters. If we try to fill more water, it will overflow.
