# Longest Common Prefix Practice Problem in Strings

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-03-26 |

---

## Problem Statement

### Longest Common Prefix

You are given a list of NNN strings. Your task is to find the **longest common prefix** shared by all the strings.

If there is **no common prefix**, return an empty string (`""`).

## Function Declaration

### Function Name

longestCommonPrefixlongestCommonPrefixlongestCommonPrefix – This function finds the longest common prefix among a list of strings.

### Parameters

- strsstrsstrs : A reference to a vector of strings containing NNN strings.

### Return Value

- Returns a **string** representing the longest common prefix among all given strings.

- Returns an **empty string (`""`)** if no common prefix exists.

### Constraints

- 1≤N≤2001 \leq N \leq 2001≤N≤200

- 0≤∣strs[i]∣≤2000 \leq |strs[i]| \leq 2000≤∣strs[i]∣≤200

- Each string contains only lowercase English letters (a–za – za–z).

### Input Format

- The first line contains a single integer NNN, the number of strings.

- The next NNN lines each contain one string.

### Output Format

- Print the **longest common prefix** among all strings.

- If no common prefix exists, print an empty string """""".

### Sample 1:

Input

Output

```
4
interview
internet
internal
interval

```

```
inter

```

### Explanation:

All strings start with `"inter"`, which is the longest common prefix.

### Sample 2:

Input

Output

```
3
apple
ape
april

```

```
ap

```

### Explanation:

All strings start with `"ap"` — that’s the longest common prefix.
