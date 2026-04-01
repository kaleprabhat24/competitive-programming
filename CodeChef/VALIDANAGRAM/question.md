# Valid Anagram Practice Problem in Strings

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-01 |

---

## Problem Statement

### Valid Anagram

You are given two strings sss and ttt. Your task is to determine whether ttt is an **anagram** of sss.

An anagram is a word formed by rearranging the letters of another word, using **all the original letters exactly the number of times it is used**.

## Function Declaration

### Function Name

isAnagramisAnagramisAnagram – This function checks whether one string is an anagram of another string.

### Parameters

- sss : A string representing the original word.

- ttt : A string to be checked as an anagram of sss.

### Return Value

- Returns truetruetrue if ttt is an anagram of sss.

- Returns falsefalsefalse otherwise.

### Constraints

- 1≤∣s∣,∣t∣≤5×1041 \leq |s|, |t| \leq 5 \times 10^41≤∣s∣,∣t∣≤5×104

- Both sss and ttt consist of **lowercase English letters** (a–za – za–z).

### Input Format

- The first line contains a single string sss.

- The second line contains a single string ttt.

### Output Format

- Print YESYESYES if ttt is an anagram of sss.

- Print NONONO otherwise.

### Sample 1:

Input

Output

```
listen
silent

```

```
YES

```

### Explanation:

`"silent"` is an anagram of `"listen"`.

### Sample 2:

Input

Output

```
hello
world

```

```
No

```

### Explanation:

`"world"` cannot be rearranged to form `"hello"`.

### Sample 3:

Input

Output

```
aab
baa
```

```
YES
```
