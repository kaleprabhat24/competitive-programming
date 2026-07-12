# Coin Flip Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-07-12 |

---

## Problem Statement

### Coin Flip

**Little Elephant** was fond of inventing new games. After a lot of research, Little Elephant came to know that most of the animals in the forest were showing less interest to play the multi-player games. Little Elephant had started to invent single player games, and succeeded in inventing the new single player game named **COIN FLIP**.

In this game the player will use NNN coins numbered from 111 to NNN, and all the coins will be facing in "Same direction" (Either **Head** or **Tail**), which will be decided by the player before starting of the game.

The player needs to play NNN rounds. In the kkk-th round the player will flip the face of the all coins whose number is less than or equal to kkk. That is, the face of coin iii will be reversed, from **Head** to **Tail**, or, from **Tail** to **Head**, for i≤ki \le ki≤k.

Elephant needs to guess the total number of coins showing a particular face after playing NNN rounds. Elephant really becomes quite fond of this game **COIN FLIP** so Elephant plays GGG times. Please help the Elephant to find out the answer.

### Input:

- 

The first line of input contains an integer TTT, denoting the number of test cases. Then TTT  test cases follow.

- 

The first line of each test contains an integer GGG, denoting the number of games played by Elephant. Each of the following GGG lines denotes a single game, and contains 333 space-separated integers III, NNN, QQQ, where III denotes the initial state of the coins, NNN denotes the number of coins and rounds, and QQQ, which is either 111, or 222 as explained below.

Here I=1I=1I=1 means all coins are showing **Head** in the start of the game, and I=2I=2I=2 means all coins are showing **Tail** in the start of the game. Q=1Q=1Q=1 means Elephant needs to guess the total number of coins showing **Head** in the end of the game, and Q=2Q=2Q=2 means Elephant needs to guess the total number of coins showing Tail in the end of the game.

### Output:

For each game, output one integer denoting the total number of coins showing the particular face in the end of the game.

### Constraints:

1≤T≤101 \le T \le 101≤T≤10

1≤G≤20001 ≤ G ≤ 20001≤G≤2000

1≤N≤101 ≤ N ≤ 101≤N≤10

1≤I≤21 ≤ I ≤ 21≤I≤2

1≤Q≤21 ≤ Q ≤ 21≤Q≤2

### Sample 1:

Input

Output

```
1
2
1 5 1
1 5 2
```

```
2
3
```

### Explanation:

In the 1st game in Example,
I=1I=1I=1, so initial arrangement of coins are H H H H H,
and now Elephant will play 5 rounds and coin faces will be changed as follows<
After the 1st Round: T H H H H
After the 2nd Round: H T H H H
After the 3rd Round: T H T H H
After the 4th Round: H T H T H
After the 5th Round: T H T H T
Finally Q=1, so we need to find the total number of coins showing Head, which is 2

In the 2nd game in Example:
This is similar to the 1st game, except Elephant needs to find the total number of coins showing **Tail**.
So the Answer is 333. (Please see the final state of the coins in the 1st1^{st}1st game)
