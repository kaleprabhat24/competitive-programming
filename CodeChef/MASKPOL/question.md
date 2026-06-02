# Mask Policy Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-02 |

---

## Problem Statement

### Mask Policy

A city has been infected by a contagious virus.

In a survey, it was found that AAA out of the NNN people living in the city are currently infected.
It has been observed that the only way for a person to get infected is if he comes in contact with an already infected person, and both of them are NOT wearing a mask.

The mayor of the city wants to make a new Mask Policy and find out the minimum number of people that will be required to wear a mask to avoid the further spread of the virus.
Help the mayor in finding this number.

Note: The only aim of the mayor is to stop virus spread, not to mask every infected person.

### Input Format

- The first line contains TTT - number of test cases. Then the test cases follow.

- The first and only line of each test case contains two integers NNN and AAA - the total number of people living in the city and the number of people already affected by the virus respectively.

### Output Format

For each test case, output the minimum number of people that will be required to wear a mask so as to curb the virus spread.

### Constraints

- 1≤T≤1051 \leq T \leq 10^51≤T≤105

- 2≤N≤4002 \leq N \leq 4002≤N≤400

- 1≤A<N1 \leq A \lt N1≤A<N

### Sample 1:

Input

Output

```
3
2 1
3 2
3 1
```

```
1
1
1
```

### Explanation:

**Test Case #1**: There is 111 infected person and 111 uninfected person. We can ask any of them to wear a mask, and no more infections will occur. Hence the answer is 111.

**Test Case #2**: There are 222 infected people and 111 uninfected person. We can ask the uninfected person to wear a mask, and no more infections will occur. Hence the answer is 111.

**Test Case #3**: There is 111 infected person and 222 uninfected people. We can ask the single infected person to wear a mask, and no more infections will occur. Hence the answer is 111.
