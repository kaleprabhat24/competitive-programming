# Remove Outermost Parentheses Practice Problem in Strings

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-03-25 |

---

## Problem Statement

### Remove Outermost Parentheses

You are given a valid parentheses string sss.

A valid parentheses string is composed of `'('` and `')'` that are properly balanced.

A valid parentheses string is called **primitive** if it cannot be split into two smaller valid parentheses strings.

Your task is to **remove the outermost parentheses** from every primitive part of sss and print the final result.

## Function Declaration

### Function Name

removeOuterParenthesesremoveOuterParenthesesremoveOuterParentheses – This function removes the outermost parentheses from every primitive substring of a valid parentheses string.

### Parameters

- sss: A valid parentheses string consisting only of the characters `‘(’` and `‘)’`.
The string may contain multiple primitive valid parentheses substrings concatenated together.

### Return Value

- Returns a new string formed by removing the outermost parentheses from every primitive part of the input string.

- The returned string preserves the internal structure of the parentheses inside each primitive substring.

## Constraints

- 1≤T≤1001 \le T \le 1001≤T≤100

- 1≤∣s∣≤1051 \le |s| \le 10^{5}1≤∣s∣≤105

- s contains only the characters ‘(’ and ‘)’. {s} \text{ contains only the characters `(' and `)'.}s contains only the characters ‘(’ and ‘)’.

- s is guaranteed to be a valid parentheses string. {s} \text{ is guaranteed to be a valid parentheses string.}s is guaranteed to be a valid parentheses string.

### Input Format

The first line contains an integer TTT, the number of test cases.

Each test case consists of a single line containing the string sss.

### Output Format

For each test case, print the modified string after removing the outermost parentheses.

### Sample 1:

Input

Output

```
4
((()))
(()(()))
()()
((())())(()(()))

```

```
(())
()(())
(())()()(())

```

### Explanation:

**Test Case 1**:

`s = ((()))`

Primitive decomposition = `"((()))"`

After removing the outermost parentheses -> `(())`

**Test Case 2:**

`s = (()(()))`
Primitive decomposition = `"(()(()))"`
After removing the outermost -> `()(())`

**Test Case 3:**

`s = ()()`

Primitive decomposition = `"()" + "()"`

After removing the outermost from each -> `"" + "" = ""`
