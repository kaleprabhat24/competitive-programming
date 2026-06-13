# Far Away Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-13 |

---

## Problem Statement

### Far Away

Chef has an array AAA of size NNN and an integer MMM, such that 1≤Ai≤M1 \leq A_i \leq M1≤Ai​≤M for every 1≤i≤N1 \leq i \leq N1≤i≤N.

The *distance* of an array BBB from array AAA is defined as:

d(A,B)=∑i=1N∣Ai−Bi∣d(A, B) = \sum_{i=1}^N |A_i - B_i|d(A,B)=i=1∑N​∣Ai​−Bi​∣

Chef wants an array BBB of size NNN, such that 1≤Bi≤M1 \le B_i \le M1≤Bi​≤M and the value d(A,B)d(A, B)d(A,B) is as large as possible, i.e, the distance of BBB from AAA is **maximum**.

Find the **maximum** distance for any valid array BBB.

Note: ∣X∣|X|∣X∣ denotes the absolute value of an integer XXX. For example, ∣−4∣=4|-4| = 4∣−4∣=4 and ∣7∣=7|7| = 7∣7∣=7.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of two lines of input.

The first line of each test case contains two space-separated integers NNN and MMM — the length of array AAA and the limit on the elements of AAA and BBB.

- The second line contains NNN space-separated integers A1,A2,…,ANA_1, A_2, \ldots, A_NA1​,A2​,…,AN​.

### Output Format

For each test case, output on a new line the **maximum** distance of an array from AAA.

### Constraints

- 1≤T≤1051 \leq T \leq 10^51≤T≤105

- 1≤N≤2⋅1051 \leq N \leq 2\cdot 10^51≤N≤2⋅105

- 1≤M≤1091 \leq M \leq 10^91≤M≤109

- 1≤Ai≤M1 \leq A_i \leq M1≤Ai​≤M

- The sum of NNN over all test cases won't exceed 3⋅1053\cdot 10^53⋅105.

### Sample 1:

Input

Output

```
4
2 6
3 5
4 1
1 1 1 1
5 7
2 3 4 5 6
7 24
23 7 6 16 12 4 24

```

```
7
0
21
127

```

### Explanation:

**Test case 111:** The array having maximum distance from AAA is B=[6,1]B = [6, 1]B=[6,1]. Thus the distance is ∣3−6∣+∣5−1∣=3+4=7|3-6| + |5-1| = 3+4=7∣3−6∣+∣5−1∣=3+4=7.

**Test case 222:** The only array possible is B=[1,1,1,1]B = [1,1,1,1]B=[1,1,1,1]. The distance of this array from AAA is 000.

**Test case 333:** One of the possible arrays having maximum distance from AAA is B=[7,7,1,1,1]B = [7,7,1,1,1]B=[7,7,1,1,1]. Thus the distance is ∣2−7∣+∣3−7∣+∣4−1∣+∣5−1∣+∣6−1∣=5+4+3+4+5=21|2-7| + |3-7| + |4-1| + |5-1| + |6-1| = 5+4+3+4+5=21∣2−7∣+∣3−7∣+∣4−1∣+∣5−1∣+∣6−1∣=5+4+3+4+5=21.
