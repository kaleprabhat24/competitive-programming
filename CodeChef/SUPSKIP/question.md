# Recurrence Reachability Practice Coding Problem

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-03-25 |

---

## Problem Statement

### Recurrence Reachability

Given two integers xxx and yyy, where x<yx \lt yx<y, we define a function fx,yf_{x, y}fx,y​ with the following rules:

- fx,y(0)=xf_{x, y}(0) = xfx,y​(0)=x

- fx,y(1)=yf_{x, y}(1) = yfx,y​(1)=y

- For every integer k≥2k \ge 2k≥2,

fx,y(k)=3⋅fx,y(k−1)−2⋅fx,y(k−2)f_{x, y}(k) = 3\cdot f_{x, y}(k-1) - 2\cdot f_{x, y}(k-2)fx,y​(k)=3⋅fx,y​(k−1)−2⋅fx,y​(k−2)

You're given two integers NNN and MMM.

Your task is to find any pair of integers (x,y)(x, y)(x,y) such that:

- 1≤x<y≤N1 \le x \lt y \le N1≤x<y≤N, and

- There exists some integer k≥0k \ge 0k≥0 such that fx,y(k)=Mf_{x, y}(k) = Mfx,y​(k)=M.

If multiple such pairs exist, you may find any of them.

If no such pairs exist, print −1-1−1.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a single line of input, containing two space-separated integers NNN and MMM.

### Output Format

For each test case, on a new line,

- If no solution exists, output the single integer −1-1−1.

- Otherwise, output two space-separated integers xxx and yyy (1≤x<y≤N1 \le x \lt y \le N1≤x<y≤N) denoting the pair (x,y)(x, y)(x,y) you found.

If multiple possible solutions exist, any of them will be accepted.

### Constraints

- 1≤T≤1051 \leq T \leq 10^51≤T≤105

- 2≤N≤2⋅1052 \le N \le 2\cdot 10^52≤N≤2⋅105

- 1≤M≤1091 \le M \le 10^91≤M≤109

- The sum of NNN over all test cases won't exceed 2⋅1052\cdot 10^52⋅105.

### Sample 1:

Input

Output

```
5
5 7
2 6
6 17
6 45
4 2

```

```
1 3
-1
3 5
-1
2 4
```

### Explanation:

**Test case 111:** With x=1x = 1x=1 and y=3y = 3y=3, we have:

- f1,3(0)=1f_{1, 3}(0) = 1f1,3​(0)=1

- f1,3(1)=3f_{1, 3}(1) = 3f1,3​(1)=3

- f1,3(2)=3⋅f1,3(1)−2⋅f1,3(0)=3⋅3−2⋅1=7f_{1, 3}(2) = 3\cdot f_{1, 3}(1) - 2\cdot f_{1, 3}(0) = 3\cdot 3 - 2\cdot 1 = 7f1,3​(2)=3⋅f1,3​(1)−2⋅f1,3​(0)=3⋅3−2⋅1=7.

So, 777 does appear as the output of f1,3f_{1, 3}f1,3​.

**Test case 222:** Since N=2N = 2N=2, the only possible choice we have is x=1,y=2x = 1, y = 2x=1,y=2.

It can be verified that the function f1,2f_{1, 2}f1,2​ never takes the value 666.
