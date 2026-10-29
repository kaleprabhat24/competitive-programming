# Insurance Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-10-29 |

---

## Problem Statement

### Insurance

Chef bought car insurance. The policy of the insurance is:

- The **maximum** rebatable amount for any damage is Rs XXX lakhs.

- If the amount required for repairing the damage is ≤X\leq X≤X lakhs, that amount is rebated in full.

Chef's car meets an accident and required Rs YYY lakhs for repairing.

Determine the amount that will be rebated by the insurance company.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- The first and only line of each test case contains two space-separated integers XXX and YYY.

### Output Format

For each test case, output the amount (in lakhs) that will be rebated by the insurance company.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤X,Y≤301 \leq X, Y \leq 301≤X,Y≤30

### Sample 1:

Input

Output

```
4
5 3
5 8
4 4
15 12

```

```
3
5
4
12

```

### Explanation:

**Test case 111:** The damages require only Rs 333 lakh which is below the upper cap, so the entire Rs 333 lakh will be rebated.

**Test case 222:** The damages require Rs 888 lakh which is above the upper cap, so only Rs 555 lakh will be rebated.

**Test case 333:** The damages require only Rs 444 lakh which is equal to the upper cap, so the whole Rs 444 lakh will be rebated.

**Test case 444:** The damages require Rs 151515 lakh which is above the upper cap, so only Rs 121212 lakh will be rebated.
