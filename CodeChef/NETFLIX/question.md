# Netflix Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-11 |

---

## Problem Statement

### Netflix

Alice, Bob, and Charlie are contributing to buy a Netflix subscription. However, Netfix allows only two users to share a subscription.

Given that Alice, Bob, and Charlie have A,B,A, B,A,B, and CCC rupees respectively and a Netflix subscription costs XXX rupees, find whether any two of them can contribute to buy a subscription.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case contains four space-separated integers A,B,C,A, B, C,A,B,C, and XXX — the amount that Alice, Bob, and Charlie have, and the cost of a Netflix subscription respectively.

### Output Format

For each test case, output `YES`, if any two of Alice, Bob, and Charlie can contribute to buy a Netflix subscription or `NO` otherwise.

You may print each character in uppercase or lowercase. For example, `NO`, `no`, `No`, and `nO` are all considered identical.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤A,B,C,X≤1001 \leq A, B, C, X \leq 1001≤A,B,C,X≤100

### Sample 1:

Input

Output

```
4
1 1 1 3
2 3 1 5
4 2 3 4
2 1 4 7

```

```
NO
YES
YES
NO

```

### Explanation:

**Test case 111:** No two people can contribute to collect enough money to buy a Netflix subscription.

**Test case 222:** Alice and Bob can contribute and collect a total of 555 rupees which is enough to buy a Netflix subscription of 555 rupees.

**Test case 333:** One possible way is, Bob and Charlie can contribute and collect a total of 555 rupees which is enough to buy a Netflix subscription of 444 rupees.

Note that there are other possible ways as well.

**Test case 444:** No two people can contribute to collect enough money to buy a Netflix subscription.
