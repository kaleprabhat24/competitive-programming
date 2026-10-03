# Lambence Combo Coupons

| Field | Value |
|-------|-------|
| **Platform** | HackerRank |
| **Language** | C++ |
| **Solved On** | 2026-10-03 |

---

## Problem Statement

The college canteen counter has **N** items in a fixed order. Item *i* costs **a_i** rupees and is either a **main course (M)** or a **side item (S)**.

A **combo** is a block of **consecutive** items on the counter (items i, i+1, ..., j).

Students pay only with canteen coupons worth exactly **M** rupees each, and the canteen never returns change. So a combo can be bought only if its total price is a **multiple of M**.

The canteen also has two rules for a combo:

- it must have **at least L items**, and

- it must contain **at least one main course**.

Count the number of different combos (different pairs i, j) that follow both rules and can be paid exactly with coupons.

**Example**

N = 6, M = 5, L = 2, prices = 3 2 5 1 4 5, types = SMSSMS

The valid combos are items 1-2 (total 5), 1-3 (10), 1-5 (15), 1-6 (20), 3-5 (10), 3-6 (15), 4-5 (5) and 4-6 (10). Each has at least 2 items, contains item 2 or item 5 (a main course), and its total is a multiple of 5. The answer is **8**.

Items 3-4 (total 6) is not a multiple of 5, and item 3 alone (total 5) is too small and has no main course.

Note: the answer can be very large.

**Input Format**

The first line contains three space-separated integers **N**, **M** and **L**.
The second line contains N space-separated integers a_1, a_2, ..., a_N, the prices.
The third line contains a string of N characters, each M or S: the type of each item.

**Constraints**

- 1 <= N <= 10^5

- 1 <= M <= 10^9 + 7

- 1 <= L <= 10^5 (L may be larger than N)

- 1 <= a_i <= 10^9

**Output Format**

Print a single integer: the number of valid combos.

**Sample Input 0**

```
6 5 2
3 2 5 1 4 5
SMSSMS

```

**Sample Output 0**

```
8

```

**Sample Input 1**

```
4 3 1
3 3 3 3
SSMS

```

**Sample Output 1**

```
6

```
