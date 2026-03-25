# Practice Coding Problem

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-03-25 |

---

## Problem Statement

### Target Temperature

Chef is preparing his restaurant's kitchen for the day.

There are NNN stoves in the kitchen.

Initially, all the stoves have a temperature of 000.

Every minute, the following will happen:

- First, Chef can choose **at most one** stove and reset its temperature to 000 instantly.

In particular, it is allowed to not reset the temperature of any stove, if Chef wishes to.

- Then, the temperature of *every* stove will increase by 111.

Note that it is allowed to reset the same stove multiple times (in different minutes).

Chef thinks the iii-th stove is *ready* when its temperature is **exactly** BiB_iBi​.

Is it possible for Chef to make his choices in such a way that all NNN stoves are *ready* simultaneously?

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of two lines of input.

The first line of each test case contains a single integer NNN.

- The second line contains NNN space-separated integers B1,B2,…,BNB_1, B_2, \ldots, B_NB1​,B2​,…,BN​.

### Output Format

For each test case, output on a new line the answer: `Yes` if it's possible for all NNN stoves to be *ready* simultaneously, and `No` otherwise.

Each character of the output may be printed in either uppercase or lowercase, i.e. the strings `NO`, `No`, `nO`, and `no` will be treated as equivalent.

### Constraints

- 1≤T≤1051 \leq T \leq 10^51≤T≤105

- 1≤N≤2⋅1051 \leq N \leq 2\cdot 10^51≤N≤2⋅105

- 1≤Bi≤1091 \le B_i \le 10^91≤Bi​≤109

- The sum of NNN over all test cases won't exceed 2⋅1052\cdot 10^52⋅105.

### Sample 1:

Input

Output

```
3
2
1 3
3
4 4 4
4
5 6 6 5

```

```
Yes
Yes
No

```

### Explanation:

**Test case 111:** One valid sequence of operations is as follows.

- Initially, the temperatures are [0,0][0, 0][0,0].

- In the first minute, don't reset any stove. The temperatures are [1,1][1, 1][1,1].

- In the second minute, again don't reset any stove. The temperatures are [2,2][2, 2][2,2].

- In the third minute, reset the first stove, so the temperatures are [0,2][0, 2][0,2].

Then, every stove increases in temperature by 111, so the temperatures are [1,3][1, 3][1,3].

This is the desired final state.

**Test case 222:** Do nothing for four minutes and the temperatures are [4,4,4][4, 4, 4][4,4,4].

**Test case 333:** It can be shown that it's impossible to obtain the state [5,6,6,5][5, 6, 6, 5][5,6,6,5] no matter what Chef does.
