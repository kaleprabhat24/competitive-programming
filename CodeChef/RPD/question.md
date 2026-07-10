# Easy Math Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-07-10 |

---

## Problem Statement

### Easy Math

Chef is attending math classes. On each day, the teacher gives him homework. Yesterday, the teacher gave Chef a sequence of positive integers and asked him to find the maximum product of two different elements of this sequence. This homework was easy for Chef, since he knew that he should select the biggest two numbers.

However, today, the homework is a little bit different. Again, Chef has a sequence of positive integers A1,A2,…,ANA_1, A_2, \ldots, A_NA1​,A2​,…,AN​, but he should find two different elements of this sequence such that the sum of digits (in base 101010) of their product is maximum possible.

Chef thought, mistakenly, that he can still select the two largest elements and compute the sum of digits of their product. Show him that he is wrong by finding the correct answer ― the maximum possible sum of digits of a product of two different elements of the sequence AAA.

### Input

- The first line of the input contains a single integer TTT denoting the number of test cases. The description of TTT test cases follows.

- The first line of the input contains a single integer NNN.

- The second line contains NNN space-separated integers A1,A2,…,ANA_1, A_2, \ldots, A_NA1​,A2​,…,AN​.

### Output

For each test case, print a single line containing one integer ― the maximum sum of digits.

### Constraints

- 1≤T≤1001 \le T \le 1001≤T≤100

- 2≤N≤1002 \le N \le 1002≤N≤100

- 1≤Ai≤1041 \le A_i \le 10^41≤Ai​≤104 for each valid iii

### Subtasks

**Subtask #1 (100 points):** original constraints

### Sample 1:

Input

Output

```
3
2
2 8
3 
8 2 8
3
9 10 11
```

```
7
10
18
```

### Explanation:

**Example case 1:** The only two numbers Chef can choose are 222 and 888. Their product is 161616 and the sum of digits of 161616 is 777.

**Example case 2:** Chef can choose 888 and 888; their product is 646464. Note that it is allowed to choose two different elements with the same value.

**Example case 3:** Chef can choose 999 and 111111. Their product is 999999 and the sum of its digits is 181818. Note that choosing 101010 and 111111 will result in a larger product (110110110), but the sum of its digits is just 222.
