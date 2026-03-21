# Wordle Practice Problem in Strings

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-03-21 |

---

## Problem Statement

### Wordle

Chef invented a modified wordle.

There is a hidden word SSS and a guess word TTT, both of length 555.

Chef defines a string MMM to determine the correctness of the guess word. For the ithi^{th}ith index:

- If the guess at the ithi^{th}ith index is correct, the ithi^{th}ith character of MMM is G\texttt{G}G.

- If the guess at the ithi^{th}ith index is wrong, the ithi^{th}ith character of MMM is B\texttt{B}B.

Given the hidden word SSS and guess TTT, determine string MMM.

### Input Format

- First line will contain TTT, number of test cases. Then the test cases follow.

- Each test case contains of two lines of input.

- First line contains the string SSS - the hidden word.

- Second line contains the string TTT - the guess word.

### Output Format

For each test case, print the value of string MMM.

You may print each character of the string in uppercase or lowercase (for example, the strings BgBgB\texttt{BgBgB}BgBgB, BGBGB\texttt{BGBGB}BGBGB, bgbGB\texttt{bgbGB}bgbGB and bgbgb\texttt{bgbgb}bgbgb will all be treated as identical).

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- ∣S∣=∣T∣=5|S| = |T| = 5∣S∣=∣T∣=5

- S,TS, TS,T contain uppercase english alphabets only.

### Sample 1:

Input

Output

```
3
ABCDE
EDCBA
ROUND
RINGS
START
STUNT

```

```
BBGBB
GBBBB
GGBBG

```

### Explanation:

**Test Case 111:** Given string S=ABCDES = \texttt{ABCDE}S=ABCDE and T=EDCBAT = \texttt{EDCBA}T=EDCBA. The string MMM is:

- Comparing the first indices, A≠E\texttt{A} \neq \texttt{E}A=E, thus, M[1]=BM[1] = \texttt{B}M[1]=B.

- Comparing the second indices, B≠D\texttt{B} \neq \texttt{D}B=D, thus, M[2]=BM[2] = \texttt{B}M[2]=B.

- Comparing the third indices, C=C\texttt{C} = \texttt{C}C=C, thus, M[3]=GM[3] = \texttt{G}M[3]=G.

- Comparing the fourth indices, D≠B\texttt{D} \neq \texttt{B}D=B, thus, M[4]=BM[4] = \texttt{B}M[4]=B.

- Comparing the fifth indices, E≠A\texttt{E} \neq \texttt{A}E=A, thus, M[5]=BM[5] = \texttt{B}M[5]=B.

Thus, M=BBGBBM = \texttt{BBGBB}M=BBGBB.

**Test Case 222:** Given string S=ROUNDS = \texttt{ROUND}S=ROUND and T=RINGST = \texttt{RINGS}T=RINGS. The string MMM is:

- Comparing the first indices, R=R\texttt{R} = \texttt{R}R=R, thus, M[1]=GM[1] = \texttt{G}M[1]=G.

- Comparing the second indices, O≠I\texttt{O} \neq \texttt{I}O=I, thus, M[2]=BM[2] = \texttt{B}M[2]=B.

- Comparing the third indices, U≠N\texttt{U} \neq \texttt{N}U=N, thus, M[3]=BM[3] = \texttt{B}M[3]=B.

- Comparing the fourth indices, N≠G\texttt{N} \neq \texttt{G}N=G, thus, M[4]=BM[4] = \texttt{B}M[4]=B.

- Comparing the fifth indices, D≠S\texttt{D} \neq \texttt{S}D=S, thus, M[5]=BM[5] = \texttt{B}M[5]=B.

Thus, M=GBBBBM = \texttt{GBBBB}M=GBBBB.
