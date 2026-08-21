# Four Tickets Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-08-21 |

---

## Problem Statement

### Four Tickets

Four friends want to attend a concert. Each ticket costs XXX rupees.

They have decided to go to the concert if and only if the total cost of the tickets does **not exceed** 100010001000 rupees.

Determine whether they will be going to the concert or not.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a single integer XXX, the cost of each ticket.

### Output Format

For each test case, output `YES` if they will be going to the concert, `NO` otherwise.

You can print each character in uppercase or lowercase. For example, the strings `YES`, `yes`, `Yes`, and `yES`, are all considered identical.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X≤10001 \leq X \leq 10001≤X≤1000

### Sample 1:

Input

Output

```
4
100
500
250
1000
```

```
YES
NO
YES
NO

```

### Explanation:

**Test case 111:** The total cost of all tickets is 100⋅4=400100\cdot 4 = 400100⋅4=400 which is ≤1000\le 1000≤1000. Thus, they will go to the concert.

**Test case 222:** The total cost of all tickets is 500⋅4=2000500\cdot 4 = 2000500⋅4=2000 which is >1000\gt 1000>1000. Thus, they will not go to the concert.

**Test case 333:** The total cost of all tickets is 250⋅4=1000250\cdot 4 = 1000250⋅4=1000 which is ≤1000\le 1000≤1000. Thus, they will go to the concert.

**Test case 444:** The total cost of all tickets is 1000⋅4=40001000\cdot 4 = 40001000⋅4=4000 which is >1000\gt 1000>1000. Thus, they will not go to the concert.
