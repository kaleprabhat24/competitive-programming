# True and False Paper Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-28 |

---

## Problem Statement

### True and False Paper

Alice wrote an exam containing NNN true or false questions (i.e. questions whose answer is either true or false). Each question is worth 111 mark and there is no negative marking in the examination. Alice scored KKK marks out of NNN.

Bob wrote the same exam but he marked each and every question as the opposite of what Alice did, i.e, for whichever questions Alice marked `true`, Bob marked `false` and for whichever questions Alice marked `false`, Bob marked `true`.

Determine the score of Bob.

### Input Format

- The first line contains a single integer TTT — the number of test cases. Then the test cases follow.

- The first and only line of each test case contains two space-separated integers NNN and KKK — the total number of questions in the exam and the score of Alice.

### Output Format

For each test case, output on a new line the score of Bob.

### Constraints

- 1≤T≤20001 \leq T \leq 20001≤T≤2000

- 1≤N≤1001 \le N \le 1001≤N≤100

- 0≤K≤N0 \le K \le N0≤K≤N

### Sample 1:

Input

Output

```
3
1 1
50 0
100 76

```

```
0
50
24

```

### Explanation:

**Test case 111:** There was one question in the exam and Alice answered it correctly. This means that Bob will surely answer it incorrectly. Therefore Bob's score is zero.

**Test case 222:** Alice answered all the questions incorrectly, and so Bob will surely answer all the questions correctly. Therefore Bob's score is 505050.
