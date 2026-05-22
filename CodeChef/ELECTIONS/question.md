# Elections in Chefland Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-22 |

---

## Problem Statement

### Elections in Chefland

There are 101101101 citizens in Chefland. It is election time in Chefland and 333 parties, A,BA, BA,B, and CCC are contesting the elections. Party AAA receives XAX_AXA​ votes, party BBB receives XBX_BXB​ votes, and party CCC receives XCX_CXC​ votes.

The constitution of Chefland requires a particular party to receive a clear majority to form the government. A party is said to have a clear majority if it receives **strictly** greater than 505050 votes.

If any party has a clear majority, print the winning party (`A`, `B` or `C`). Otherwise, print `NOTA`.

### Input Format

- The first line of input contains a single integer TTT, denoting the number of test cases. The description of TTT test cases follows.

- The first and only line of each test case contains 333 space-separated integers — XAX_AXA​, XBX_BXB​, and XCX_CXC​.

### Output Format

For each test case, if any party has a clear majority, print the winning party (`A`, `B` or `C`). Otherwise, print `NOTA`.

You can print each letter of the string in any case (upper or lower) (for instance, strings `Nota`, `nOtA` and `notA` will be considered identical).

### Constraints

- 1≤T≤5001 \leq T \leq 5001≤T≤500

- 0≤XA,XB,XC≤1010 \leq X_A, X_B, X_C \leq 1010≤XA​,XB​,XC​≤101

- XA+XB+XC=101X_A + X_B + X_C = 101XA​+XB​+XC​=101

### Sample 1:

Input

Output

```
3
80 19 2
20 55 26
50 1 50

```

```
A
B
NOTA

```

### Explanation:

**Test Case 111:** Party AAA has received 808080 votes, which is strictly greater than 505050.

**Test Case 222:** Party BBB has received 555555 votes, which is strictly greater than 505050.

**Test Case 333:** None of the parties have received strictly more than 505050 votes.
