# Practice Coding Problem

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-01 |

---

## Problem Statement

### Food Resources

MMM people are going on an adventure, and need to decide how to divide their food resources.

There are NNN types of food items with them, the iii-th food type having AiA_iAi​ units. A single person needs to eat one unit of food in one day.

Each person must eat a single type of food for the entire duration of the adventure. Different people may eat the same, or different types of food.

The duration of the adventure is not yet decided, but this friend group wants to go for as many days as possible. What is the maximum number of days where they will not run out of food, while satisfying the constraint?

### Input Format

- The first line contains 222 integers, NNN and MMM - the number of food types, and the number of people.

- The second line contains NNN integers - A1,A2,…,ANA_1, A_2, \ldots, A_NA1​,A2​,…,AN​.

### Output Format

Output the maximum number of days of the adventure.

### Constraints

- 1≤N,M≤1051 \le N, M \le 10^51≤N,M≤105

- 1≤Ai≤1041 \le A_i \le 10^41≤Ai​≤104

### Sample 1:

Input

Output

```
5 3
1 4 2 1 1

```

```
2

```

### Explanation:

Person 111 can eat food type 222, person 222 can also eat food type 222, and finally person 333 eats food type 333. This way the adventure can last for 222 days.

### Sample 2:

Input

Output

```
3 4
1 1 1

```

```
0

```

### Explanation:

There are 444 people, and only 333 total units of food. Therefore, the adventure cannot take place, and we should output 000 days.
