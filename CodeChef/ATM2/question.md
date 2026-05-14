# ATM Machine Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-14 |

---

## Problem Statement

### ATM Machine

There is an ATM machine. Initially, it contains a total of KKK units of money. NNN people (numbered 111 through NNN) want to withdraw money; for each valid iii, the iii-th person wants to withdraw AiA_iAi​ units of money.

The people come in and try to withdraw money one by one, in the increasing order of their indices. Whenever someone tries to withdraw money, if the machine has at least the required amount of money, it will give out the required amount. Otherwise, it will throw an error and not give out anything; in that case, this person will return home directly without trying to do anything else.

For each person, determine whether they will get the required amount of money or not.

### Input

- The first line of the input contains a single integer TTT denoting the number of test cases. The description of TTT test cases follows.

- The first line of each test case contains two space-separated integers NNN and KKK.

- The second line contains NNN space-separated integers A1,A2,…,ANA_1, A_2, \dots, A_NA1​,A2​,…,AN​.

### Output

For each test case, print a single line containing a string with length NNN. For each valid iii, the iii-th character of this string should be '1' if the iii-th person will successfully withdraw their money or '0' otherwise.

### Constraints

- 1≤T≤1001 \le T \le 1001≤T≤100

- 1≤N≤1001 \le N \le 1001≤N≤100

- 1≤Ai≤1,000,0001 \le A_i \le 1,000,0001≤Ai​≤1,000,000 for each valid iii

- 1≤K≤1,000,0001 \le K \le 1,000,0001≤K≤1,000,000

### Sample 1:

Input

Output

```
2
5 10
3 5 3 2 1
4 6
10 8 6 4
```

```
11010
0010
```

### Explanation:

**Example case 1:** The ATM machine initially contains 101010 units of money. The first person comes and withdraws 333 units, so the amount remaining in the machine is 777. Then the second person withdraws 555 units and the remaining amount is 222. The third person wants to withdraw 333 units, but since there are only 222 units of money in the machine, it throws an error and the third person must leave without getting anything. Then the fourth person withdraws 222 units, which leaves nothing in the machine, so the last person does not get anything.

**Example case 2:** The ATM machine initially contains 666 units of money, so it cannot give anything to the first and second person. When the third person comes, it gives them all the money it has, so the last person does not get anything either.
