# Chef and Strings Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-17 |

---

## Problem Statement

### Chef and Strings

Having already mastered cooking, Chef has now decided to learn how to play the guitar. Often while trying to play a song, Chef has to skip several strings to reach the string he has to pluck. Eg. he may have to pluck the 1st1^{st}1st string and then the 6th6^{th}6th string. This is easy in guitars with only 666 strings; However, Chef is playing a guitar with 10610^6106 strings. In order to simplify his task, Chef wants you to write a program that will tell him the total number of strings he has to skip while playing his favourite song.

This is how guitar strings are numbered (In ascending order from right to left). Eg. to switch from string 111 to 666, Chef would have to skip 444 strings (2,3,4,5)(2, 3, 4, 5)(2,3,4,5).

### Input:

- First line will contain TTT, number of testcases. Then the testcases follow.

- The first line of each test case contains NNN, the number of times Chef has to pluck a string

- The second line of each test case contains NNN space separated integers - S1S_1S1​, S2S_2S2​, ..., SNS_NSN​, where SiS_iSi​ is the number of the ithi^{th}ith string Chef has to pluck.

### Output:

For each testcase, output the total number of strings Chef has to skip over while playing his favourite song.

### Constraints

- 1≤T≤101 \leq T \leq 101≤T≤10

- 2≤N≤1052 \leq N \leq 10^52≤N≤105

- 1≤Si≤1061 \leq S_i \leq 10^61≤Si​≤106

- For each valid iii, Si≠Si+1S_i \neq S_{i+1}Si​=Si+1​

### Subtasks

- 30 points : for each valid iii, Si<Si+1S_i < S_{i+1}Si​<Si+1​

- 70 points : No additional constraints

### Sample 1:

Input

Output

```
2
6
1 6 11 6 10 11
4
1 3 5 7
```

```
15
3
```

### Explanation:

**Test Case** 111

- Chef skips 444 strings (2,3,4,5)(2, 3, 4, 5)(2,3,4,5) to move from 111 to 666

- Chef skips 444 strings (7,8,9,10)(7, 8, 9, 10)(7,8,9,10) to move from 666 to 111111

- Chef skips 444 strings (10,9,8,7)(10, 9, 8, 7)(10,9,8,7) to move from 111111 to 666

- Chef skips 333 strings (7,8,9)(7, 8, 9)(7,8,9) to move from 666 to 101010

- Chef skips 000 strings to move from 101010 to 111111

Therefore, the answer is 4+4+4+3+0=154 + 4 + 4 + 3 + 0 = 154+4+4+3+0=15

**Test Case** 222

- Chef skips 111 string to move from 111 to 333

- Chef skips 111 string to move from 333 to 555

- Chef skips 111 string to move from 555 to 777

Therefore, the answer is 1+1+1=31 + 1 + 1 = 31+1+1=3
