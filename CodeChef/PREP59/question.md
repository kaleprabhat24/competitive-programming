# Valid Parenthesis Practice Problem in Stacks and Queues

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-17 |

---

## Problem Statement

### Valid Parenthesis

If you are new to stacks and queues, or want a refresher on them, start with our Learn Stacks and Queues course

Give string a SSS consisting of only ((( and ))). Find whether SSS is a valid parenthesis string.

Note: A **valid parentheses** string is defined as:

- Empty string is valid.

- If PPP is valid, (P)(P)(P) is also valid.

- If PPP and QQQ are valid, PQPQPQ is also valid.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a single line of input, containing string SSS.

### Output Format

For each test case, output 111 if the given string is a valid parenthesis, or output 000 otherwise.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤∣S∣≤1051 \leq |S| \leq 10^51≤∣S∣≤105

- The sum of ∣S∣|S|∣S∣ over all test cases won't exceed 2⋅1052 \cdot 10^52⋅105.

### Sample 1:

Input

Output

```
3
()(())
(()()
))((

```

```
1
0
0

```

### Explanation:

**Test case 111**: ()(())()(())()(()) will be valid parenthesis.

**Test case 222**: (()()(()()(()() will not be valid parenthesis.

**Test case 333**: ))(())(())(( will not be valid parenthesis.
