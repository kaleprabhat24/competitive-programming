# Hostel Room Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-19 |

---

## Problem Statement

### Hostel Room

There are initially XXX people in a room.

You are given an array AAA of length NNN which describes the following events:

- If Ai≥0A_i \geq 0Ai​≥0, then AiA_iAi​ people enter the room at iii-th minute. For e.g. if A2=3A_2 = 3A2​=3, then 333 people enter the room at the 222-nd minute.

- If Ai<0A_i \lt 0Ai​<0, then ∣Ai∣|A_i|∣Ai​∣ people leave the room at iii-th minute. Here ∣Ai∣|A_i|∣Ai​∣ denotes the absolute value of AiA_iAi​. For e.g. if A4=−2A_4 = -2A4​=−2, then 222 people leave the room at the 444-th minute.

Determine the maximum number of people in the room at any moment of time.

It is guaranteed in the input that at any moment of time, the number of people in the room does not become negative.

### Input Format

- The first line will contain TTT - the number of test cases. Then the test cases follow.

- The first line of each test case consists of two integers NNN and XXX - the length of the array AAA and the number of people in the room initially.

- The second line of each test case contains NNN integers A1,A2,A3,…ANA_1, A_2, A_3, \dots A_NA1​,A2​,A3​,…AN​.

### Output Format

For each testcase, output the maximum number of people in the room at any point of time.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤N≤1001 \leq N \leq 1001≤N≤100

- 0≤X≤1000 \leq X \leq 1000≤X≤100

- −100≤Ai≤100-100 \leq A_i \leq 100−100≤Ai​≤100

### Sample 1:

Input

Output

```
3
5 8
0 3 3 -13 5
4 5
0 -2 2 3
3 5
-2 5 -2

```

```
14
8
8

```

### Explanation:

**Test case-1:** In the 333-rd minute, the room contains 8+0+3+3=148 + 0 + 3 + 3 = 148+0+3+3=14 people which is the maximum number of people in the room at any point of time.

**Test case-2:** In the 444-th minute, the room contains 5+0−2+2+3=85 + 0 - 2 + 2 + 3 = 85+0−2+2+3=8 people which is the maximum number of people in the room at any point of time.

**Test case-3:** In the 222-nd minute, the room contains 5−2+5=85 - 2 + 5 = 85−2+5=8 people which is the maximum number of people in the room at any point of time.
