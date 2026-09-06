# Read Pages Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-06 |

---

## Problem Statement

### Read Pages

Chef has started studying for the upcoming test. The textbook has NNN pages in total. Chef wants to read at most XXX pages a day for YYY days.

Find out whether it is possible for Chef to complete the whole book.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- The first and only line of each test case contains three space-separated integers N,X,N, X,N,X, and YYY — the number of pages, the number of pages Chef can read in a day, and the number of days.

### Output Format

For each test case, output on a new line, `YES`, if Chef can complete the whole book in given time, and `NO` otherwise.

You may print each character of the string in uppercase or lowercase. For example, `Yes`, `YES`, `yes`, and `yES` are all considered identical.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤N≤1001 \leq N \leq 1001≤N≤100

- 1≤X,Y≤101 \leq X, Y \leq 101≤X,Y≤10

### Sample 1:

Input

Output

```
4
5 2 3
10 3 3
7 7 1
3 2 1

```

```
YES
NO
YES
NO

```

### Explanation:

**Test case 111:** Chef can read two pages on the first day, two on the second day, and the remaining one on the third day.

**Test case 222:** Chef cannot complete all ten pages in three days.

**Test case 333:** Chef can read all seven pages in one day.

**Test case 444:** Chef cannot complete all three pages in one day.
