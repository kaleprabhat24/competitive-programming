# Bob at the Bank Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-02 |

---

## Problem Statement

### Bob at the Bank

Bob has an account in the Bobby Bank. His current account balance is WWW rupees.

Each month, the office in which Bob works deposits a fixed amount of XXX rupees to his account.

YYY rupees is deducted from Bob's account each month as bank charges.

Find his final account balance after ZZZ months. Note that the account balance can be negative as well.

### Input Format

- The first line will contain TTT, the number of test cases. Then the test cases follow.

- Each test case consists of a single line of input, containing four integers W,X,Y,W,X,Y,W,X,Y, and ZZZ — the initial amount, the amount deposited per month, the amount deducted per month, and the number of months.

### Output Format

For each test case, output in a single line the final balance in Bob's account after ZZZ months.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤W,X,Y,Z≤1041 \leq W,X,Y,Z \leq 10^41≤W,X,Y,Z≤104

### Sample 1:

Input

Output

```
3
100 11 1 10
999 25 36 9
2500 100 125 101

```

```
200
900
-25
```

### Explanation:

**Test case 111:** Bob's current account balance is 100100100. At the end of each month Bob gets Rs 111111 and pays Rs 111, thus gaining 101010 per month. Thus, at the end of 101010 months, Bob will have 100+10×10=200100 + 10 \times 10 = 200100+10×10=200.

**Test case 222:** Bob's current account balance is 999999999. At the end of each month Bob gets Rs 252525 and pays Rs 363636, thus losing 111111 per month. Thus, at the end of 999 months, Bob will have 999−11×9=900999 - 11 \times 9 = 900999−11×9=900.

**Test case 333:** Bob's current account balance is 250025002500. At the end of each month Bob gets Rs 100100100 and pays Rs 125125125, thus losing 252525 per month. Thus, at the end of 101101101 months, Bob will have 2500−25×101=−252500 - 25 \times 101 = -252500−25×101=−25.
