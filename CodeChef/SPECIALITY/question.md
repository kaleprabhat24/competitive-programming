# Speciality Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-10-15 |

---

## Problem Statement

### Speciality

On every CodeChef user's profile page, the list of problems that they have set, tested, and written editorials for, is listed at the bottom.

Given the number of problems in each of these 333 categories as X,Y,X, Y,X,Y, and ZZZ respectively (where all three integers are **distinct**), find if the user has been most active as a `Setter`, `Tester`, or `Editorialist`.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of three space-separated integers X,Y,X, Y,X,Y, and ZZZ - the number of problems they have set, tested, and written editorials for.

### Output Format

For each test case, output in a new line:

- `Setter`, if the user has been most active as a setter.

- `Tester`, if the user has been most active as a tester.

- `Editorialist`, if the user has been most active as an editorialist.

Note that the output is case-insensitive. Thus, the strings `SETTER`, `setter`, `seTTer`, and `Setter` are all considered the same.

### Constraints

- 1≤T≤1041 \leq T \leq 10^41≤T≤104

- 1≤X,Y,Z≤1001 \leq X, Y, Z \leq 1001≤X,Y,Z≤100, where X,Y,X, Y,X,Y, and ZZZ are **distinct**.

### Sample 1:

Input

Output

```
4
5 3 2
1 2 4
2 5 1
9 4 5

```

```
Setter
Editorialist
Tester
Setter
```

### Explanation:

**Test case 111:** The number of problems that the user has set is greater than the number of problems tested or written editorials for. Thus, the user is most active as setter.

**Test case 222:** The number of problems that the user has written editorials for, is greater than the number of problems set or tested. Thus, the user is most active as editorialist.

**Test case 333:** The number of problems that the user has tested is greater than the number of problems set or written editorials for. Thus, the user is most active as tester.

**Test case 444:** The number of problems that the user has set is greater than the number of problems tested or written editorials for. Thus, the user is most active as setter.
