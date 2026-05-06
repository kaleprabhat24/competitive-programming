# Chef Assign Cookies Practice Problem in Dynamic programming

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-06 |

---

## Problem Statement

### Chef Assign Cookies

Chef has a group of children, each with a certain greed factor childrenGreedFactorschildrenGreedFactorschildrenGreedFactors representing the minimum size of a cookie that would make them content. 

Chef also has a collection of cookies, each with a specific size cookieSizescookieSizescookieSizes. Chef wants to distribute at most one cookie to each child such that the cookie size is at least the child's greed factor. 

Help Chef find the maximum number of children who can be content by appropriately assigning cookies.

## Function Declaration

### Function Name

findMaxContentChildrenfindMaxContentChildrenfindMaxContentChildren - This function determines the maximum number of children who can be content with the given cookies based on their greed factors.

### Parameters

- childrenGreedFactorschildrenGreedFactorschildrenGreedFactors : A list of integers representing each child's minimum greed factor required to be content.

- cookieSizescookieSizescookieSizes: A list of integers representing the sizes of available cookies.

### Return Value

- Returns a number representing the maximum number of children that can be content.

- The output is a single integer indicating how many children can be assigned cookies meeting or exceeding their greed factors.

## Constraints

- 1≤length(childrenGreedFactors)≤3×1041 \leq \text{length}(childrenGreedFactors) \leq 3 \times 10^41≤length(childrenGreedFactors)≤3×104

- 0≤length(cookieSizes)≤3×1040 \leq \text{length}(cookieSizes) \leq 3 \times 10^40≤length(cookieSizes)≤3×104

- 1≤childrenGreedFactors[i],cookieSizes[j]≤231−11 \leq childrenGreedFactors[i], cookieSizes[j] \leq 2^{31} - 11≤childrenGreedFactors[i],cookieSizes[j]≤231−1

**The input and output formats given below are only if you want to test using custom inputs.**

### Input Format

- The first line contains a single integer TTT — the number of test cases.

- Each test case contains:

The first line contains comma separated integers in `[]`— the greed factors of the children (childrenGreedFactorschildrenGreedFactorschildrenGreedFactors).

- The second line contains comma separated integers in `[]` integers — the sizes of the cookies (cookieSizescookieSizescookieSizes).

### Output Format

- For each test case, print a single line containing one integer — the maximum number of children that Chef can make content by distributing cookies accordingly.

### Sample 1:

Input

Output

```
2
[1, 2, 2, 3]
[1, 1]
[1, 2, 2, 3, 4]
[1, 2, 3]
```

```
1
3
```

### Explanation:

- For the first test case, cookies = [1,2,2,3], children = [1,1]. Assign cookie 1 to child 1 and no other child would be content with the remaining cookies so answer is 111.

- For the second test case, cookies = [1,2,2,3,4], children = [1,2,3]. Assign cookies 1, 2, and 3 to children 1, 2, and 3 respectively. Total assigned = 3.
