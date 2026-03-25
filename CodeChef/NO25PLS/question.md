# Practice Coding Problem

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-03-25 |

---

## Problem Statement

### Imperfect Numbers

Chef calls a **positive** integer *imperfect* if it's divisible by **either** 222 or 555, but **not both**.

For example, 888 and 151515 are *imperfect* integers, while 202020 is not.

You are given an integer NNN.

Find the **minimum** possible difference between NNN and an *imperfect* number.

That is, find the minimum possible value of ∣N−M∣|N - M|∣N−M∣ across all choices of MMM that are *imperfect* numbers, where ∣x∣|x|∣x∣ denotes the absolute value of xxx.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a one line of input, containing a single integer NNN.

### Output Format

For each test case, output on a new line the answer: the minimum possible difference between NNN and an imperfect number.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤N≤1001 \leq N \leq 1001≤N≤100

### Sample 1:

Input

Output

```
5
1
5
20
9
14

```

```
1
0
2
1
0
```

### Explanation:

**Test case 111:** 222 is an *imperfect* number, because it's divisible by 222 but not 555.

This is the closest imperfect number to 111, giving a difference of ∣1−2∣=1|1-2| = 1∣1−2∣=1.

**Test case 222:** 555 is already an *imperfect* number, so the answer is ∣5−5∣=0|5-5| = 0∣5−5∣=0.

**Test case 333:** 202020 is not an *imperfect* number because it's divisible by both 222 and 555.

One possible option is to choose 181818 as an *imperfect* number, giving a difference of ∣20−18∣=2|20-18| = 2∣20−18∣=2.

This is the minimum possible difference between 202020 and an imperfect number.

**Test case 444:** 999 is not an *imperfect* number because it's divisible by neither 222 nor 555.

However, 888 is an *imperfect* number because it's divisible by 222 but not 555, and ∣8−9∣=1|8-9| = 1∣8−9∣=1.

This is the minimum possible difference.

**Test case 555:** 141414 is already an *imperfect* number, so the answer is ∣14−14∣=0|14-14| = 0∣14−14∣=0.
