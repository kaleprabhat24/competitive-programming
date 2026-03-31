# Rotate String Practice Problem in Strings

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-03-31 |

---

## Problem Statement

### Rotate String

You are given two strings sss and goalgoalgoal of equal length. Determine whether string sss can be transformed into string goalgoalgoal by performing a series of **left-shifts**.

A **left-shift** operation moves the first character of a string to the end of the string. For example, a left-shift on `"abcde"` results in `"bcdea"`.

If it is possible to transform sss into goalgoalgoal using zero or more left-shifts, print `"Yes"`.

Otherwise, print `"No"`.

## Function Declaration

### Function Name

canRotatecanRotatecanRotate – This function checks whether a string can be rotated using left-shift operations to match a target string.

### Parameters

- sss : A string representing the original string.

- goalgoalgoal : A string representing the target string after rotations.

### Return Value

- Returns truetruetrue if string sss can be transformed into string goalgoalgoal using zero or more left-shift operations.

- Returns falsefalsefalse otherwise.

## Constraints

- 1≤∣s∣=∣goal∣≤1001 \leq |s| = |goal| \leq 1001≤∣s∣=∣goal∣≤100

- Strings sss and goalgoalgoal consist of lowercase English letters.

### Input Format

- The first line contains the string sss.

- The second line contains the string goalgoalgoal.

### Output Format

- Print `"Yes"` if sss can be rotated to become goalgoalgoal.

- Print `"No"` otherwise.

### Sample 1:

Input

Output

```
hello
ohell

```

```
Yes

```

### Explanation:

`"hello"` left-shifted 4 times becomes `"ohell"`, so the answer is `"Yes"`.

### Sample 2:

Input

Output

```
world
dlrow

```

```
No

```

### Explanation:

No sequence of left-shifts can transform `"world"` into `"dlrow"`, so the answer is `"No"`.
