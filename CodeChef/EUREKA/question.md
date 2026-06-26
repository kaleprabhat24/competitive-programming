# N Queens Puzzle Solved ! Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-26 |

---

## Problem Statement

### N Queens Puzzle Solved !

Chef, being a Chess fan, was thrilled after he read the following news:

Michael Simkin, a postdoctoral fellow at Harvard University’s Center of Mathematical Sciences and Applications proved that for a large value of NNN, there are approximately (0.143⋅N)N(0.143 \cdot N)^N(0.143⋅N)N configurations in which NNN queens can be placed on a N×NN \times NN×N chessboard so that none attack each other.

Although the formula is valid for large NNN, Chef is interested in finding the value of function f(N)f(N)f(N) = (0.143⋅N)N(0.143 \cdot N)^N(0.143⋅N)N for a given small value of NNN. Since Chef is busy understanding the proof of the formula, please help him calculate this value.

Print the answer rounded to the nearest integer. That is, if the actual value of f(N)f(N)f(N) is xxx,

- Print ⌊x⌋\lfloor x\rfloor⌊x⌋ if x−⌊x⌋<0.5x - \lfloor x\rfloor \lt 0.5x−⌊x⌋<0.5

- Otherwise, print ⌊x⌋+1\lfloor x\rfloor + 1⌊x⌋+1

where ⌊x⌋\lfloor x\rfloor⌊x⌋ denotes the floor of xxx.

### Input Format

- The first line of input contains a single integer TTT, denoting the number of test cases. The description of TTT test cases follows.

- Each test case consists of a single line of input containing one integer NNN.

### Output Format

For each test case, output in a single line the value of f(N)f(N)f(N) rounded to the nearest integer.

### Constraints

- 1≤T≤121 \leq T \leq 121≤T≤12

- 4≤N≤154 \leq N \leq 154≤N≤15

### Subtasks

**Subtask #1 (100 points):** Original constraints

### Sample 1:

Input

Output

```
2
4
10
```

```
0
36

```

### Explanation:

**Test case 111:** f(N)=(0.143⋅4)4=0.107f(N) = (0.143 \cdot 4)^4 = 0.107f(N)=(0.143⋅4)4=0.107, which when rounded to nearest integer gives 000.

**Test case 222:** f(N)=(0.143⋅10)10=35.7569f(N) = (0.143 \cdot 10)^{10} = 35.7569f(N)=(0.143⋅10)10=35.7569, which when rounded to nearest integer gives 363636.
