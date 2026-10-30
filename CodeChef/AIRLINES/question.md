# AIRLINES

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-10-30 |

---

## Problem Statement

### Codechef Airlines

Chef has opened a new airline. Chef has 101010 airplanes where each airplane has a capacity of XXX passengers.

On the first day itself, YYY people are willing to book a seat in **any one** of Chef's airplanes.

Given that Chef charges ZZZ rupees for each ticket, find the **maximum** amount he can earn on the first day.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of three space-separated integers X,Y,X, Y,X,Y, and ZZZ — the capacity of each airplane, the number of people willing to book a seat in any one of Chef's airplanes on the first day, and the cost of each seat respectively.

### Output Format

For each test case, output on a new line, the **maximum** amount Chef can earn on the first day.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤X,Y,Z≤1001 \leq X, Y, Z \leq 1001≤X,Y,Z≤100

### Sample 1:

Input

Output

```
4
2 15 10
1 10 1
5 60 100
1 11 7

```

```
150
10
5000
70

```

### Explanation:

**Test case 111:** Chef has 101010 airplanes and each airplane has a capacity of 222 passengers. Thus, there are 202020 seats available in total.

There are 151515 people who want to book a seat. Since we have enough seats for everyone, all 151515 people can book their seats and pay 101010 rupees each. The total money Chef earns is 15⋅10=15015\cdot 10 = 15015⋅10=150.

**Test case 222:** Chef has 101010 airplanes and each airplane has a capacity of 111 passenger. Thus, there are 101010 seats available in total.

There are 101010 people who want to book a seat. Since we have enough seats for everyone, all 101010 people can book their seats and pay 111 rupee each. The total money Chef earns is 10⋅1=1010\cdot 1 = 1010⋅1=10.

**Test case 333:** Chef has 101010 airplanes and each airplane has a capacity of 555 passengers. Thus, there are 505050 seats available in total.

There are 606060 people who want to book a seat. Since we have only 505050 seats, only 505050 people can book their seats and pay 100100100 rupees each. The total money Chef earns is 50⋅100=500050\cdot 100 = 500050⋅100=5000.

**Test case 444:** Chef has 101010 airplanes and each airplane has a capacity of 111 passenger. Thus, there are 101010 seats available in total.

There are 111111 people who want to book a seat. Since we have only 101010 seats, only 101010 people can book their seats and pay 777 rupees each. The total money Chef earns is 10⋅7=7010\cdot 7 = 7010⋅7=70.
