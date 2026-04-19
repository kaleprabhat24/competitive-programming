# Necklace Practice Problem in Stacks and Queues

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-19 |

---

## Problem Statement

### Necklace

Your best friend has a very interesting necklace with nnn pearls. On each of the pearls of the necklace there is an integer. However, your friend wants to modify the necklace a bit and asks you for help. She wants to move the first pearl kkk spots to the left (and do so with all other pearls).

For example: if the necklace was originally 1,5,3,4,21, 5, 3, 4, 21,5,3,4,2 and k=2k = 2k=2, now it becomes 3,4,2,1,53, 4, 2, 1, 53,4,2,1,5.

Help your best friend determine how the necklace will look after the modification.

### Input Format

- First line will contain TTT, the number of test cases. Then the test cases follow.

- Each test case contains two lines of input, the first containing two integers n,kn, kn,k.

- The second line of each test case contains nnn integers a1,a2,...,ana_1, a_2, ..., a_na1​,a2​,...,an​ representing the integers on the pearls starting from the first one.

### Output Format

For each testcase, output in a single line nnn integers representing the necklace after modification.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤n≤1051 \leq n \leq 10^51≤n≤105

- The sum of nnn over all test cases does not exceed 3⋅1053 \cdot 10^53⋅105

- 0≤k≤n0 \leq k \leq n0≤k≤n

- −109≤ai≤109-10^9 \leq a_i \leq 10^9−109≤ai​≤109

### Subtasks

- 30 points : The sum of nnn over all test cases does not exceed 500050005000

- 70 points : original constraints

### Sample 1:

Input

Output

```
2
5 3
1 5 3 4 2
6 5
10 1 2 9 8 2
```

```
4 2 1 5 3
2 10 1 2 9 8
```

### Explanation:

The first test case is the example from the statement.
In the second test case, when we move every element 5 to the left we get the answer.
