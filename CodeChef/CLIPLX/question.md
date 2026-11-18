# IPL and RCB Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-18 |

---

## Problem Statement

### IPL and RCB

It's IPL time and as usual RCB are finding it tough to qualify for playoffs.  RCB needs a minimum of XXX more points to qualify for playoffs in their remaining YYY matches. A win, tie and loss in a match will yield 2,1,02,1,02,1,0 points respectively to a team.

You being a true RCB supporter want to find the minimum number of matches RCB needs to win to qualify for playoffs. It is guaranteed that RCB will qualify for playoffs if they win all their remaining YYY matches.

### Input:

- First line will contain TTT, number of testcases. Then the testcases follow.

- Each testcase contains of a single line of input, two space separated integers X,YX, YX,Y

### Output:

For each testcase, output in a single line the minimum number of matches RCB must win to qualify for playoffs.

### Constraints :

- 1≤T≤100001 \leq T \leq 100001≤T≤10000

- 1≤X≤1001 \leq X \leq 1001≤X≤100

- 1≤Y≤1001 \leq Y \leq 1001≤Y≤100

- 1≤X≤2⋅Y1 \leq X \leq 2\cdot Y1≤X≤2⋅Y

### Sample 1:

Input

Output

```
2
10 5
1 5
```

```
5
0
```

### Explanation:

- In first case X=10X=10X=10 and Y=5Y=5Y=5, so RCB needs 101010 points from remaining 555 matches to qualify for playoffs. It is only possible if they win all their remaining 555 matches.

- In second case X=1X=1X=1 and Y=5Y=5Y=5, so RCB needs 111 points from their remaining 555 matches to qualify for playoffs. It can be done if they tie any one of their 555 matches and lose the remaining 444. So they need to win 000 matches.
