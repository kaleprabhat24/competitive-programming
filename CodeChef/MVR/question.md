# Messi vs Ronaldo Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-08-26 |

---

## Problem Statement

### Messi vs Ronaldo

In Chefland, a football player gets 222 points for each goal and 111 point for each assist.

Messi has AAA goals and BBB assists this season, whereas Ronaldo has XXX goals and YYY assists.

Find out the player with more points this season.

### Input Format

- The first and only line of input will contains four space-separated integers AAA, BBB, XXX and YYY, the number of goals and assists that Messi has and the number of goals and assists that Ronaldo has, respectively.

### Output Format

Print a single line containing:

- `Messi`, if Messi has more points than Ronaldo.

- `Ronaldo`, if Ronaldo has more points than Messi.

- `Equal`, if both have equal points.

You can print each character in uppercase or lowercase. For example, the strings `Messi`, `MESSI`, `messi`, and `MeSSi` are considered identical.

### Constraints

- 0≤A,B,X,Y≤1000 \leq A,B,X,Y \leq 1000≤A,B,X,Y≤100

### Sample 1:

Input

Output

```
40 30 50 10
```

```
Equal
```

### Explanation:

- Messi has 404040 goals and 303030 assists. Thus, his total points are 40⋅2+30=11040\cdot 2+30 = 11040⋅2+30=110.

- Ronaldo has 505050 goals and 101010 assists. Thus, his total points are 50⋅2+10=11050\cdot 2+10 = 11050⋅2+10=110.

Both have 110110110 points.

### Sample 2:

Input

Output

```
91 22 60 30 
```

```
Messi
```

### Explanation:

- Messi has 919191 goals and 222222 assists. Thus, his total points are 91⋅2+22=20491\cdot 2+22 = 20491⋅2+22=204.

- Ronaldo has 606060 goals and 303030 assists. Thus, his total points are 60⋅2+30=15060\cdot 2+30 = 15060⋅2+30=150.

Messi has 204204204 points, whereas Ronaldo has 150150150.

### Sample 3:

Input

Output

```
60 30 80 20
```

```
Ronaldo
```

### Explanation:

- Messi has 606060 goals and 303030 assists. Thus, his total points are 60⋅2+30=15060\cdot 2+30 = 15060⋅2+30=150.

- Ronaldo has 808080 goals and 202020 assists. Thus, his total points are 80⋅2+20=18080\cdot 2+20 = 18080⋅2+20=180.

Messi has 150150150 points, whereas Ronaldo has 180180180.
