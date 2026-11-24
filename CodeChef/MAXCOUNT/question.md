# Count of Maximum Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-24 |

---

## Problem Statement

### Count of Maximum

Given an array AAA of length NNN, your task is to find the element which repeats in the array the maximum number of times, along with its exact frequency count.

If there is a tie (i.e multiple elements have the same maximum frequency), you must choose the **smallest** element among them.

## Function Declaration

### Function Name

mostFrequentmostFrequentmostFrequent – This function processes the array and finds the required element and its count.

### Parameters

NNN : An integer representing the length of the array AAA.

AAA : An array (or list) of NNN integers.

### Return Value

Returns an array/pair of two integers:

- The most frequent element (the smallest one in case of a tie).

- Its corresponding frequency count.

### Constraints:

- 1≤T≤1001 \le T \le 1001≤T≤100

- 1≤N≤1051 \le N \le 10^51≤N≤105

- 1≤A[i]≤1091 \le A[i] \le 10^91≤A[i]≤109

- The sum of NNN over all test cases does not exceed 2×1052 \times 10^52×105.

*The input and output formats provided below are only for testing with custom inputs. You only need to complete the logic function. The parsing of inputs, looping over test cases, and final printing are handled automatically by the platform.*

### Input Format

- The first line contains a single integer TTT, representing the number of test cases.

- For each test case:

The first line contains a single integer NNN, representing the length of the array.

- The second line contains NNN space-separated integers representing the elements of array AAA.

### Output Format

- For each test case, print two space-separated integers on a new line: the chosen element followed by its frequency count.

### Sample 1:

Input

Output

```
2
5
1 2 3 2 5
6
1 2 2 1 1 2
```

```
2 2
1 3
```

### Explanation:

In first case 2 occurs twice whereas all other elements occur only once.
In second case, both 1 and 2 occur 3 times but 1 is smaller than 2.
