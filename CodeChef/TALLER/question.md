# Who is taller! Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-08-05 |

---

## Problem Statement

### Who is taller!

Alice and Bob were having an argument about which of them is taller than the other. Charlie got irritated by the argument, and decided to settle the matter once and for all.

Charlie measured the heights of Alice and Bob, and got to know that Alice's height is XXX centimeters and Bob's height is YYY centimeters. Help Charlie decide who is taller.

It is guaranteed that X≠YX \neq YX=Y.

### Input Format

- The first line of input will contain an integer TTT — the number of test cases. The description of TTT test cases follows.

- The first and only line of each test case contains two integers XXX and YYY, as described in the problem statement.

### Output Format

For each test case, output on a new line A\texttt{A}A if Alice is taller than Bob, else output B\texttt{B}B.
The output is case insensitive, i.e, both A\texttt{A}A and a\texttt{a}a will be accepted as correct answers when Alice is taller.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 100≤X,Y≤200100 \leq X, Y \leq 200100≤X,Y≤200

- X≠YX \neq YX=Y

### Sample 1:

Input

Output

```
2
150 160
160 150
```

```
B
A
```

### Explanation:

**Test case 111**: In this case, 150<160150 < 160150<160 so Bob is taller than Alice.

**Test case 222**: In this case, 160>150160 > 150160>150 so Alice is taller than Bob.
