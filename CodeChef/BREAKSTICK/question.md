# Break the Stick Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-19 |

---

## Problem Statement

### Break the Stick

Chef has a stick of length NNN.

He can break the stick into 222 or more parts such that the parity of length of each part is same. For example, a stick of length 111111 can be broken into three sticks of lengths {3,3,5}\{3, 3, 5\}{3,3,5} since each part is odd, but it cannot be broken into two sticks of lengths {5,6}\{5, 6\}{5,6} since one is even and the other is odd.

Chef can then continue applying this operation on the smaller sticks he obtains, as many times as he likes.

Can Chef obtain a stick of length exactly XXX by doing this?

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases. The description of the test cases follows.

- Each test case consists of a single line of input, containing two space-separated integers N,XN, XN,X.

### Output Format

For each test case, output on a new line `YES` if Chef can obtain a stick of length exactly XXX, and `NO` otherwise.

Each letter of the output may be printed in either lowercase or uppercase. For example, the strings `YES`, `yEs`, and `Yes` will be considered identical.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤X<N≤1091 \leq X \lt N \leq 10^91≤X<N≤109

### Sample 1:

Input

Output

```
3
6 1
3 2
4 3

```

```
YES
NO
YES

```

### Explanation:

**Test case 111:** Chef can initially break the stick into 333 parts of length 222 each. After that, Chef can pick any segment of length 222 and break it into 222 sticks of length 111 each.

**Test case 222:** Chef cannot obtain a stick of length 222, since the only way to break a stick of length 333 following the given conditions is into three parts of length 111 each.

**Test case 333:** Chef can break the stick into lengths 333 and 111.
