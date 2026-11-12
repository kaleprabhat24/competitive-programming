# Chef and Gym Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-12 |

---

## Problem Statement

### Chef and Gym

Chef has decided to join a Gym in ChefLand and if possible, also hire a personal trainer at the gym. The monthly cost of the gym is XXX and personal training will cost him an additional YYY per month. Chef's total budget per month is only ZZZ. Print `1` if Chef can only join the gym, `2` if he can also have a personal trainer, and `0` if he can't even join the gym.

**Note** that if Chef wants to hire a personal trainer, he *must* join the gym — he cannot hire the trainer without joining the gym.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases. Then the test cases follow.

- Each test case consists of a single line of input containing three space-separated integers X,Y,ZX, Y, ZX,Y,Z.

### Output Format

For each test case, output in a single line `2` if Chef can go to the gym and have a trainer, `1` if Chef can only go to the gym, `0` if he can't even go to the gym.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X,Y,Z≤1001 \leq X,Y,Z \leq 1001≤X,Y,Z≤100

### Sample 1:

Input

Output

```
4
1 2 3
10 12 13
23 1 22
23 1 63
```

```
2
1
0
2
```

### Explanation:

**Test case 111:** Since the total cost of Chef getting a gym membership and a trainer is 1+2=31+2 = 31+2=3 which is equal to his budget of 333, Chef can get both a gym membership and a trainer.

**Test case 222:** Since the total cost of Chef getting a gym membership and a trainer is 10+12=2210+12 = 2210+12=22 which is greater than his budget of 131313, he can't get both a gym membership and a trainer. However, the cost of the gym membership is 101010 which is less than his budget of 131313, so Chef can get only a gym membership.

**Test case 333:** Since the cost of Chef getting a gym membership is 232323 which is greater than his budget of 222222, Chef can't even get the gym membership.

**Test case 444:** The same costs as the previous test, but this time Chef has enough money to afford both the membership and a personal trainer.
