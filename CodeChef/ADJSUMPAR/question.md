# Adjacent Sum Parity Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-16 |

---

## Problem Statement

### Adjacent Sum Parity

Chef has an array AAA of length NNN.

Chef forms a binary array BBB of length NNN using the parity of the sums of adjacent elements in AAA. Formally,

- Bi=(Ai+Ai+1) % 2B_i = (A_i + A_{i+1}) \, \% \, 2Bi​=(Ai​+Ai+1​)%2 for 1≤i≤N−11 \leq i \le N - 11≤i≤N−1

- BN=(AN+A1) % 2B_N = (A_N + A_1) \, \% \, 2BN​=(AN​+A1​)%2

Here x % yx \, \% \, yx%y denotes the remainder obtained when xxx is divided by yyy.

Chef lost the array AAA and needs your help. Given array BBB, determine whether there exists any valid array AAA which could have formed BBB.

### Input Format

- The first line contains a single integer TTT — the number of test cases. Then the test cases follow.

- The first line of each test case contains an integer NNN — the size of the array AAA.

- The second line of each test case contains NNN space-separated integers B1,B2,…,BNB_1, B_2, \dots, B_NB1​,B2​,…,BN​ denoting the array BBB.

### Output Format

For each testcase, output `YES` if there exists a valid array AAA, `NO` otherwise.

You can print any character in any case. For example `YES`, `Yes`, `yEs` are all considered same.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 2≤N≤1052 \leq N \leq 10^52≤N≤105

- Bi∈{0,1}B_i \in \{0, 1\}Bi​∈{0,1}

- The sum of NNN over all test cases do not exceed 3⋅1053 \cdot 10^53⋅105.

### Sample 1:

Input

Output

```
4
2
0 0
2
1 0
4
1 0 1 0
3
1 0 0

```

```
YES
NO
YES
NO

```

### Explanation:

**Test case 1:** One such valid array is A=[3,3]A = [3, 3]A=[3,3].

**Test case 2:** It can be shown that no such arrays exist and are valid.

**Test case 3:** One such valid array is A=[1,2,4,5]A = [1, 2, 4, 5]A=[1,2,4,5].

- B1=1B_1 = 1B1​=1 since A1+A2=1+2=3A_1 + A_2 = 1 + 2 = 3A1​+A2​=1+2=3 and 3 % 2=13 \, \% \, 2 = 13%2=1

- B2=0B_2 = 0B2​=0 since A2+A3=2+4=6A_2 + A_3 = 2 + 4 = 6A2​+A3​=2+4=6 and 6 % 2=06 \, \% \, 2 = 06%2=0

- B3=1B_3 = 1B3​=1 since A3+A4=4+5=9A_3 + A_4 = 4 + 5 = 9A3​+A4​=4+5=9 and 9 % 2=19 \, \% \, 2 = 19%2=1

- B4=0B_4 = 0B4​=0 since A4+A1=5+1=6A_4 + A_1 = 5 + 1 = 6A4​+A1​=5+1=6 and 6 % 2=06 \, \% \, 2 = 06%2=0
