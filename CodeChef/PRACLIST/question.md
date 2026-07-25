# How many unattempted problems Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-07-25 |

---

## Problem Statement

### How many unattempted problems

*CodeChef recently revamped its practice page to make it easier for users to identify the next problems they should solve by introducing some new features:*

- *Recent Contest Problems - contains only problems from the last 2 contests*

- *Separate Un-Attempted,  Attempted, and All tabs*

- *Problem Difficulty Rating - the Recommended dropdown menu has various difficulty ranges so that you can attempt the problems most suited to your experience*

- *Popular Topics and Tags*

Our Chef is currently practicing on CodeChef and is a beginner. The count of ‘All Problems’ in the Beginner section is XXX. Our Chef has already ‘Attempted’ YYY problems among them. How many problems are yet ‘Un-attempted’?

### Input Format

- The first and only line of input contains two space-separated integers XXX and YYY — the count of 'All problems' in the Beginner's section and the count of Chef's 'Attempted' problems, respectively.

### Output Format

Output a single integer in a single line — the number of problems that are yet 'Un-attempted'

### Constraints

- 1≤Y≤X≤10001 \leq Y \leq X \leq 10001≤Y≤X≤1000

### Subtasks

- **Subtask 1 (100 points):**

Original constraints.

### Sample 1:

Input

Output

```
10 4
```

```
6
```

### Sample 2:

Input

Output

```
10 10
```

```
0
```

### Sample 3:

Input

Output

```
1000 990
```

```
10
```

### Sample 4:

Input

Output

```
500 1
```

```
499
```

### Explanation:

**Test case 111:** There are 101010 problems in total in the Beginner's section, out of which 444 have been attempted. Hence, there are 666 Un-attempted problems.

**Test case 222:** There are 101010 problems in total in the Beginner's section, out of which all have been attempted. Hence, there are 000 Un-attempted problems.

**Test case 333:** There are 100010001000 problems in total in the Beginner's section, out of which 990990990 have been attempted. Hence, there are 101010 Un-attempted problems.

**Test case 444:** There are 500500500 problems in total in the Beginner's section, out of which only 111 has been attempted. Hence, there are 499499499 Un-attempted problems.
