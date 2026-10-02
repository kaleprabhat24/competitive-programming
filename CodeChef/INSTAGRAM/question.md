# Instagram Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-10-02 |

---

## Problem Statement

### Instagram

Chef categorises an instagram account as *spam*, if, the *following* count of the account is more than 101010 times the count of *followers*.

Given the *following* and *follower* count of an account as XXX and YYY respectively, find whether it is a *spam* account.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of two space-separated integers XXX and YYY — the *following* and *follower* count of an account, respectively.

### Output Format

For each test case, output on a new line, `YES`, if the account is *spam* and `NO` otherwise.

You may print each character of the string in uppercase or lowercase. For example, the strings `YES`, `yes`, `Yes` and `yES` are identical.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X,Y≤1001 \leq X, Y \leq 1001≤X,Y≤100

### Sample 1:

Input

Output

```
4
1 10
10 1
11 1
97 7

```

```
NO
NO
YES
YES

```

### Explanation:

**Test case 111:** The following count is 111 while the follower count is 101010. Since the following count is not more than 101010 times the follower count, the account is not spam.

**Test case 222:** The following count is 101010 while the follower count is 111. Since the following count is not **more** than 101010 times the follower count, the account is not spam.

**Test case 333:** The following count is 111111 while the follower count is 111. Since the following count is more than 101010 times the follower count, the account is spam.

**Test case 444:** The following count is 979797 while the follower count is 777. Since the following count is more than 101010 times the follower count, the account is spam.
