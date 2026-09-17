# Time Complexity Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-17 |

---

## Problem Statement

### Time Complexity

A sorting algorithm AAA is said to have more time complexity than a sorting algorithm BBB if it uses more number of comparisons for sorting the same array than algorithm BBB.

Given that algorithm AAA uses XXX comparisons to sort an array and algorithm BBB uses YYY comparisons to sort the same array, find whether algorithm AAA has more time complexity.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of two space-separated integers XXX and YYY — the number of comparisons used by algorithms AAA and BBB to sort the array respectively.

### Output Format

For each test case, output on a new line, `YES`, if the algorithm AAA has more time complexity than BBB and `NO` otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings `YES`, `yEs`, `yes`, and `yeS` will all be treated as identical).

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X,Y≤1001 \leq X, Y \leq 1001≤X,Y≤100

### Sample 1:

Input

Output

```
4
9 9
15 7
10 19
21 20

```

```
NO
YES
NO
YES
```

### Explanation:

**Test case 111:** The number of comparisons used by algorithm AAA is 999 and that used by BBB is also 999. Since the number of comparisons used by AAA is not more than that of BBB, AAA does not have more time complexity than BBB.

**Test case 222:** The number of comparisons used by algorithm AAA is 151515 and that used by BBB is 777. Since the number of comparisons used by AAA is more than that of BBB, AAA does have more time complexity than BBB.

**Test case 333:** The number of comparisons used by algorithm AAA is 101010 and that used by BBB is 191919. Since the number of comparisons used by AAA is not more than that of BBB, AAA does not have more time complexity than BBB.

**Test case 444:** The number of comparisons used by algorithm AAA is 212121 and that used by BBB is 202020. Since the number of comparisons used by AAA is more than that of BBB, AAA does have more time complexity than BBB.
