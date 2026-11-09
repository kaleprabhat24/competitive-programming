# Playlist Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-09 |

---

## Problem Statement

### Playlist

Chef's playlist contains 333 songs named A,BA, BA,B, and CCC, each of duration exactly XXX minutes. Chef generally plays these 333 songs in loop, i.e, A→B→C→A→B→C→A→…A \rightarrow B \rightarrow C \rightarrow A \rightarrow B \rightarrow C \rightarrow A \rightarrow \dotsA→B→C→A→B→C→A→…

Chef went on a train journey of NNN minutes and played his playlist on loop for the whole journey. How many times did he listen to the song CCC **completely**?

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases. The description of the test cases follows.

- Each test case consists of a single line of input, containing two space-separated integers N,XN, XN,X.

### Output Format

For each test case, output on a new line the number of times Chef listens to the song CCC **completely**.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤N≤1001 \leq N \leq 1001≤N≤100

- 1≤X≤101 \leq X \leq 101≤X≤10

### Sample 1:

Input

Output

```
5
6 1
5 1
11 2
5 8
100 9

```

```
2
1
1
0
3

```

### Explanation:

**Test case 111:** Since each song is of duration 111 minute and the journey is 666 minutes long, Chef listens each of the songs A,B,CA, B, CA,B,C twice.

**Test case 222:** Since each song is of duration 111 minute and the journey is 555 minutes long, Chef listens the songs A,BA, BA,B twice but CCC only once.

**Test case 333:** Since each song is of duration 222 minutes and the journey is 111111 minutes long, Chef listens the songs A,BA, BA,B twice but CCC only once. Note that Chef is in the middle of listening to song CCC for the second time when the journey ends, but it is not counted since he hasn't listened to it fully.

**Test case 444:** Chef cannot hear any song since the journey is shorter than his song duration.
