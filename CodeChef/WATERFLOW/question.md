# Bucket and Water Flow Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-05 |

---

## Problem Statement

### Bucket and Water Flow 

Alice has a bucket of water initially having WWW litres of water in it. The maximum capacity of the bucket is XXX liters.

Alice turned on the tap and the water starts flowing into the bucket at a rate of YYY litres/hour. She left the tap running for exactly ZZZ hours. Determine whether the bucket has been overflown, filled exactly, or is still left unfilled.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases. The description of the test cases follows.

- Each test case consists of a single line of input containing four space-separated integers W, X, Y, ZW,\ X,\ Y,\ ZW, X, Y, Z.

### Output Format

For each test case, print the answer on a new line:

- If the bucket has overflown print `overflow`

- If it is exactly filled print `filled`

- If it is still unfilled, print `unfilled`

You may print each character of the string in uppercase or lowercase (for example, the strings `filled`, `FIlled`, `fiLLed`, and `FILLED` will all be treated as identical).

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤W,X,Y,Z≤10001 \leq W,X,Y,Z \leq 10001≤W,X,Y,Z≤1000

### Subtasks

- **Subtask 1 (100 points):**

Original constraints.

### Sample 1:

Input

Output

```
4
1 2 3 4 
10 70 10 6 
2 100 4 3
3 3 2 1

```

```
overFlow
filled
Unfilled
overflow

```

### Explanation:

**Test case 111:** Initially the bucket had 111 litre of water, we then added 333 litres of water for 444 hours. Thus, the total bucket inflow was 1+3×4=131 + 3 \times 4 = 131+3×4=13 litres. Since this is greater than the capacity of 222 litres, the bucket will `OVERFLOW`

**Test case 222:** Initially the bucket had 101010 litres of water, we then added 101010 litres of water for 666 hours. Thus, the total bucket inflow was 10+10×6=7010 + 10 \times 6 = 7010+10×6=70 litres. Since this is equal to the capacity of 707070 litres, the bucket will be `FILLED`

**Test case 333:** Initially the bucket had 222 litres of water, we then added 444 litres of water for 333 hours. Thus, the total bucket inflow was 2+4×3=142 + 4 \times 3 = 142+4×3=14 litres. Since this is lesser than the capacity of 100100100 litres, the bucket will be `UNFILLED`.

**Test case 444:** Initially the bucket had 333 litres of water, we then added 222 litres of water for 111 hours. Thus, the total bucket inflow was 3+2×1=53 + 2 \times 1 = 53+2×1=5 litres. Since this is more than the capacity of 333 litres, the bucket will `OVERFLOW`.
