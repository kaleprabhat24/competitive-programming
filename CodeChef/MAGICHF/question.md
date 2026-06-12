# Magician versus Chef Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-12 |

---

## Problem Statement

### Magician versus Chef

When Chef was visiting a fair in Byteland, he met a magician. The magician had NNN boxes (numbered 111 through NNN) and a gold coin. He challenged Chef to play a game with him; if Chef won the game, he could have the coin, but if he lost, the magician would kidnap Chef.

At the beginning of the game, the magician places the gold coin into the XXX-th box. Then, he performs SSS swaps. To win, Chef needs to correctly identify the position of the coin after all swaps.

In each swap, the magician chooses two boxes AAA and BBB, moves the contents of box AAA (before the swap) to box BBB and the contents of box BBB (before the swap) to box AAA.

### Input

- The first line of the input contains a single integer TTT denoting the number of test cases. The description of TTT test cases follows.

- The first line of each test case contains three space-separated integers NNN, XXX and SSS.

- SSS lines follow. Each of these lines contains two space-separated integers AAA and BBB denoting a pair of swapped boxes.

### Output

For each test case, print a single line containing one integer — the number of the box containing the gold coin after all swaps are performed.

### Constraints

- 1≤T≤1001 \le T \le 1001≤T≤100

- 2≤N≤1052 \le N \le 10^52≤N≤105

- 1≤S≤1041 \le S \le 10^41≤S≤104

- 1≤X,A,B≤N1 \le X, A, B \le N1≤X,A,B≤N

- A≠BA \neq BA=B

- the sum of SSS for all test cases does not exceed 2∗1052*10^52∗105

### Subtasks

**Subtask #1 (100 points):** original constraints

### Sample 1:

Input

Output

```
1
5 2 4
4 2
3 4
3 2
1 2
```

```
1
```

### Explanation:

**Example case 1:**

- after the first swap, the coin is in box 444

- after the second swap, the coin is in box 333

- after the third swap, the coin is in box 222

- after the fourth swap, the coin is in box 111
