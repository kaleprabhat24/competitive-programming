# Bidding Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-02 |

---

## Problem Statement

### Bidding

Alice, Bob and Charlie are bidding for an artifact at an auction.

Alice bids AAA rupees, Bob bids BBB rupees, and Charlie bids CCC rupees (where AAA, BBB, and CCC are **distinct**).

According to the rules of the auction, the person who bids the **highest** amount will win the auction.

Determine who will win the auction.

### Input Format

- The first line contains a single integer TTT — the number of test cases. Then the test cases follow.

- The first and only line of each test case contains three integers AAA, BBB, and CCC, — the amount bid by Alice, Bob, and Charlie respectively.

### Output Format

For each test case, output who (out of `Alice`, `Bob`, and `Charlie`) will win the auction.

You may print each character of `Alice`, `Bob`, and `Charlie` in uppercase or lowercase (for example, `ALICE`, `aliCe`, `aLIcE` will be considered identical).

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤A,B,C≤10001 \leq A, B, C \leq 10001≤A,B,C≤1000

- AAA, BBB, and CCC are **distinct**.

### Sample 1:

Input

Output

```
4
200 100 400
155 1000 566
736 234 470
124 67 2

```

```
Charlie
Bob
Alice
Alice

```

### Explanation:

**Test Case 111:** Charlie wins the auction since he bid the highest amount.

**Test Case 222:** Bob wins the auction since he bid the highest amount.

**Test Case 333:** Alice wins the auction since she bid the highest amount.

**Test Case 444:** Alice wins the auction since she bid the highest amount.
