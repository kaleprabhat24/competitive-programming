# Lunchtime Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-13 |

---

## Problem Statement

### Lunchtime

Chef has his lunch only between 111 pm and 444 pm (both inclusive).

Given that the current time is XXX pm, find out whether it is *lunchtime* for Chef.

### Input Format

- The first line of input will contain a single integer TTT, the number of test cases. Then the test cases follow.

- Each test case contains a single line of input, containing one integer XXX.

### Output Format

For each test case, print in a single line YES\texttt{YES}YES if it is lunchtime for Chef. Otherwise, print NO\texttt{NO}NO.

You may print each character of the string in either uppercase or lowercase (for example, the strings YeS\texttt{YeS}YeS, yEs\texttt{yEs}yEs, yes\texttt{yes}yes and YES\texttt{YES}YES will all be treated as identical).

### Constraints

- 1≤T≤121 \leq T \leq 121≤T≤12

- 1≤X≤121 \leq X \leq 121≤X≤12

### Sample 1:

Input

Output

```
3
1
7
3
```

```
YES
NO
YES
```

### Explanation:

**Test case 111:** Lunchtime is between 111 pm and 444 pm (both inclusive). Since 111 pm lies within lunchtime, the answer is YES\texttt{YES}YES.

**Test case 222:** Lunchtime is between 111 pm and 444 pm (both inclusive). Since 777 pm lies outside lunchtime, the answer is NO\texttt{NO}NO.

**Test case 333:** Lunchtime is between 111 pm and 444 pm (both inclusive). Since 333 pm lies within lunchtime, the answer is YES\texttt{YES}YES.
