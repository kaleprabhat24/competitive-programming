# Check Isomorphic Strings Practice Problem in Strings

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-03-29 |

---

## Problem Statement

### Check Isomorphic Strings

You are given two strings, sss and ttt. Determine whether these two strings are `isomorphic`.

Two strings are said to be **isomorphic** if characters in string sss can be replaced to get string ttt, such that:

- Each character in sss maps to exactly one character in ttt.

- No two different characters in sss map to the same character in ttt.

- The order of characters is preserved.

- A character is allowed to map to itself.

## Function Declaration

### Function Name

isIsomorphicisIsomorphicisIsomorphic – This function checks whether two strings are isomorphic.

### Parameters

- sss : A string representing the source string.

- ttt : A string representing the target string.

### Return Value

- Returns truetruetrue if the strings sss and ttt are isomorphic.

- Returns falsefalsefalse otherwise.

## Constraints

- 1≤N≤1001 \leq N \leq 1001≤N≤100

- 1≤∣s∣=∣t∣≤1051 \leq |s| = |t| \leq 10^51≤∣s∣=∣t∣≤105

- Strings sss and ttt consist of ASCII characters.

### Input Format

- The first line contains a single integer NNN — the number of test cases.

- For each test case:

The first line contains the string sss.

- The second line contains the string ttt.

### Output Format

- For each test case, print:

`"YES"` if the strings are isomorphic.

- `"NO"` otherwise.

### Sample 1:

Input

Output

```
2
mno
pqr
hello
world

```

```
YES
NO

```

### Explanation:

- 

`"mno"` -> `"pqr"`: mapping `m->p`, `n->q`, `o->r` YES

- 

`"hello"` -> `"world"`: `'l'` maps to two different letters `'r'` and `'l'` NO

### Sample 2:

Input

Output

```
3
abcabc
xyzxyz
pqrpqr
mnopmn
abcd
abcc

```

```
YES
NO
NO

```

### Explanation:

- 

`"abcabc"` -> `"xyzxyz"` YES

- 

`"pqrpqr"` -> `"mnopmn"` NO

- 

`"abcd"` -> `"abcc"` last character maps to two letters.
