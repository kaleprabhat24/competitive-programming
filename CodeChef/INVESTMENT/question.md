# Good Investment or Not Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-13 |

---

## Problem Statement

### Good Investment or Not

Chef has invested his money at an interest rate of XXX percent per annum while the current inflation rate is YYY percent per annum.

An investment is called *good* if and only if the interest rate of the investment is **at least twice** of the inflation rate.

Determine whether the investment made by Chef is *good* or not.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of two integers XXX and YYY, the interest rate and the current inflation rate respectively.

### Output Format

For each test case, output `YES` if the investment is good, `NO` otherwise.

You can output any letter in any case. For example `YES`, `yes`, `yES` are all considered same.

### Constraints

- 1≤T≤4001 \leq T \leq 4001≤T≤400

- 1≤X,Y≤201 \leq X, Y \leq 201≤X,Y≤20

### Sample 1:

Input

Output

```
5
7 4
6 3
2 4
10 10
20 1

```

```
NO
YES
NO
NO
YES

```

### Explanation:

**Test case 111:** The interest rate is 777 and the current inflation rate is 444. Since the interest rate is less than twice of current inflation rate, the investment is not good.

**Test case 222:** The interest rate is 666 and the current inflation rate is 333. Since the interest rate is equal to twice of current inflation rate, the investment is good.

**Test case 333:** The interest rate is 222 and the current inflation rate is 444. Since the interest rate is less than twice of current inflation rate, the investment is not good.

**Test case 444:** The interest rate is 101010 and the current inflation rate is 101010. Since the interest rate is less than twice of current inflation rate, the investment is not good.

**Test case 555:** The interest rate is 202020 and the current inflation rate is 111. Since the interest rate is greater than twice of current inflation rate, the investment is good.
