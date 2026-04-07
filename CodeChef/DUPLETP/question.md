# Dull Operation in Bit Manipulation

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-07 |

---

## Problem Statement

### Dull Operation

On Halloween, Chef is in a somber mood.

Chef has an **odd**  integer NNN that he has to decode.

To do so, Chef would like to find a pair of integers xxx and yyy (0≤x,y<2300 \leq x, y \lt 2^{30}0≤x,y<230) such that:

(x∣y)⋅(x⊕y)=N(x\mid y) \cdot (x\oplus y) = N(x∣y)⋅(x⊕y)=N

Help Chef find **any** such pair!

It can be proved that a valid pair always exists.

Here, ∣\mid∣ represents the bitwise OR operation, and ⊕\oplus⊕ represents the bitwise XOR operation.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- The first and only line of each test case contains a single **odd** integer NNN.

### Output Format

For each test case, output on a new line two space-separated integers xxx and yyy such that 0≤x,y<2300 \leq x, y \lt 2^{30}0≤x,y<230, and

(x∣y)⋅(x⊕y)=N(x\mid y) \cdot (x\oplus y) = N(x∣y)⋅(x⊕y)=N

If multiple solutions exist, you may print **any of them**.

It can be proved that a solution always exists under the given constraints.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤N≤1091 \leq N \leq 10^91≤N≤109

- NNN is **odd**.

### Sample 1:

Input

Output

```
4
1
49
21
35

```

```
1 0
3 4
7 4
7 2
```

### Explanation:

**Test case 111:** We have N=1N = 1N=1. Choose x=1x = 1x=1 and y=0y = 0y=0, which gives us (x∣y)=1(x\mid y) = 1(x∣y)=1 and (x⊕y)=1(x\oplus y) = 1(x⊕y)=1.

1⋅1=11\cdot 1 = 11⋅1=1, so this is a valid solution.

**Test case 222:** We have N=49N = 49N=49. Choose x=3x = 3x=3 and y=4y = 4y=4, which gives us (x∣y)=7(x\mid y) = 7(x∣y)=7 and (x⊕y)=7(x\oplus y) = 7(x⊕y)=7.

7⋅7=497\cdot 7 = 497⋅7=49, so this is a valid solution.

**Test case 333:** Here, N=21N = 21N=21. Choose x=7x = 7x=7 and y=4y = 4y=4, which gives us (x∣y)=7(x\mid y) = 7(x∣y)=7 and (x⊕y)=3(x\oplus y) = 3(x⊕y)=3.

7⋅3=217\cdot 3 = 217⋅3=21, so this is a valid solution.

**Test case 444:** Here, N=35N = 35N=35. Choose x=7x = 7x=7 and y=2y = 2y=2, which gives us (x∣y)=7(x\mid y) = 7(x∣y)=7 and (x⊕y)=5(x\oplus y) = 5(x⊕y)=5.

7⋅5=357\cdot 5 = 357⋅5=35, so this is a valid solution.
