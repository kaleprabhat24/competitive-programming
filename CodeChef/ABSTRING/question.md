# String Game Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-22 |

---

## Problem Statement

### String Game

Alice and Bob are playing a game. They have a common string SSS of length NNN. The players also have their individual strings AAA (belonging to Alice) and BBB (belonging to Bob) which are empty in the beginning. Game begins with Alice and both players take alternate turns.

In her/his turn, the player picks a single character from string SSS, adds it to the end of their individual string and deletes the picked character from string SSS.

The game continues until string SSS is empty. Find whether there exists a sequence of moves such that the strings AAA and BBB are **same** at the end of the game.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of multiple lines of input.

The first line of each test case contains an integer NNN — the length of the string.

- The next line contains the strings SSS consisting of lowercase english alphabets.

### Output Format

For each test case, output on a new line, `YES` if there exists a sequence of moves such that the strings AAA and BBB are same at the end of the game, and `NO` otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings `YES`, `yEs`, `yes`, and `yeS` will all be treated as identical).

### Constraints

- 1≤T≤1031 \leq T \leq 10^31≤T≤103

- 1≤N≤1051 \leq N \leq 10^51≤N≤105

- SSS consists of lowercase english alphabets

- The sum of NNN over all test cases does not exceed 2⋅1052\cdot 10^52⋅105.

### Sample 1:

Input

Output

```
4
4
abab
5
cbcba
4
abcd
6
pqprqr

```

```
YES
NO
NO
YES
```

### Explanation:

**Test case 111:** Consider the following sequence of moves:

- Alice picks the first character of string SSS and adds it to the end of string AAA. Thus, SSS becomes `bab` and AAA becomes `a`.

- Bob picks the second character of string SSS and adds it to the end of string BBB. Thus, the strings are S=S =S= `bb`, A=A =A= `a`, and B=B =B= `a` .

- Alice picks the second character of string SSS and adds it to the end of string AAA. Thus, the strings are S=S =S= `b`, A=A =A= `ab`, and B=B =B= `a` .

- Bob picks the first character of string SSS and adds it to the end of string BBB. Thus, SSS becomes empty, A=A =A= `ab`, and B=B =B= `ab` .

We can see that using this sequence of moves, the final strings AAA and BBB are equal.

**Test case 222:** There exists no sequence of moves such that the strings AAA and BBB become equal in the end.

**Test case 333:** There exists no sequence of moves such that the strings AAA and BBB become equal in the end.

**Test case 444:** Consider the following sequence of moves:

- Alice picks the first character of string SSS and adds it to the end of string AAA. Thus, SSS becomes `qprqr` and AAA becomes `p`.

- Bob picks the second character of string SSS and adds it to the end of string BBB. Thus, the strings are S=S =S= `qrqr`, A=A =A= `p`, and B=B =B= `p` .

- Alice picks the second character of string SSS and adds it to the end of string AAA. Thus, the strings are S=S =S= `qqr`, A=A =A= `pr`, and B=B =B= `p` .

- Bob picks the third character of string SSS and adds it to the end of string BBB. Thus, SSS becomes `qq`, AAA becomes `pr`, and BBB becomes `pr`.

- Alice picks the second character of string SSS and adds it to the end of string AAA. Thus, the strings are S=S =S= `q`, A=A =A= `prq`, and B=B =B= `pr` .

- Bob picks the first character of string SSS and adds it to the end of string BBB. Thus, SSS becomes empty, A=A =A= `prq`, and B=B =B= `prq` .

We can see that using this sequence of moves, the final strings AAA and BBB are equal.
