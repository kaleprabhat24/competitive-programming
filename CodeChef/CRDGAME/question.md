# Chef and Card Game Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-07-06 |

---

## Problem Statement

### Chef and Card Game

Chef is playing a card game with his friend Morty Smith.

The rules of the game are as follows:

- There are two piles of cards, pile AAA and pile BBB, each with NNN cards in it. Pile AAA belongs to Chef and pile BBB belongs to Morty.

- Each card has one positive integer on it

- The ‘power’ of a card is defined as the sum of digits of the integer on that card

- The game consists of NNN rounds

- In each round, both players simultaneously draw one card each from the top of their piles and the player who draws the card with higher power wins this round and gets a point. If the powers of both players' cards are equal then they get 111 point each.

- The winner of the game is the player who has more points at the end of NNN rounds. If both players have equal number of points then the game ends in a draw.

The game is now over and Chef has told Morty to find the winner. Unfortunately, this task is too complex for him. Help Morty find the winner.

### Input:

- First line will contain TTT, number of testcases.

- The first line of each test case will contain NNN, the number of rounds played.

- The ithi^{th}ith of the next NNN lines of each test case will contain AiA_iAi​ and BiB_iBi​, the number on the card drawn by Chef and Morty respectively in round iii.

### Output:

For each test case, output two space separated integers on a new line:

Output

- 000 if Chef wins,

- 111 if Morty wins,

- 222 if it is a draw,

followed by the number of points the winner had.

(If it is a draw then output either player’s points).

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤N≤1001 \leq N \leq 1001≤N≤100

- 1≤Ai,Bi≤1091 \leq A_i, B_i \leq 10^91≤Ai​,Bi​≤109

### Subtasks

- 100100100 points : No additional constraints

### Sample 1:

Input

Output

```
2
3
10 4
8 12
7 6
2
5 10
3 4
```

```
0 2
2 1
```

### Explanation:

**Test Case** 111:

**Round** 111:

Chef’s card has power 1+01+01+0 = 111,

Morty’s card has power 444.

Therefore, Morty wins the round.

**Round** 222:

Chef’s card has power 888,

Morty’s card has power 1+21 + 21+2 = 333.

Therefore, Chef wins the round.

**Round** 333:

Chef’s card has power 777,

Morty’s card has power 666.

Therefore, Chef wins the round.

Therefore, Chef wins the game with 222 points (Morty has 111 point).

**Test Case** 222:

**Round** 111:

Chef’s card has power 555,

Morty’s card has power 1+0=11 + 0 = 11+0=1.

Therefore, Chef wins the round.

**Round** 222:

Chef’s card has power 333,

Morty’s card has power 444.

Therefore, Morty wins the round.

Therefore, the game ends in a draw and both players have 111 point each.
