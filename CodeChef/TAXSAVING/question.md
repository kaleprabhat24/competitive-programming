# Saving Taxes Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-07-22 |

---

## Problem Statement

### Saving Taxes

In Chefland, everyone who earns **strictly** more than YYY rupees per year, has to pay a tax to Chef. Chef has allowed a special scheme where you can invest any amount of money and claim exemption for it.

You have earned XXX (X>Y)(X \gt Y)(X>Y) rupees this year. Find the **minimum** amount of money you have to invest so that you don't have to pay taxes this year.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a single line of input consisting of two space separated integers XXX and YYY denoting the amount you earned and the amount above which you will have to pay taxes.

### Output Format

For each test case, output a single integer, denoting the minimum amount you need to invest.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤Y<X≤1001 \leq Y \lt X \leq 1001≤Y<X≤100

### Sample 1:

Input

Output

```
4
4 2
8 7
5 1
2 1

```

```
2
1
4
1

```

### Explanation:

**Test case 111:** The amount above which you will have to pay taxes is 222. Since you earn 444 rupees, you need to invest at least 222 rupees. After investing 222 rupees, you will remain with an effective income 4−2=24 - 2 = 24−2=2 rupees which will not be taxed.

**Test case 222:** The amount above which you will have to pay taxes is 777. Since you earn 888 rupees, you need to invest at least 111 rupees.

**Test case 333:** The amount above which you will have to pay taxes is 111. Since you earn 555 rupees, you need to invest at least 444 rupees.

**Test case 444:** The amount above which you will have to pay taxes is 111. Since you earn 222 rupees, you need to invest at least 111 rupees.
