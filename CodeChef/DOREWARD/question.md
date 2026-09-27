# Donation Rewards Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-27 |

---

## Problem Statement

### Donation Rewards

On the occasion of World Blood Donor Day, Chef has organized an event to reward regular blood donars in Chefland.

- If the donor has made less than or equal to 333 donations, they receive a `BRONZE` donor badge.

- If the donor has made more than 333 but less than equal to 666 donations, they receive a `SILVER` donor badge.

- If the donor has made more than 666 donations, they receive a `GOLD` donor badge.

Given that a person has made XXX donations, find the badge they receive.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case contains an integer XXX, denoting the number of blood donations the person has made.

### Output Format

For each test case, output on a new line:

- `BRONZE`, if the person has made less than or equal to 333 donations;

- `SILVER`, if the person has made more than 333 but less than equal to 666 donations;

- `GOLD`, if the person has made more than 666 donations.

Each character can be printed in uppercase or lowercase. For example, `GOLD`, `gold`, `Gold`, and `gOlD` are considered identical.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X≤101 \leq X \leq 101≤X≤10

### Sample 1:

Input

Output

```
4
1
3
5
7

```

```
BRONZE
BRONZE
SILVER
GOLD
```

### Explanation:

**Test case 111:** The person has made less than equal to 333 donations. Thus they receive bronze badge.

**Test case 222:** The person has made less than equal to 333 donations. Thus they receive bronze badge.

**Test case 333:** The person has made more than 333 but less than equal to 666 donations. Thus they receive silver badge.

**Test case 444:** The person has made more than 666 donations. Thus they receive gold badge.
