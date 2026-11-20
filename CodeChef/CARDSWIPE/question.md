# Card Swipe Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-20 |

---

## Problem Statement

### Card Swipe

In the bustling CodeChef office, the entrance is equipped with a high-tech card swipe system. Each employee is assigned a unique ID card that they use to swipe in and out of the building.

The system records every swipe, capturing the first swipe of an ID as in, second as out, third as in, and so on.
Given an array AAA consisting of NNN IDs denoting NNN swipes throughout the day, find the **maximum** number of people in the office at any time.

Note that there is nobody inside the office before the first swipe.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of multiple lines of input.

The first line of each test case contains an integer NNN — the number of swipes throughout the day.

- The next line contains NNN space-separated integers denoting the ID of the ithi^{th}ith swipe.

### Output Format

For each test case, output on a new line, the **maximum** number of people in the office at any time.

### Constraints

- 1≤T≤2⋅1051 \leq T \leq 2\cdot 10^51≤T≤2⋅105

- 1≤N≤2⋅1051 \leq N \leq 2\cdot 10^51≤N≤2⋅105

- 1≤Ai≤N1 \leq A_i \leq N1≤Ai​≤N

- The sum of NNN over all test cases won't exceed 10610^6106.

### Sample 1:

Input

Output

```
4
4
1 2 2 1
4
1 1 1 2
5
3 5 2 4 1
5
1 2 1 5 4

```

```
2
2
5
3

```

### Explanation:

**Test case 111:** Consider the following order of swipes:

- Person 111 swipes and enters the office.

- Person 222 swipes and enters the office.

- Person 222 swipes and leaves the office.

- Person 111 swipes and leaves the office.

Thus, the maximum number of people in the office at any time is 222.

**Test case 222:** Consider the following order of swipes:

- Person 111 swipes and enters the office.

- Person 111 swipes and leaves the office.

- Person 111 swipes and enters the office.

- Person 222 swipes and enters the office.

Thus, the maximum number of people in the office at any time is 222.

**Test case 333:** Five people swipe and enter the office. Thus, the maximum number of people in the office is 555.

**Test case 444:** Consider the following order of swipes:

- Person 111 swipes and enters the office.

- Person 222 swipes and enters the office.

- Person 111 swipes and leaves the office.

- Person 555 swipes and enters the office.

- Person 444 swipes and enters the office.

Thus, the maximum number of people in the office at any time is 333. Their IDs are 2,5,2, 5,2,5, and 444.
