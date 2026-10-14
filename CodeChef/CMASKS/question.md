# Chef and Masks Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-10-14 |

---

## Problem Statement

### Chef and Masks

Chef is shopping for masks. In the shop, he encounters 222 types of masks:

- Disposable Masks — cost XXX but last only 111 day.

- Cloth Masks — cost YYY but last 101010 days.

Chef wants to buy masks to last him 100100100 days. He will buy the masks which cost him the least. In case there is a tie in terms of cost, Chef will be eco-friendly and choose the cloth masks. Which type of mask will Chef choose?

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases. Then the test cases follow.

- Each test case consists of a single line of input, containing two space-separated integers X,YX, YX,Y.

### Output Format

For each test case, if Chef buys the cloth masks print `CLOTH`, otherwise print `DISPOSABLE`.

You may print each character of the string in uppercase or lowercase (for example, the strings `cloth`, `clOTh`, `cLoTH`, and `CLOTH` will all be treated as identical).

### Constraints

- 1≤T≤50001 \leq T \leq 50001≤T≤5000

- 1≤X<Y≤1001 \leq X \lt Y \leq 1001≤X<Y≤100

### Sample 1:

Input

Output

```
4
10 100
9 100
88 99
1 11

```

```
Cloth
Disposable
Cloth
Disposable

```

### Explanation:

**Test case 111:** The cost of the disposable masks will be 10⋅100=100010 \cdot 100 = 100010⋅100=1000, while the cost of the cloth masks will be 100⋅10=1000100 \cdot 10 = 1000100⋅10=1000. Since the price is equal and Chef is eco-friendly, Chef will buy the cloth masks.

**Test case 222:** The cost of the disposable masks will be 9⋅100=9009 \cdot 100 = 9009⋅100=900, while the cost of the cloth masks will be 100⋅10=1000100 \cdot 10 = 1000100⋅10=1000. Since the price of disposable masks is less, Chef will buy the disposable masks.

**Test case 333:** The cost of the disposable masks will be 88⋅100=880088 \cdot 100 = 880088⋅100=8800, while the cost of the cloth masks will be 99⋅10=99099 \cdot 10 = 99099⋅10=990. Since the price of the cloth masks is less, Chef will buy the cloth masks.

**Test case 444:** The cost of the disposable masks will be 1⋅100=1001 \cdot 100 = 1001⋅100=100, while the cost of the cloth masks will be 11⋅10=11011 \cdot 10 = 11011⋅10=110. Since the price of disposable masks is less, Chef will buy the disposable masks.
