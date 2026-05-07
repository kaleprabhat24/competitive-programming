# Chef Finds Stock Profit

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-07 |

---

## Problem Statement

### Chef Finds Stock Profit - 1

Chef has discovered the stock market and wants to maximize his profit by buying and selling a stock.

He is given the daily prices of a stock for several days.

Chef can:

- Buy the stock on exactly one day

- Sell the stock on a later day

Chef wants to calculate the maximum profit possible from one buy and one sell operation.

If no profit is possible, the answer should be `0`.

## Function Declaration

- **Function Name**

- calculateMaxProfitcalculateMaxProfitcalculateMaxProfit

### Parameters

- stockPrices\texttt{stockPrices}stockPrices (integer vector):

A list of integers where stockPrices[i]\texttt{stockPrices}[i]stockPrices[i] represents the stock price on day iii.

### Return Value

- Returns an integer representing the maximum profit Chef can earn.

- If no profitable transaction is possible, return 000.

## Constraints

- 1≤T≤1051 \le T \le 10^51≤T≤105 — number of test cases

- 1≤N≤1051 \le N \le 10^51≤N≤105 — number of days

- 0≤stockPrices[i]≤1040 \le \texttt{stockPrices}[i] \le 10^40≤stockPrices[i]≤104

- The sum of NNN over all test cases does not exceed 10510^5105

## Input Format

- The first line contains an integer TTT — the number of test cases.

- For each test case:

The first line contains an integer NNN — the number of days.

- The second line contains NNN integers — the daily stock prices stockPrices\texttt{stockPrices}stockPrices.

## Output Format

For each test case, print a single integer — the maximum profit achievable from one buy-sell transaction.

If no profit is possible, print 000.

### Sample 1:

Input

Output

```
3
4
5 5 5 5
7
1 2 3 4 5 6 7
8
10 7 5 8 11 9 6 15
```

```
0
6
10
```

### Explanation:

- 

**Test Case 1**:

Stock prices remain constant at `5`, so no profitable transaction is possible.

Output: `0`

- 

**Test Case 2**:

Stock prices increase daily from `1` to `7`.

Buying at `1` and selling at `7` yields a profit of `6`.

Output: `6`

- 

**Test Case 3**:

Buying at price `5` (on day 3) and selling at price `15` (on day 8) gives the maximum profit.

Maximum profit = `10`
