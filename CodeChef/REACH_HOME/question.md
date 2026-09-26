# Reach Home Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-26 |

---

## Problem Statement

### Reach Home

Chef is hungry and wants to reach home.

Chef can travel up to 555 kilometres on 111 litre of fuel on his motorcycle.

Currently, his motorcycle is filled with XXX litres of fuel and his home is YYY kilometres away.

Determine whether Chef can reach his home on his motorcycle or not.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- The first and only line of each test case contains two space-separated integers XXX and YYY — the amount of fuel in Chef’s motorcycle and the distance to Chef’s home in kilometres.

### Output Format

For each test case, output `YES`, if Chef can reach home on his motorcycle. Otherwise output `NO`.

You can output each character of the answer in uppercase or lowercase. For example, the strings `yEs`, `yes`, `Yes`, and YES are considered the same.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X,Y≤10001 \leq X, Y \leq 10001≤X,Y≤1000

### Sample 1:

Input

Output

```
4
2 10
3 17
4 2
6 45
```

```
YES
NO
YES
NO
```

### Explanation:

**Test case 111:** With 222 litres of fuel, Chef can go up to 101010 kilometres. Since his home is 101010 kilometres away, he can reach his home on his motorcycle.

**Test case 222:** With 333 litres of fuel, Chef can go up to 151515 kilometres. Since his home is 171717 kilometres away, he cannot reach his home on his motorcycle.

**Test case 333:** With 444 litres of fuel, Chef can go up to 202020 kilometres. Since his home is 222 kilometres away, he can reach his home on his motorcycle.

**Test case 444:** With 666 litres of fuel, Chef can go up to 303030 kilometres. Since his home is 454545 kilometres away, he cannot reach his home on his motorcycle.
