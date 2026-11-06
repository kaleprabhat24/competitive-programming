# Miami GP Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-06 |

---

## Problem Statement

### Miami GP

Chef has finally got the chance of his lifetime to drive in the F1F1F1 tournament. But, there is one problem. Chef did not know about the 107% rule and now he is worried whether he will be allowed to race in the main event or not.

Given the fastest finish time as XXX seconds and Chef's finish time as YYY seconds, determine whether Chef will be allowed to race in the main event or not.

Note that, Chef will only be allowed to race if his finish time is within **107%** of the fastest finish time.

### Input Format

- First line will contain TTT, number of testcases. Then the testcases follow.

- Each testcase contains of a single line of input, two space separated integers XXX and YYY denoting the fastest finish time and Chef's finish time respectively.

### Output Format

For each test case, output YES\texttt{YES}YES if Chef will be allowed to race in the main event, else output NO\texttt{NO}NO.

You may print each character of the string in uppercase or lowercase (for example, the strings YeS\texttt{YeS}YeS, yEs\texttt{yEs}yEs, yes\texttt{yes}yes and YES\texttt{YES}YES will all be treated as identical).

### Constraints

- 1≤T≤2⋅1041 \leq T \leq 2\cdot 10^41≤T≤2⋅104

- 1≤X≤Y≤2001 \leq X \leq Y \leq 2001≤X≤Y≤200

### Sample 1:

Input

Output

```
4
1 2
15 16
15 17
100 107

```

```
NO
YES
NO
YES

```

### Explanation:

**Test case 111:** The fastest car finished in 111 second. Thus, Chef should have finished on or before 1.071.071.07 seconds to ensure qualification but he finished in 222 seconds. Hence, Chef will not be allowed to race in the main event.

**Test case 222:** The fastest car finished in 151515 seconds. Thus, Chef should have finished on or before 16.0516.0516.05 seconds to ensure qualification and he managed to finish in 161616 seconds. Hence, Chef will be allowed to race in the main event.

**Test case 333:** The fastest car finished in 151515 seconds. Thus, Chef should have finished on or before 16.0516.0516.05 seconds to ensure qualification but he finished in 171717 seconds. Hence, Chef will not be allowed to race in the main event.

**Test case 444:** The fastest car finished in 100100100 seconds. Thus, Chef should have finished on or before 107107107 seconds to ensure qualification and he finished just in time for qualification. Hence, Chef will be allowed to race in the main event.
