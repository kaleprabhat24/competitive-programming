# Group Assignment Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-14 |

---

## Problem Statement

### Group Assignment

Chef is hosting a party at his house and NNN people are invited to it. Everyone has arrived and they are eager to make a group and chit-chat.

The ithi^{th}ith person prefers to be in a group of **exactly** PiP_iPi​ people (including himself). A person who is not in a group of preferred size gets upset. Find whether Chef would be able to assign every person to a group such that everyone remains happy.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of multiple lines of input.

The first line of each test case contains an integer NNN — the number of people at the party.

- The next line contains the array PPP — where PiP_{i}Pi​ denotes the preferred group size for ithi^{th}ith person.

### Output Format

For each test case, output `YES`, if Chef can assign every person to a group such that everyone remains happy. Otherwise output `NO`.

The output is case-insensitive, meaning that outputs such as `yES`, `YeS`, `YES` and `yes` mean the same.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 2≤N≤1052 \leq N \leq 10^{5}2≤N≤105

- 2≤Pi≤N2 \leq P_{i} \leq N2≤Pi​≤N

- Sum of NNN over all test cases does not exceed 10510^{5}105.

### Sample 1:

Input

Output

```
4
5
2 3 2 3 3
5
5 5 5 5 5
5
3 2 2 3 2
4
4 4 4 3

```

```
YES
YES
NO
NO

```

### Explanation:

**Test case 111:**

- Person 111 and 333 can make a group (As both want to be in a group of 222).

- Person 222, 444 and 555 can make a group (As they all want to be in a group of 333).

So, there is a possible arrangement that Chef can make so that all of them are happy.

**Test case 222**:

- All of the 555 people can make a group (As all want to be in a group of 555).

So, there is a possible arrangement that Chef can make so that all of them are happy.

**Test case 333:** It can be shown that there is no possible arrangement that Chef can make so that all of them are happy.

**Test case 444:** It can be shown that there is no possible arrangement that Chef can make so that all of them are happy.
