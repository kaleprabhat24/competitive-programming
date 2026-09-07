# Couple Game Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-07 |

---

## Problem Statement

### Couple Game

There are GGG girl and BBB boy students at IIT (BHU) such that B>GB \gt GB>G.

If ICM were a team game where teams could only be of size 222, having **exactly** 111 girl student and 111 boy student, what would be the **minimum** number of boy students from IIT (BHU) who would not be able to participate?

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- The first and only line of each test case contains two space-separated integers GGG and BBB, the number of girl and boy students at IIT (BHU) respectively.

### Output Format

For each test case, output a single integer on a new line, the **minimum** number of boy students from IIT (BHU) who would not be able to participate.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤G<B≤1001 \leq G \lt B \leq 1001≤G<B≤100

### Sample 1:

Input

Output

```
3
1 3
2 4
3 10
```

```
2
2
7
```

### Explanation:

**Test case 111:** There is only 111 girl and 333 boys. So, one team can be formed, and minimum 222 boys will be left behind.

**Test case 222:** There are 222 girls and 444 boys. So, maximum 222 teams can be formed, and minimum 222 boys will be left behind.

**Test case 333**: There are 333 girls and 101010 boys. So, maximum 333 teams can be formed, and minimum 777 boys will be left behind.
