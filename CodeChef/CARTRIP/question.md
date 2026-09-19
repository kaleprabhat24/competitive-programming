# Car Trip Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-19 |

---

## Problem Statement

### Car Trip

Chef rented a car for a day.

Usually, the cost of the car is Rs 101010 per km. However, since Chef has booked the car for the whole day, he needs to pay for **at least** 300300300 kms even if the car runs less than 300300300 kms.

If the car ran XXX kms, determine the cost Chef needs to pay.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a single integer XXX - denoting the number of kms Chef travelled.

### Output Format

For each test case, output the cost Chef needs to pay.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X≤10001 \leq X \leq 10001≤X≤1000

### Sample 1:

Input

Output

```
5
800
3
299
301
300

```

```
8000
3000
3000
3010
3000

```

### Explanation:

**Test case 111:** The car runs for 800800800 kms. Thus, he needs to pay 800⋅10=8000800\cdot 10 = 8000800⋅10=8000 rupees.

**Test case 222:** The car runs for 333 kms. However, since Chef booked the car for whole day, he needs to pay for at least 300300300 kms. Thus, he needs to pay 300⋅10=3000300\cdot 10 = 3000300⋅10=3000 rupees.

**Test case 333:** The car runs for 299299299 kms. However, since Chef booked the car for whole day, he needs to pay for at least 300300300 kms. Thus, he needs to pay 300⋅10=3000300\cdot 10 = 3000300⋅10=3000 rupees.

**Test case 444:** The car runs for 301301301 kms. Thus, he needs to pay 301⋅10=3010301\cdot 10 = 3010301⋅10=3010 rupees.

**Test case 555:** The car runs for 300300300 kms. Thus, he needs to pay 300⋅10=3000300\cdot 10 = 3000300⋅10=3000 rupees.
