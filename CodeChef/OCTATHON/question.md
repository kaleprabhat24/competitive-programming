# October Marathon Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-08-28 |

---

## Problem Statement

### October Marathon

Chef organised a 303030 kilometres marathon in Chefland.

The participants receive medals on completing the marathon as following:

- If the total time taken is less than 333 hours, they receive a `GOLD` medal.

- If the total time taken is greater than equal to 333 hours but less than 666 hours, they receive a `SILVER` medal.

- If the total time taken is greater than equal to 666 hours, they receive a `BRONZE` medal.

Chefina participated in the marathon and completed it in XXX hours. Which medal would she receive?

### Input Format

- The input consists of a single integer XXX — the number of hours Chefina took to complete the marathon.

### Output Format

Output the medal Chefina would recieve.

Note that you may print each character in uppercase or lowercase. For example, the strings `GOLD`, `gold`, `Gold`, and `gOlD` are considered the same.

### Constraints

- 1≤X≤101\le X \le 101≤X≤10.

### Sample 1:

Input

Output

```
2
```

```
GOLD
```

### Explanation:

Chefina completed the marathon in less than 333 hours. Thus, she gets a `GOLD` medal.

### Sample 2:

Input

Output

```
5
```

```
SILVER
```

### Explanation:

Chefina took more than 333 but less than 666 hours. Thus, she gets a `SILVER` medal.

### Sample 3:

Input

Output

```
6
```

```
BRONZE
```

### Explanation:

Chefina took 666 hours to complete the marathon. Thus, she gets a `BRONZE` medal.
