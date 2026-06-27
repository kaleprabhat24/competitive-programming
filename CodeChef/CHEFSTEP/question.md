# Chef and Steps Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-27 |

---

## Problem Statement

### Chef and Steps

In order to establish dominance amongst his friends, Chef has decided that he will only walk in large steps of length exactly KKK feet. However, this has presented many problems in Chef’s life because there are certain distances that he cannot traverse. Eg. If his step length is 555 feet, he cannot travel a distance of 121212 feet. Chef has a strict travel plan that he follows on most days, but now he is worried that some of those distances may become impossible to travel. Given NNN distances, tell Chef which ones he cannot travel.

### Input:

- The first line will contain a single integer TTT, the number of test cases.

- The first line of each test case will contain two space separated integers - NNN, the number of distances, and KKK, Chef’s step length.

- The second line of each test case will contain NNN space separated integers, the ithi^{th}ith of which represents DiD_iDi​, the distance of the ithi^{th}ith path.

### Output:

For each testcase, output a string consisting of NNN characters. The ithi^{th}ith character should be 111 if the distance is traversable, and 000 if not.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤N≤10001 \leq N \leq 10001≤N≤1000

- 1≤K≤1091 \leq K \leq 10^91≤K≤109

- 1≤Di≤1091 \leq D_i \leq 10^91≤Di​≤109

### Subtasks

- 100 points : No additional constraints.

### Sample 1:

Input

Output

```
1
5 3
12 13 18 20 27216
```

```
10101
```

### Explanation:

The first distance can be traversed in 444 steps.

The second distance cannot be traversed.

The third distance can be traversed in 666 steps.

The fourth distance cannot be traversed.

The fifth distance can be traversed in 907290729072 steps.
