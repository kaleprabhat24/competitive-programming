# Airline Restrictions Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-27 |

---

## Problem Statement

### Airline Restrictions

### Read problem statements in Bengali, Mandarin Chinese, Russian, and Vietnamese as well.

Chef has 333 bags that she wants to take on a flight. They weigh AAA, BBB, and CCC kgs respectively. She wants to check-in exactly two of these bags and carry the remaining one bag with her.

The airline restrictions says that the total sum of the weights of the bags that are checked-in cannot exceed DDD kgs and the weight of the bag which is carried cannot exceed EEE kgs. Find if Chef can take all the three bags on the flight.

### Input Format

- The first line of the input contains a single integer TTT denoting the number of test cases. The description of TTT test cases follows.

- Each testcase contains a single line of input, five space separated integers A,B,C,D,EA, B, C, D, EA,B,C,D,E.

### Output Format

For each testcase, output in a single line answer `"YES"` if Chef can take all the three bags with her or `"NO"` if she cannot.

You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

### Constraints

- 1≤T≤360001 \leq T \leq 360001≤T≤36000

- 1≤A,B,C≤101 \leq A, B, C \leq 101≤A,B,C≤10

- 15≤D≤2015 \leq D \leq 2015≤D≤20

- 5≤E≤105 \leq E \leq 105≤E≤10

### Subtasks

**Subtask #1 (100 points):** original constraints

### Sample 1:

Input

Output

```
3
1 1 1 15 5
8 7 6 15 5
8 5 7 15 6
```

```
YES
NO
YES
```

### Explanation:

**Test case 111:** Chef can check-in the first and second bag (since 1+1=2≤151 + 1 = 2 \le 151+1=2≤15) and carry the third bag with her (since 1≤51 \le 51≤5).

**Test case 222:** None of the three bags can be carried in hand without violating the airport restrictions.

**Test case 333:** Chef can check-in the first and the third bag (since 8+7≤158 + 7 \le 158+7≤15) and carry the second bag with her (since 5≤65 \le 65≤6).
