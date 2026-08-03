# Bone Appetit Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-08-03 |

---

## Problem Statement

### Bone Appetit

*Trick or treat, bags of sweets, ghosts are walking down the street*

It's Halloween and Suri Bhai is out to get his treats.

There are two sectors in his neighborhood, "Bones" and "Blood". They have NNN and MMM people, respectively.

Each person in "Bones" will hand out XXX treats, and each person in "Blood" will hand out YYY treats.

How many treats does Suri Bhai get from visiting everyone in his neighborhood in total?

### Input Format

- The first line of input contains two space-separated integers NNN and MMM — the number of people in "Bones" and "Blood", respectively.

- The second line of input contains two space-separated integers XXX and YYY — the number of treats handed out by each person in "Bones" and "Blood", respectively.

### Output Format

For each test case output a single integer: the total number of treats Suri Bhai will receive.

### Constraints

- 0≤N,M≤1000 \leq N,M \leq 1000≤N,M≤100

- 0≤X,Y≤10000 \leq X,Y \leq 10000≤X,Y≤1000

### Sample 1:

Input

Output

```
4 2
5 6

```

```
32

```

### Explanation:

- "Bones" has 444 people, each of who will give out 555 treats, for a total of 4×5=204\times 5 = 204×5=20 treats.

- "Blood" has 222 people, each of who will give out 666 treats, for a total of 2×6=122\times 6 = 122×6=12 treats.

- The total number of treats is 20+12=3220 + 12 = 3220+12=32.

### Sample 2:

Input

Output

```
5 0
0 2

```

```
0

```

### Explanation:

- "Bones" has 555 people, each of who will give out 000 treats, for a total of 5×0=05\times 0 = 05×0=0 treats.

- "Blood" has 000 people, each of who will give out 222 treats, for a total of 0×2=00\times 2 = 00×2=0 treats.

- The total number of treats is 0+0=00 + 0 = 00+0=0.
