# Magic Rankings Practice Problem in Dynamic programming

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-27 |

---

## Problem Statement

### Magic Rankings

Everybody loves magic, especially magicians who compete for glory on the Byteland Magic Tournament. Magician Cyael is one such magician.

Cyael has been having some issues with her last performances and today she’ll have to perform for an audience of some judges, who will change her tournament ranking, possibly increasing it. As she is a great magician she managed to gather a description of the fixed judges’ disposition on the room (which is represented as an N×NN \times NN×N square matrix), such that she knows in advance the fixed points each judge will provide.

She also knows that the room is divided into several parallel corridors, such that we will denote the jthj^{th}jth cell on corridor iii, as [i][j][i][j][i][j]. Note that some judges can award Cyael, zero points or negative points, as they are never pleased with her performance. There is just one judge at each cell of the matrix, except the cells [1][1][1][1][1][1] and [N][N][N][N][N][N].
To complete her evaluation, she must start on the top leftmost corner of the room (cell [1][1][1][1][1][1]), and finish on the bottom right corner (cell [N][N][N][N][N][N]), moving either to the cell directly in front of her on the same corridor (that is, moving from cell [r][c][r][c][r][c] to cell [r][c+1][r][c+1][r][c+1], where c+1c+1c+1 ≤\leq≤ NNN) or to the cell in the next corridor directly in front of where she is (that is, moving from cell [r][c][r][c][r][c] to cell [r+1][c][r+1][c][r+1][c], where r+1r+1r+1 ≤\leq≤ NNN). She will keep doing this until she reaches the end point of the room, i.e. last cell [N][N][N][N][N][N] on the last corridor. Cyael will be judged at all visited cells with a judge.

Cyael wants to maximize her average score at end of her performance. More specifically, if she passes KKK judges, each being on cell [i1][j1][i_{1}][j_{1}][i1​][j1​], cell [i2][j2][i_{2}][j_{2}][i2​][j2​], …\ldots…, cell [iK][jK][i_{K}][j_{K}][iK​][jK​] respectively, then she wants to maximize (S[i1][j1]+S[i2][j2]+…+S[iK][jK])K\frac{(S[i_{1}][j_{1}] + S[i_{2}][j_{2}] + \ldots + S[i_{K}][j_{K}])}{K}K(S[i1​][j1​]+S[i2​][j2​]+…+S[iK​][jK​])​, where S[i][j]S[i][j]S[i][j] denotes the points that the judge will give her on the cell [i][j][i][j][i][j].
Help her determine the best path she has to follow in order to maximize her average points.

### Input Format

- The first line contains a single integer TTT denoting the number of test cases. The description for TTT test cases follows.

- For each test case, the first line contains a single integer NNN.

- Each of the next NNN lines contains NNN space-separated integers. The j-th integer S[i][j]S[i][j]S[i][j] in i-th line denotes the points awarded by the judge at cell [i][j][i][j][i][j].

- Note that the cells [1][1][1][1][1][1] and [N][N][N][N][N][N] have no judges, so S[1][1]S[1][1]S[1][1] and S[N][N]S[N][N]S[N][N] will be 0.

### Output Format

- For each test case, if the maximum possible average points Cyael can obtain is negative, output a single line containing "Bad Judges" (quotes for clarity).

- Otherwise, output the maximum possible average points.

- The answer will be considered correct if it has an absolute error no more than  10−610^{-6}10−6.

### Constraints

- 1 ≤\leq≤ TTT ≤20\leq 20≤20

- 2 ≤\leq≤ NNN ≤100\leq 100≤100

- -2500 ≤\leq≤ S[i][j]S[i][j]S[i][j] ≤2500\leq 2500≤2500

- S[1][1]S[1][1]S[1][1] = S[N][N]=0S[N][N] = 0S[N][N]=0

### Sample 1:

Input

Output

```
2
2
0 -4
8 0
2
0 -45
-3  0
```

```
8.000000
Bad Judges
```

### Explanation:

**Test case 111:** An optimal path for Cyael would be (1,1)→(2,1)→(2,2)(1,1)\rightarrow (2,1)\rightarrow (2,2)(1,1)→(2,1)→(2,2). This way Cyael faces 111 judge and gets a total score of 888. Thus, the average score is 81=8\frac{8}{1} = 818​=8.

**Test case 222:** No matter what path Cyael chooses, the final score would be less than 000.
