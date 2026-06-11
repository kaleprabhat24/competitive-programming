# Digit Sum Parities Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-11 |

---

## Problem Statement

### Digit Sum Parities

For a positive integer MMM, MoEngage defines digitSum(M)\texttt{digitSum(M)}digitSum(M) as the sum of digits of the number MMM (when written in decimal).

For example, digitSum(1023)=1+0+2+3=6\texttt{digitSum(1023)} = 1 + 0 + 2 + 3 = 6digitSum(1023)=1+0+2+3=6.

Given a positive integer NNN, find the **smallest** integer XXX **strictly greater** than NNN such that:

- digitSum(N)\texttt{digitSum(N)}digitSum(N) and digitSum(X)\texttt{digitSum(X)}digitSum(X) have different parity, i.e. one of them is odd and the other is even.

### Input Format

- The first line contains an integer TTT, the number of test cases. The description of the TTT test cases follow.

- Each test case consists of a single line of input with a single integer, the number NNN.

### Output Format

- For each test case, print in a single line, an integer, the answer to the problem.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤N<1091 \leq N \lt 10^{9}1≤N<109

### Sample 1:

Input

Output

```
3
123
19
509
```

```
124
21
511
```

### Explanation:

**Test Case 111:** digitSum(123)=1+2+3=6\texttt{digitSum}(123) = 1 + 2 + 3 = 6digitSum(123)=1+2+3=6 is **even** and digitSum(124)=1+2+4=7\texttt{digitSum}(124) = 1 + 2 + 4 = 7digitSum(124)=1+2+4=7 is **odd**, so the answer is 124124124.

**Test Case 222:** digitSum(19)=1+9=10\texttt{digitSum}(19) = 1 + 9 = 10digitSum(19)=1+9=10 is **even**, digitSum(20)=2+0=2\texttt{digitSum}(20) = 2 + 0 = 2digitSum(20)=2+0=2 is also **even**, whereas digitSum(21)=2+1=3\texttt{digitSum}(21) = 2 + 1 = 3digitSum(21)=2+1=3 is **odd**. Hence, the answer is 212121.

**Test Case 333:** digitSum(509)=5+0+9=14\texttt{digitSum}(509) = 5 + 0 + 9 = 14digitSum(509)=5+0+9=14 is **even**, digitSum(510)=5+1+0=6\texttt{digitSum}(510) = 5 + 1 + 0 = 6digitSum(510)=5+1+0=6 is also **even**, whereas digitSum(511)=5+1+1=7\texttt{digitSum}(511) = 5 + 1 + 1 = 7digitSum(511)=5+1+1=7 is **odd**. Hence, the answer is 511511511.
