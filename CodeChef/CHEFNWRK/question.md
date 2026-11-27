# Chef and Work Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-27 |

---

## Problem Statement

### Chef and Work

Chef has NNN small boxes arranged on a line from 111 to NNN. For each valid iii, the weight of the iii-th box is WiW_iWi​. Chef wants to bring them to his home, which is at the position 000. He can hold any number of boxes at the same time; however, the total weight of the boxes he's holding must not exceed K at any time, and he can only pick the ith box if all the boxes between Chef's home and the ith box have been either moved or picked up in this trip.

Therefore, Chef will pick up boxes and carry them home in one or more round trips. Find the smallest number of round trips he needs or determine that he cannot bring all boxes home.

### Input

- The first line of the input contains a single integer TTT denoting the number of test cases. The description of TTT test cases follows.

- The first line of each test case contains two space-separated integers NNN and KKK.

- The second line contains NNN space-separated integers W1,W2,…,WNW_1, W_2, \ldots, W_NW1​,W2​,…,WN​.

### Output

For each test case, print a single line containing one integer ― the smallest number of round trips or −1-1−1 if it is impossible for Chef to bring all boxes home.

### Constraints

- 1≤T≤1001 \le T \le 1001≤T≤100

- 1≤N,K≤1031 \le N, K \le 10^31≤N,K≤103

- 1≤Wi≤1031 \le W_i \le 10^31≤Wi​≤103 for each valid iii

### Sample 1:

Input

Output

```
4
1 1 
2
2 4
1 1
3 6
3 4 2
3 6
3 4 3
```

```
-1
1
2
3
```

### Explanation:

**Example case 1:** Since the weight of the box higher than KKK, Chef can not carry that box home in any number of the round trip.

**Example case 2:** Since the sum of weights of both boxes is less than KKK, Chef can carry them home in one round trip.

**Example case 3:** In the first round trip, Chef can only pick up the box at position 111. In the second round trip, he can pick up both remaining boxes at positions 222 and 333.

**Example case 4:** Chef can only carry one box at a time, so three round trips are required.
