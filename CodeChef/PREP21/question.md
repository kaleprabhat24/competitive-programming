# Evaluate Expression in Stacks and Queues

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-18 |

---

## Problem Statement

### Evaluate Expression

You are given a string SSS consisting of NNN characters. Each character is either a digit from 000 to 999 or an operator out of `+`, `-`, and `*`.

Consider the string to be in reverse polish notation consisting of **digits** (from 111 to 999) as the operands and `+`, `-`, or `*` as the operators and evaluate the expression.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of multiple lines of input.

The first line of each test case contains a single integer NNN — the number of characters in the string.

- The next line consists of NNN characters, where the ithi^{th}ith character is either a digit from 000 to 999 or an operator out of `+`, `-`, and `*`. Consider the string to be in reverse polish notation.

### Output Format

For each test case, output on a new line, an integer denoting the evaluated expression.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤N≤1051 \leq N \leq 10^51≤N≤105

- The sum of NNN over all test cases won't exceed 2⋅1052\cdot 10^52⋅105.

### Sample 1:

Input

Output

```
4
3
73-
7
04*3*0-
3
27*
7
703*-9-

```

```
4
0
14
-2

```

### Explanation:

**Test case 111:** The postfix expression corresponds to 7−37-37−3 which is equal to 444.

**Test case 222:** The postfix expression corresponds to ((0×4)×3)−0)((0\times 4)\times 3) - 0)((0×4)×3)−0) which is equal to 000.

**Test case 333:** The postfix expression corresponds to 2×72\times 72×7 which is equal to 141414.

**Test case 444:** The postfix expression corresponds to (7−(0×3))−9)(7 - (0\times 3)) - 9)(7−(0×3))−9) which is equal to −2-2−2.
