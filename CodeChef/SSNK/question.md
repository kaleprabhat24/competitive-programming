# Practice Coding Problem

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-03-25 |

---

## Problem Statement

### Snaky Strings

Chef calls a string *snaky* if it either starts or ends with the letter `'s'`.

You are given a string AAA of length 444, consisting of only lowercase English letters.

Is the string AAA *snaky*?

### Input Format

- The only line of input contains a string AAA of length 444, containing only lowercase English letters.

### Output Format

Output a string denoting the answer: `Yes` if the string AAA is *snaky* and `No` otherwise.

Each character of the output may be printed in either uppercase or lowercase, i.e. the strings `NO`, `No`, `nO`, and `no` will be treated as equivalent.

### Constraints

- AAA has length 444.

- Every character of AAA  is a lowercase English letter, i.e. one of {a,b,…,z}\{\tt{a}, \tt{b}, \ldots, \tt{z}\}{a,b,…,z}.

### Sample 1:

Input

Output

```
hiss

```

```
Yes
```

### Explanation:

The string `"hiss"` ends with the letter `'s'`, so it is *snaky*.

### Sample 2:

Input

Output

```
rock

```

```
No
```

### Explanation:

The string `"rock"` neither starts nor ends with the letter `'s'`, so it is not *snaky*.

### Sample 3:

Input

Output

```
snow

```

```
Yes
```

### Explanation:

The string `"snow"` starts with the letter `'s'`, so it is *snaky*.
