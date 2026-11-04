# Monopoly in Chefland Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-04 |

---

## Problem Statement

### Monopoly in Chefland

Chef is the financial incharge of Chefland and one of his duties is identifying if any company has gained a monopolistic advantage in the market.

There are exactly 333 companies in the market each of whose revenues are denoted by R1R_1R1​, R2R_2R2​ and R3R_3R3​ respectively. A company is said to have a monopolistic advantage if its revenue is **strictly** greater than the sum of the revenues of its competitors.

Given the revenue of the 333 companies, help Chef determine if any of them has a monopolistic advantage.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a single line of input containing three space separated integers R1R_1R1​, R2R_2R2​ and R3R_3R3​ denoting the revenue of the three companies respectively.

### Output Format

For each test case, output YES\texttt{YES}YES if any of the companies has a monopolistic advantage over its competitors, else output NO\texttt{NO}NO.

You may print each character of the string in uppercase or lowercase (for example, the strings YeS\texttt{YeS}YeS, yEs\texttt{yEs}yEs, yes\texttt{yes}yes and YES\texttt{YES}YES will all be treated as identical).

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤R1,R2,R3≤101 \leq R_1, R_2, R_3 \leq 101≤R1​,R2​,R3​≤10

### Sample 1:

Input

Output

```
4
1 1 1
1 2 4
2 10 3
1 2 3

```

```
No
Yes
Yes
No

```

### Explanation:

**Test case 1:** All the companies have equal revenue so none have a monopolistic advantage.

**Test case 2:** The third company has a monopolistic advantage as 1+2<41 + 2 < 41+2<4.

**Test case 3:** The second company has a monopolistic advantage as 2+3<102 + 3 < 102+3<10.
