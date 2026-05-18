# Chef Diet Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-18 |

---

## Problem Statement

### Chef Diet

### Read problems statements in Hindi, Mandarin Chinese, Russian, Vietnamese, and Bengali as well.

Chef decided to go on a diet during the following NNN days (numbered 111 through NNN). Part of the diet plan is to eat KKK grams of protein during each day. For each valid iii, Chef wants to buy AiA_iAi​ grams of protein in the morning of the iii-th day and then eat KKK grams of protein as part of his dinner. If he has any protein remaining, he can store it and use it in later dinners. Initially, Chef is storing 000 grams of protein.

Determine whether Chef will have enough protein all the time during his diet. In case he will not have enough, find the first day on which Chef will be unable to eat KKK grams of protein.

### Input

- The first line of the input contains a single integer TTT denoting the number of test cases. The description of TTT test cases follows.

- The first line of each test case contains two space-separated integers NNN and KKK.

- The second line contains NNN space-separated integers A1,A2,…,ANA_1, A_2, \ldots, A_NA1​,A2​,…,AN​.

### Output

For each test case:

- If Chef will have enough protein during his diet, print a single line containing the string `"YES"`.

- Otherwise, print a single line containing the string `"NO"`, followed by a space and one integer — the first day when Chef will be unable to eat KKK grams of protein.

### Constraints

- 1≤T≤2001 \le T \le 2001≤T≤200

- 1≤N≤1001 \le N \le 1001≤N≤100

- 1≤K≤1061 \le K \le 10^61≤K≤106

- 1≤Ai≤1061 \le A_i \le 10^61≤Ai​≤106 for each valid iii

### Sample 1:

Input

Output

```
3
4 5
7 3 6 5
3 4
3 10 10
3 4
8 1 1
```

```
YES
NO 1
NO 3
```

### Explanation:

**Example case 1:** On the first day, Chef buys 777 grams, eats 555 and stores 222 grams for later. On the second day, he buys 333 grams, so he has 555 grams, which is just enough for the dinner on this day. On the third day, he buys 666 grams, eats 555 and stores 111, and on the fourth day, he buys 555 grams, so he has 666 grams — enough for dinner. In the end, he had enough protein to eat during all four dinners.

**Example case 2:** Chef needs to eat 444 grams of protein on the first day, but he only has 333 grams, so he does not have a sufficient amount of protein already for the first dinner.
