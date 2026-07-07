# Pet Store Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-07-07 |

---

## Problem Statement

### Pet Store

Alice and Bob went to a pet store. There are NNN animals in the store where the ithi^{th}ith animal is of type AiA_iAi​.

Alice decides to buy some of these NNN animals. Bob decides that he will buy **all** the animals **left** in the store after Alice has made the purchase.

Find out whether it is possible that Alice and Bob end up with **exactly same** multiset of animals.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of multiple lines of input.

The first line of each test case contains an integer NNN — the number of animals in the store.

- The next line contains NNN space separated integers, denoting the type of each animal.

### Output Format

For each test case, output on a new line, `YES`, if it is possible that Alice and Bob end up with **exactly same** multiset of animals and `NO` otherwise.

You may print each character in uppercase or lowercase. For example, the strings `YES`, `yes`, `Yes`, and `yES` are considered identical.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤N≤1051 \leq N \leq 10^51≤N≤105

- 1≤Ai≤1001 \leq A_i \leq 1001≤Ai​≤100

- The sum of NNN over all test cases won't exceed 2⋅1052\cdot 10^52⋅105.

### Sample 1:

Input

Output

```
4
3
4 4 4
4
2 3 3 2
4
1 2 2 3
6
5 5 1 5 1 5

```

```
NO
YES
NO
YES

```

### Explanation:

**Test case 111:** There are 444 possible cases:

- Alice does not buy anything: Bob will buy all the animals and will have 333 animals of type 444.

- Alice buys 111 animal of type 444: Bob will buy the remaining two animals of type 444.

- Alice buys 222 animals of type 444: Bob will buy the remaining one animal of type 444.

- Alice buys all 333 animals of type 444: Bob will not buy anything.

In no case, both Alice and Bob can have the exactly same multiset of pets.

**Test case 222:** If Alice buys animals 111 and 222, having types 222 and 333 respectively, Bob will buy animals 333 and 444, having types 333 and 222 respectively. Thus, both Alice and Bob have 111 animal of type 222 and 111 animal of type 333.

**Test case 333:** It can be proven that Alice and Bob cannot have the same multiset of pets in any case.

**Test case 444:** If Alice buys animals 1,2,1, 2, 1,2, and 555, having types 5,5,5, 5,5,5, and 111 respectively, Bob will buy animals 3,4,3, 4,3,4, and 666, having types 1,5,1, 5,1,5, and 555 respectively. Thus, both Alice and Bob have 111 animal of type 111 and 222 animals of type 555.
