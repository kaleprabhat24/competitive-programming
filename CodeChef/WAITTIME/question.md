# Waiting Time Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-08-27 |

---

## Problem Statement

### Waiting Time

Chef is eagerly waiting for a piece of information. His secret agent told him that this information would be revealed to him after KKK weeks.

XXX days have already passed and Chef is getting restless now. Find the number of **remaining** days Chef has to wait for, to get the information.

It is guaranteed that the information has not been revealed to the Chef yet.

### Input Format

- The first line of input will contain an integer TTT — the number of test cases. The description of TTT test cases follows.

- The first and only line of each test case contains two space-separated integers KKK and XXX, as described in the problem statement.

### Output Format

For each test case, output the number of remaining days that Chef will have to wait for.

### Constraints

- 1≤T≤5001 \leq T \leq 5001≤T≤500

- 1≤K≤101 \leq K \leq 101≤K≤10

- 1≤X<7⋅K1 \leq X \lt 7\cdot K1≤X<7⋅K

### Sample 1:

Input

Output

```
4
1 5
1 6
1 1
1 2
```

```
2
1
6
5

```

### Explanation:

**Test case 111:** The information will be revealed to the Chef after 111 week, which is equivalent to 777 days. Chef has already waited for 555 days, so he needs to wait for 222 more days in order to get the information.

**Test case 222:** The information will be revealed to the Chef after 111 week, which is equivalent to 777 days. Chef has already waited for 666 days, so he needs to wait for 111 more day in order to get the information.

**Test case 333:** The information will be revealed to the Chef after 111 week, which is equivalent to 777 days. Chef has already waited for 111 day, so he needs to wait for 666 more days in order to get the information.

**Test case 444:** The information will be revealed to the Chef after 111 week, which is equivalent to 777 days. Chef has already waited for 222 days, so he needs to wait for 555 more days in order to get the information.
