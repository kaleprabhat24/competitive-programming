# Playing with Strings Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-25 |

---

## Problem Statement

### Playing with Strings

Chef usually likes to play cricket, but now, he is bored of playing it too much, so he is trying new games with strings. Chef's friend Dustin gave him binary strings SSS and RRR, each with length NNN, and told him to make them identical. However, unlike Dustin, Chef does not have any superpower and Dustin lets Chef perform only operations of one type: choose any pair of integers (i,j)(i, j)(i,j) such that 1≤i,j≤N1 \le i, j \le N1≤i,j≤N and swap the iii-th and jjj-th character of SSS. He may perform any number of operations (including zero).

For Chef, this is much harder than cricket and he is asking for your help. Tell him whether it is possible to change the string SSS to the target string RRR only using operations of the given type.

### Input

- The first line of the input contains a single integer TTT denoting the number of test cases. The description of TTT test cases follows.

- The first line of each test case contains a single integer NNN.

- The second line contains a binary string SSS.

- The third line contains a binary string RRR.

### Output

For each test case, print a single line containing the string `"YES"` if it is possible to change SSS to RRR or `"NO"` if it is impossible (without quotes).

### Constraints

- 1≤T≤4001 \le T \le 4001≤T≤400

- 1≤N≤1001 \le N \le 1001≤N≤100

- ∣S∣=∣R∣=N|S| = |R| = N∣S∣=∣R∣=N

- SSS and RRR will consist of only '1' and '0'

### Sample 1:

Input

Output

```
2
5
11000
01001
3
110
001
```

```
YES
NO
```

### Explanation:

**Example case 1:** Chef can perform one operation with (i,j)=(1,5)(i, j) = (1, 5)(i,j)=(1,5). Then, SSS will be "01001", which is equal to RRR.

**Example case 2:** There is no sequence of operations which would make SSS equal to RRR.
