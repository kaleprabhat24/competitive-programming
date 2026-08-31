# Rain in Chefland Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-08-31 |

---

## Problem Statement

### Rain in Chefland

In Chefland, precipitation is measured using a rain gauge in millimetre per hour.

Chef categorises rainfall as:

- `LIGHT`, if rainfall is less than 333 millimetre per hour.

- `MODERATE`, if rainfall is greater than equal to 333 millimetre per hour and less than 777 millimetre per hour.

- `HEAVY` if rainfall is greater than equal to 777 millimetre per hour.

Given that it rains at XXX millimetre per hour on a day, find whether the rain is `LIGHT`,` MODERATE`, or `HEAVY`.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a single integer XXX — the rate of rainfall in millimetre per hour.

### Output Format

For each test case, output on a new line, whether the rain is `LIGHT`,` MODERATE`, or `HEAVY`.

You may print each character in lowercase or uppercase. For example, `LIGHT`, `light`, `Light`, and `liGHT`, are all identical.

### Constraints

- 1≤T≤201 \leq T \leq 201≤T≤20

- 1≤X≤201 \leq X \leq 201≤X≤20

### Sample 1:

Input

Output

```
4
1
20
3
7

```

```
LIGHT
HEAVY
MODERATE
HEAVY
```

### Explanation:

**Test case 111:** The rate of precipitation is less than 333. Thus, the rain is `LIGHT`.

**Test case 222:** The rate of precipitation is greater than equal to 777. Thus, the rain is `HEAVY`.

**Test case 333:** The rate of precipitation is greater than equal to 333 and less than 777. Thus, the rain is `MODERATE`.

**Test case 444:** The rate of precipitation is greater than equal to 777. Thus, the rain is `HEAVY`.
