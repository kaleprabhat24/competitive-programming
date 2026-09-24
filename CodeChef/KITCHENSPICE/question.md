# Spice Level Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-24 |

---

## Problem Statement

### Spice Level

Each item in Chef’s menu is assigned a spice level from 111 to 101010. Based on the spice level, the item is categorised as:

- `MILD`: If the spice level is less than 444.

- `MEDIUM`: If the spice level is greater than equal to 444 but less than 777.

- `HOT`: If the spice level is greater than equal to 777.

Given that the spice level of an item is XXX, find the category it lies in.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of an integer XXX — the spice level of the item.

### Output Format

For each test case, output on a new line, the category that the item lies in.

You may print each character in uppercase or lowercase. For example, `HOT`, `hot`, `Hot`, and `hOT` are all considered the same.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤X≤101 \leq X \leq 101≤X≤10

### Sample 1:

Input

Output

```
4
4
1
6
9

```

```
MEDIUM
MILD
MEDIUM
HOT

```

### Explanation:

**Test case 111:** The spice level is greater than 444 but less than 777. Thus, it is in `MEDIUM` category.

**Test case 222:** The spice level is less than 444. Thus, it is in `MILD` category.

**Test case 333:** The spice level is greater than 444 but less than 777. Thus, it is in `MEDIUM` category.

**Test case 444:** The spice level is greater than 777. Thus, it is in `HOT` category.
