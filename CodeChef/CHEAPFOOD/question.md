# Best Coupon Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-13 |

---

## Problem Statement

### Best Coupon

Chef is ordering food online (instead of cooking) and the bill comes out to be Rs. XXX. Chef can use one of the following two coupons to avail a discount.

- Get 101010 percent off on the bill amount

- Get a flat discount of Rs. 100100100 on the bill amount

What is the maximum discount Chef can avail?

### Input Format

- The first line contains a single integer TTT - the number of test cases. Then the test cases follow.

- The first and only line of each test case contains a single integer XXX - the bill amount before discount.

### Output Format

For each testcase, output the maximum discount Chef can avail.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 100≤X≤10000100 \leq X \leq 10000100≤X≤10000

- XXX is a multiple of 100100100.

### Sample 1:

Input

Output

```
3
300
1300
1000

```

```
100
130
100

```

### Explanation:

**Test case 1:** Using the second coupon, Chef can get a flat discount of Rs. 100100100, which is maximum.

**Test case 2:** Using the first coupon, Chef can get a 101010 percent discount of Rs. 130130130, which is maximum.

**Test case 3:** No matter which coupon Chef chooses Chef will get a discount of Rs. 100100100.
