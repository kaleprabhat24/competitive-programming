# Just One More Episode Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-08-29 |

---

## Problem Statement

### Just One More Episode

Chef has to attend an exam that starts in XXX minutes, but of course, watching shows takes priority.

Every episode of the show that Chef is watching, is 242424 minutes long.

If he starts watching a new episode now, will he finish watching it **strictly before** the exam starts?

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of one line of input, containing a single integer XXX — the amount of time from now at which Chef's exam starts.

### Output Format

For each test case, output on a new line the answer — `YES` if Chef will finish his episode before the exam starts, and `NO` otherwise.

Each character of the output may be printed in either lowercase or uppercase, i.e, the string `Yes`, `YES`, `yes`, YeS` will all be treated as equivalent.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X≤1001 \leq X \leq 1001≤X≤100

### Sample 1:

Input

Output

```
4
30
23
60
24

```

```
Yes
No
Yes
No

```

### Explanation:

**Test case 111:** Chef has 303030 minutes of free time, which is easily enough to finish watching a 242424-minute episode. Hence, the answer is `Yes`.

**Test case 222:** Chef has 232323 minutes of free time, which is not enough to finish watching a 242424-minute episode. Hence, the answer is `No`.

**Test case 333:** Chef has 606060 minutes of free time, which is easily enough to finish watching a 242424-minute episode. Hence, the answer is `Yes`.

**Test case 444:** Chef has 242424 minutes of free time. He will finish watching the episode exactly when the exam starts, and not **strictly** before it. Hence, the answer is `No`.
