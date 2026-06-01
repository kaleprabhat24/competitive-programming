# Hungry Ashish Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-01 |

---

## Problem Statement

### Hungry Ashish

It's dinner time. Ashish is very hungry and wants to eat something. He has XXX rupees in his pocket. Since Ashish is very picky, he only likes to eat either `PIZZA` or `BURGER`. In addition, he prefers eating `PIZZA` over eating `BURGER`. The cost of a `PIZZA` is YYY rupees while the cost of a `BURGER` is ZZZ rupees.

Ashish can eat at most one thing. Find out what will Ashish eat for his dinner.

### Input Format

- The first line will contain TTT - the number of test cases. Then the test cases follow.

- The first and only line of each test case contains three integers XXX, YYY and ZZZ - the money Ashish has, the cost of a `PIZZA` and the cost of a `BURGER`.

### Output Format

For each test case, output what Ashish will eat. (`PIZZA`, `BURGER` or `NOTHING`).

You may print each character of the string in uppercase or lowercase. (for example, the strings `Pizza`, `pIzZa` and `piZZa` will all be treated as identical).

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X,Y,Z≤1001 \leq X, Y, Z \leq 1001≤X,Y,Z≤100

### Sample 1:

Input

Output

```
3
50 40 60
40 55 39
30 42 37

```

```
PIZZA
BURGER
NOTHING

```

### Explanation:

**Test case-1:** Ashish has 505050 rupees while the cost of `PIZZA` is 404040. Therefore he can buy a `PIZZA` for his dinner.

**Test case-2:** Ashish has 404040 rupees. The cost of `PIZZA` is 555555 and the cost of `BURGER` is 393939. Therefore Ashish can not buy a `PIZZA` but can buy a `BURGER` for his dinner.

**Test case-3:** Ashish has 303030 rupees which are not sufficient to buy either `PIZZA` or `BURGER`. Thus he can not buy anything and remains hungry :(.
