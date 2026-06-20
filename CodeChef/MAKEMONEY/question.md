# Make Money Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-20 |

---

## Problem Statement

### Make Money

Chef has NNN bags and an integer XXX. The ithi^{th}ith bag contains AiA_iAi​ coins such that Ai≤XA_i \leq XAi​≤X.

In one operation, Chef can:

- Pick any bag and increase its coins to XXX. Formally, if he choses the ithi^{th}ith bag, he can set Ai=XA_i = XAi​=X.

Given that the cost of performing **each** operation is CCC (C≤X)(C \leq X)(C≤X) coins and Chef can perform the above operation any (possibly zero) number of times, determine the **maximum** value of

(∑i=1NAi)(\sum_{i=1}^N A_i)(∑i=1N​Ai​) −-− (total cost paid by Chef),

if Chef performs the operations optimally.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of multiple lines of input.

The first line of each test case contains three space-separated integers NNN, XXX, and CCC — the number of bags, maximum limit of coins on each bag and cost of each operation respectively.

- The next line contains NNN space-separated integers A1,A2,…,ANA_1, A_2, \dots, A_NA1​,A2​,…,AN​ - denoting the number of coins in each bag.

### Output Format

For each test case, output the maximum value of ∑i=1NAi\sum_{i=1}^N A_i∑i=1N​Ai​ −-− total cost paid by Chef.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤N≤1001 \leq N \leq 1001≤N≤100

- 1≤C≤X≤1001 \leq C \leq X \leq 1001≤C≤X≤100

- 1≤Ai≤X1 \leq A_i \leq X1≤Ai​≤X

### Sample 1:

Input

Output

```
3
5 5 2
1 2 3 4 5
3 4 4
1 1 1
5 3 2
3 2 3 1 1

```

```
18
3
10

```

### Explanation:

**Test case 111:** It is optimal for Chef to perform 222 operations:

- Operation 111: Choose i=1i = 1i=1 and set A1=5A_1 = 5A1​=5 by using 222 coins.

- Operation 222: Choose i=2i = 2i=2 and set A2=5A_2 = 5A2​=5 by using 222 coins.

The final array is A=[5,5,3,4,5]A = [5, 5, 3, 4, 5]A=[5,5,3,4,5] and the total cost is 2+2=42+2 = 42+2=4. Thus, the value of ∑i=1NAi\sum_{i=1}^N A_i∑i=1N​Ai​ −-− total cost is (5+5+3+4+5)−4=22−4=18(5+5+3+4+5) - 4 = 22-4 = 18(5+5+3+4+5)−4=22−4=18.

**Test case 222:** It is optimal for Chef to perform 000 operations. Thus, the final array remains [1,1,1][1, 1, 1][1,1,1] and the cost is 000. The value of ∑i=1NAi\sum_{i=1}^N A_i∑i=1N​Ai​ −-− total cost is (1+1+1)−0=3(1+1+1) - 0 = 3(1+1+1)−0=3.

**Test case 333:** It is optimal for Chef to perform 000 operations. Thus, the final array remains [3,2,3,1,1][3, 2, 3, 1, 1][3,2,3,1,1] and the cost is 000. The value of ∑i=1NAi\sum_{i=1}^N A_i∑i=1N​Ai​ −-− total cost is (3+2+3+1+1)−0=10(3+2+3+1+1) - 0 = 10(3+2+3+1+1)−0=10.
