# Chef and Wire Frames Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-22 |

---

## Problem Statement

### Chef and Wire Frames

Chef has a rectangular plate of length  NcmN cmNcm  and width McmM cmMcm. He wants to make a wireframe around the plate. The wireframe costs XXX rupees per cm.

Determine the cost Chef needs to incur to buy the wireframe.

### Input Format

- First line will contain TTT, the number of test cases. Then the test cases follow.

- Each test case consists of a single line of input, containing three space-separated integers N,M,N,M,N,M, and XXX — the length of the plate, width of the plate, and the cost of frame per cm.

### Output Format

For each test case, output in a single line, the price Chef needs to pay for the wireframe.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤N,M,X≤10001 \leq N,M,X \leq 1000 1≤N,M,X≤1000

### Sample 1:

Input

Output

```
3
10 10 10
23 3 12
1000 1000 1000

```

```
400
624
4000000
```

### Explanation:

**Test case 111:** The total length of the frame is 2⋅10+2⋅10=402\cdot 10 + 2\cdot 10 = 402⋅10+2⋅10=40 cms. Since the cost is 101010 per cm, the total cost would be 10⋅40=40010 \cdot 40 = 40010⋅40=400.

**Test case 222:** The total length of the frame is 2⋅23+2⋅3=522\cdot 23 + 2\cdot 3 = 522⋅23+2⋅3=52 cms. Since the cost is 121212 per cm, the total cost would be 52⋅12=62452 \cdot 12 = 62452⋅12=624.

**Test case 333:** The total length of the frame is 2⋅1000+2⋅1000=40002\cdot 1000 + 2\cdot 1000 = 40002⋅1000+2⋅1000=4000 cms. Since the cost is 100010001000 per cm, the total cost would be 4000⋅1000=40000004000 \cdot 1000 = 40000004000⋅1000=4000000.
