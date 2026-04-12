# Scalene Triangle Practice Problem in Basic Math

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-12 |

---

## Problem Statement

### Scalene Triangle

Given A,B,A, B,A,B, and CCC as the sides of a triangle, find whether the triangle is *scalene*.

Note:

- A triangle is said to be *scalene* if all three sides of the triangle are **distinct**.

- It is guaranteed that the sides represent a valid triangle.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of three space-separated integers A,B,A, B,A,B, and CCC — the length of the three sides of the triangle.

### Output Format

For each test case, output on a new line, `YES`, if the triangle is *scalene*, and `NO` otherwise.

You may print each character of the string in uppercase or lowercase. For example, `YES`, `yes`, `Yes`, and `yEs` are all considered identical.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤A≤B≤C≤101 \leq A \le B \le C \leq 101≤A≤B≤C≤10

- C<(A+B)C \lt (A+B)C<(A+B)

### Sample 1:

Input

Output

```
4
2 3 4
1 2 2
2 2 2
3 5 6

```

```
YES
NO
NO
YES
```

### Explanation:

**Test case 111:** The side lengths are 2,3,2, 3, 2,3, and 444. Since no two side lengths are equal, the triangle is scalene.

**Test case 222:** The side lengths are 1,2,1, 2, 1,2, and 222. The sides BBB and CCC have the same length. Thus, the triangle is not scalene.

**Test case 333:** The side lengths are 2,2,2, 2, 2,2, and 222. The sides A,B,A, B,A,B, and CCC have the same length. Thus, the triangle is not scalene.

**Test case 444:** The side lengths are 3,5,3, 5, 3,5, and 666. Since no two side lengths are equal, the triangle is scalene.
