# Game of Pooks Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-07-02 |

---

## Problem Statement

### Game of Pooks

We have found a new chess character — pook. It has the qualities of both a rook and a pawn. Specifically, treating the chessboard to be an N×NN\times NN×N grid where (i,j)(i, j)(i,j) denotes the intersection of the iii-th row and the jjj-th column, a pook placed at square (x,y)(x, y)(x,y) threatens the following squares:

- (i,y)(i, y)(i,y) for every 1≤i≤N1 \leq i \leq N1≤i≤N

- (x,i)(x, i)(x,i) for every 1≤i≤N1 \leq i \leq N1≤i≤N

- (x+1,y−1)(x+1, y-1)(x+1,y−1), if x<Nx \lt Nx<N and y≥2y \geq 2y≥2

- (x+1,y+1)(x+1, y+1)(x+1,y+1), if x<Nx \lt Nx<N and y<Ny \lt Ny<N

Find the **maximum** number of pooks that can be placed on an empty N×NN \times NN×N chessboard such that none of them threaten each other.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases. Then the test cases follow.

- Each test case consists of a single line of input, containing a single integer NNN.

### Output Format

For each test case, output in a single line the maximum number of pooks that can be placed on the chessboard such that they don't threaten each other.

### Constraints

- 1≤T≤1051 \leq T \leq 10^51≤T≤105

- 1≤N≤1091 \leq N \leq 10^91≤N≤109

### Sample 1:

Input

Output

```
3
1
2
3
```

```
1
1
2
```

### Explanation:

**Test case 111:** There is a single square, so we have a single pook.

**Test case 222:** We can only place one pook. No matter where the first is placed, placing a second will lead to one of the two being threatened.

**Test case 333:** Placing 222 pooks on a 3×33\times 33×3 grid is easy — for example, place one at (1,2)(1, 2)(1,2) and another at (3,3)(3, 3)(3,3). It can be shown that placing three is not possible.
