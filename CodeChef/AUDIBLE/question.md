# Audible Range Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-08-01 |

---

## Problem Statement

### Audible Range

Chef's dog *binary* hears frequencies starting from 676767 Hertz to 450004500045000 Hertz (both inclusive).

If Chef's commands have a frequency of XXX Hertz, find whether *binary* can hear them or not.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a single integer XXX - the frequency of Chef's commands in Hertz.

### Output Format

For each test case, output on a new line `YES`, if *binary* can hear Chef's commands. Otherwise, print `NO`.

The output is case-insensitive. Thus, the strings `YES`, `yes`, `yeS`, and `Yes` are all considered the same.

### Constraints

- 1≤T≤1041 \leq T \leq 10^41≤T≤104

- 1≤X≤1061 \leq X \leq 10^61≤X≤106

### Sample 1:

Input

Output

```
5
42
67
402
45000
45005

```

```
NO
YES
YES
YES
NO

```

### Explanation:

**Test case 111:** Chef's command has a frequency of 424242 Hertz which is less than 676767. Thus, it would not be audible to *binary*.

**Test case 222:** Chef's command has a frequency of 676767 Hertz which lies in the range [67,45000][67, 45000][67,45000]. Thus, it would be audible to *binary*.

**Test case 333:** Chef's command has a frequency of 402402402 Hertz which lies in the range [67,45000][67, 45000][67,45000]. Thus, it would be audible to *binary*.

**Test case 444:** Chef's command has a frequency of 450004500045000 Hertz which lies in the range [67,45000][67, 45000][67,45000]. Thus, it would be audible to *binary*.

**Test case 555:** Chef's command has a frequency of 450054500545005 Hertz which is greater than 450004500045000. Thus, it would not be audible to *binary*.
