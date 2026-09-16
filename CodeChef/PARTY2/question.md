# Chef gives Party Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-16 |

---

## Problem Statement

### Chef gives Party

Chef wants to give a burger party to all his NNN friends i.e. he wants to buy **one** burger for each of his friends.

The cost of each burger is XXX rupees while Chef has a total of KKK rupees.

Determine whether he has enough money to buy a burger for each of his friends or not.

### Input Format

- The first line contains a single integer TTT - the number of test cases. Then the test cases follow.

- The first and only line of each test case contains the three integers NNN, XXX, and KKK - the number of Chef's friends, the cost of each burger, and the total money Chef has, respectively.

### Output Format

For each test case, output `YES` if the Chef can give a party to all his NNN friends. Otherwise, output `NO`.

You may print each character of `YES` and `NO` in uppercase or lowercase (for example, `yes`, `yEs`, `Yes` will be considered identical).

### Constraints

- 1≤T≤10001 \le T \le 10001≤T≤1000

- 1≤N,X≤1001 \le N, X \le 1001≤N,X≤100

- 1≤K≤100001 \le K \le 100001≤K≤10000

### Sample 1:

Input

Output

```
4
5 10 70
5 10 40
10 40 400
14 14 150

```

```
YES
NO
YES
NO

```

### Explanation:

- 

**Test case 111:** Chef has 555 friends. The cost of buying a burger for each of them will be 10×5=5010 \times 5 = 5010×5=50 while Chef has 707070 rupees. Therefore, he can buy a burger for all of them.

- 

**Test case 222:** Chef has 555 friends. The cost of buying a burger for each of them will be 10×5=5010 \times 5 = 5010×5=50 while Chef has 404040 rupees. Therefore, he can **not** buy a burger for all of them.

- 

**Test case 333:** Chef has 101010 friends. The cost of buying a burger for each of them will be 40×10=40040 \times 10 = 40040×10=400 and Chef has 400400400 rupees. Therefore, he can buy a burger for all of them.

- 

**Test case 444:** Chef has 141414 friends. The cost of buying a burger for each of them will be 14×14=19614 \times 14 = 19614×14=196 while Chef has 150150150 rupees. Therefore, he can **not** buy a burger for all of them.
