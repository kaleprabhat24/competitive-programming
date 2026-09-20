# Multivitamin Tablets Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-20 |

---

## Problem Statement

### Multivitamin Tablets

The doctor prescribed Chef to take a multivitamin tablet 333 times a day for the next XXX days.

Chef already has YYY multivitamin tablets.

Determine if Chef has enough tablets for these XXX days or not.

### Input Format

- The first line contains a single integer TTT — the number of test cases. Then the test cases follow.

- The first and only line of each test case contains two space-separated integers XXX and YYY — the number of days Chef needs to take tablets and the number of tablets Chef already has.

### Output Format

For each test case, output `YES` if Chef has enough tablets for these XXX days. Otherwise, output `NO`.

You may print each character of `YES` and `NO` in uppercase or lowercase (for example, `yes`, `yEs`, `Yes` will be considered identical).

### Constraints

- 1≤T≤20001 \leq T \leq 20001≤T≤2000

- 1≤X≤1001 \le X \le 1001≤X≤100

- 0≤Y≤10000 \le Y \le 10000≤Y≤1000

### Sample 1:

Input

Output

```
4
1 10
12 0
10 29
10 30

```

```
YES
NO
NO
YES

```

### Explanation:

**Test Case 1:** Chef has 101010 tablets and Chef needs 333 tablets for 111 day. Therefore Chef has enough tablets.

**Test Case 2:** Chef has 000 tablets and Chef needs 363636 tablets for 121212 days. Therefore Chef does not have enough tablets.

**Test Case 3:** Chef has 292929 tablets and Chef needs 303030 tablets for 101010 days. Therefore Chef does not have enough tablets.

**Test Case 4:** Chef has 303030 tablets and Chef needs 303030 tablets for 101010 days. Therefore Chef has enough tablets.
