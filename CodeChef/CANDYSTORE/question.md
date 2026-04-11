# Candy Store Practice Problem in Basic Math

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-11 |

---

## Problem Statement

### Candy Store

Chef has started working at the candy store. The store has 100100100 chocolates in total.

Chef’s daily goal is to sell XXX chocolates. For each chocolate sold, he will get 111 rupee.
However, if Chef exceeds his daily goal, he gets 222 rupees per chocolate for each **extra** chocolate.

If Chef sells YYY chocolates in a day, find the total amount he made.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of two space-separated integers XXX and YYY — the daily goal of Chef, and the number of chocolates he actually sells.

### Output Format

For each test case, output on a new line the total amount Chef made in a day.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X,Y≤101 \leq X, Y \leq 101≤X,Y≤10

### Sample 1:

Input

Output

```
4
3 1
5 5
4 7
2 3

```

```
1
5
10
4

```

### Explanation:

**Test case 111:** Chef's daily goal was 333. Since he sold only 111 chocolate, he'll get only 111 rupee.

**Test case 222:** Chef's daily goal was 555. Since he sold 555 chocolates, he'll get 555 rupees.

**Test case 333:** Chef's daily goal was 444. Since he sold 777 chocolate, he'll get 444 rupees for the 444 chocolates as his daily goal and 222 rupees per chocolate for the extra 333 chocolates. The total amount he gets is 4+3⋅2=104+3\cdot 2 = 104+3⋅2=10.

**Test case 444:** Chef's daily goal was 222. Since he sold 333 chocolate, he'll get 222 rupees for the 222 chocolates as his daily goal and 222 rupees per chocolate for the extra 111 chocolate. The total amount he gets is 2+1⋅2=42+1\cdot 2 = 42+1⋅2=4.
