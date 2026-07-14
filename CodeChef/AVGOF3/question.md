# Average of Three Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-07-14 |

---

## Problem Statement

### Average of Three

It is Chef's birthday. You know that Chef's favourite number is XXX. You also know that Chef loves averages. Therefore you decide it's best to gift Chef 333 integers A1,A2,A3A_1, A_2, A_3A1​,A2​,A3​, such that:

- The mean of A1,A2A_1, A_2A1​,A2​ and A3A_3A3​ is XXX.

- 1≤A1,A2,A3≤10001 \le A_1, A_2, A_3 \le 10001≤A1​,A2​,A3​≤1000.

- A1,A2A_1, A_2A1​,A2​ and A3A_3A3​ are **distinct**.

Output any suitable A1,A2A_1, A_2A1​,A2​ and A3A_3A3​ which you could gift to Chef.

As a reminder, the mean of three numbers P,Q,RP, Q, RP,Q,R is defined as: mean(P,Q,R)=P+Q+R3mean(P, Q, R) = \dfrac{P + Q + R}{3}mean(P,Q,R)=3P+Q+R​.

For example, mean(2,3,5)=2+3+53=103=3.333ˉmean(2, 3, 5) = \frac{2 + 3 + 5}{3} = \frac{10}{3} = 3.33\bar{3}mean(2,3,5)=32+3+5​=310​=3.333ˉ, mean(2,2,5)=2+2+53=93=3mean(2, 2, 5) = \frac{2 + 2 + 5}{3} = \frac{9}{3} = 3mean(2,2,5)=32+2+5​=39​=3.

### Input Format

- The first line of input contains a single integer TTT, denoting the number of test cases. The description of TTT test cases follows.

- The first and only line of each test case contains one integer XXX — Chef's favourite number.

### Output Format

For each test case, one line containing 333 space-separated integers — A1,A2A_1, A_2A1​,A2​, and A3A_3A3​, which satisfy the given conditions. If there are multiple possible answers you may output **any** of them.

It can be shown that an answer always exists, under the given constraints.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 2≤X≤1002 \leq X \leq 1002≤X≤100

### Sample 1:

Input

Output

```
3
3
5
5

```

```
1 3 5
1 6 8
3 5 7

```

### Explanation:

**Test Case 111:** mean(1,3,5)=1+3+53=93=3mean(1, 3, 5) = \frac{1 + 3 + 5}{3} = \frac{9}{3} = 3mean(1,3,5)=31+3+5​=39​=3

**Test Case 222:** mean(1,6,8)=1+6+83=153=5mean(1, 6, 8) = \frac{1 + 6 + 8}{3} = \frac{15}{3} = 5mean(1,6,8)=31+6+8​=315​=5

**Test Case 333:** mean(3,5,7)=3+5+73=153=5mean(3, 5, 7) = \frac{3 + 5 + 7}{3} = \frac{15}{3} = 5mean(3,5,7)=33+5+7​=315​=5
