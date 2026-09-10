# MATH1 Enrolment Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-10 |

---

## Problem Statement

### MATH1 Enrolment

For the upcoming semester, the admins of your university decided to keep a total of XXX seats for the `MATH-1` course. A student interest survey was conducted by the admins and it was found that YYY students were interested in taking up the `MATH-1` course.

Find the **minimum** number of **extra** seats that the admins need to add into the `MATH-1` course to make sure that every student who is interested in taking the course would be able to do so.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of two-space separated integers on a single line, XXX and YYY — the current number of seats up for enrolment and the number of students interested in taking up the course in the upcoming semester, respectively.

### Output Format

For each test case, output on a new line the **minimum** number of seats required to be added.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X,Y≤1051 \leq X, Y \leq 10^51≤X,Y≤105

### Sample 1:

Input

Output

```
4
1 1
12 34
50 49
49 50

```

```
0
22
0
1
```

### Explanation:

**Test case 111:** Exactly 111 seat is available for enrolment, and exactly 111 student is interested in taking up the course, hence addition of more seats is not required.

**Test case 222:** 121212 seats are available for enrolment but 343434 students are interested in taking up the course, hence the admins would have to add 34−12=2234-12=2234−12=22 more seats to make sure that every student interested in the course gets a seat.

**Test case 333:** 505050 seats are available for enrolment and 494949 students are interested in taking up the course, hence addition of more seats is not required.

**Test case 444:** 494949 seats are available for enrolment, but 505050 students are interested in taking up the course, hence the admins would have to add 50−49=150-49=150−49=1 more seat to make sure that every student interested in the course gets a seat.
