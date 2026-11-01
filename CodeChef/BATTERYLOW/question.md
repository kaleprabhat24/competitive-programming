# Battery Low Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-01 |

---

## Problem Statement

### Battery Low

Chef's phone shows a Battery Low notification if the battery level is 15%15 \%15% or less.

Given that the battery level of Chef's phone is X%X \%X%, determine whether it would show a Battery low notification.

### Input Format

- First line will contain TTT, number of test cases. Then the test cases follow.

- Each test case contains a single line of input, an integer XXX, denoting the battery level of the phone.

### Output Format

For each test case, output in a single line Yes\texttt{Yes}Yes, if the battery level is 15%15 \%15% or below. Otherwise, print No\text{No}No.

You may print each character of Yes\texttt{Yes}Yes and No\text{No}No in uppercase or lowercase (for example, YeS\texttt{YeS}YeS, YES\texttt{YES}YES, yes\texttt{yes}yes will be considered identical).

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X≤1001 \leq X \leq 1001≤X≤100

### Subtasks

**Subtask #1 (100 points):** original constraints

### Sample 1:

Input

Output

```
3
15
3
65
```

```
Yes
Yes
No
```

### Explanation:

**Test Case 1:** The battery level is 151515. Thus, it would show a battery low notification.

**Test Case 2:** The battery level is 333, which is less than 151515. Thus, it would show a battery low notification.

**Test Case 3:** The battery level is 656565, which is greater than 151515. Thus, it would not show a battery low notification.
