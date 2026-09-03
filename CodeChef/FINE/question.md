# Overspeeding Fine Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-03 |

---

## Problem Statement

### Overspeeding Fine

Chef was driving on a highway at a speed of XXX km/hour.

To avoid accidents, there are fine imposed on overspeeding as follows:

- No fine if the speed of the car ≤70\leq 70≤70 km/hour.

- Rs 500500500 fine if the speed of the car is strictly greater than 707070 and ≤100\leq 100≤100.

- Rs 200020002000 fine if the speed of the car is strictly greater than 100100100.

Determine the fine Chef needs to pay.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a single integer XXX denoting the speed of Chef's car.

### Output Format

For each test case, output the fine paid by Chef.

### Constraints

- 1≤T≤2001 \leq T \leq 2001≤T≤200

- 1≤X≤2001 \leq X \leq 2001≤X≤200

### Sample 1:

Input

Output

```
7
40
110
70
100
69
101
85

```

```
0
2000
0
500
0
2000
500

```

### Explanation:

**Test case 111:** The speed is ≤70\leq 70≤70. Thus, Chef does not need to pay any fine.

**Test case 222:** The speed is greater than 100100100. Thus, Chef needs to pay 200020002000 as fine.

**Test case 333:** The speed is ≤70\leq 70≤70. Thus, Chef does not need to pay any fine.

**Test case 444:** The speed is greater than 707070 and ≤100\leq 100≤100. Thus, Chef needs to pay 500500500 as fine amount.

**Test case 555:** The speed is ≤70\leq 70≤70. Thus, Chef does not need to pay any fine.

**Test case 666:** The speed is greater than 100100100. Thus, Chef needs to pay 200020002000 as fine.

**Test case 777:** The speed is greater than 707070 and ≤100\leq 100≤100. Thus, Chef needs to pay 500500500 as fine amount.
