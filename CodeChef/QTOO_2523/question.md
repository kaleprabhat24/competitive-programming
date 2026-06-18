# Bi_lindrome! Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-18 |

---

## Problem Statement

### Bi_lindrome!

You are given a string SSS of length NNN.

Your task is to delete a subsequence of **maximum** length from the string, such that, after concatenating the remaining parts of the string, it becomes a palindrome of length **greater** than 111.

If this is possible, print the maximum length of the subsequence that can be deleted. Otherwise, print −1-1−1.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of 222 lines of input:

The first line consists the a single integer NNN - the length of string SSS.

- The second line contains string SSS, consisting of lowercase english alphabets.

### Output Format

For each test case, if it is possible to delete a subsequence under the given conditions, print a single integer, denoting the maximum length of the subsequence that can be deleted. Otherwise, print −1-1−1.

### Constraints

- 1≤T≤25001 \leq T \leq 25001≤T≤2500

- 3≤N≤1003 \leq N \leq 1003≤N≤100

- SSS consists of lowercase english alphabets.

### Sample 1:

Input

Output

```
3
6
babkhj
3 
abc 
4 
qtoo
```

```
4
-1
2 

```

### Explanation:

**Test case 111:** Possible ways to delete a subsequence are:

- Delete subsequence `khj` to get palindrome `bab`.

- Delete subsequence `akhj` to get palindrome `bb`.

The subsequence having maximum length that can be deleted is `akhj`, having length 444.

**Test case 222:** We cannot delete any subsequence under the given conditions.

**Test case 333:** We can delete the subsequence `qt` to obtain the string `oo`, which is a palindrome. This is the only subsequence that can be deleted and it has length 222.
