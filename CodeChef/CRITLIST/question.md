# Critical points in a Linked List Practice Problem in Linked Lists

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-09 |

---

## Problem Statement

### Critical points in a Linked List

Given the head of a linked list, Find the number of critical points. (The starting and end are not considered critical points).

Local minima or maxima are called critical points.

A Node is called a local minima if both next and previous elements are greater than the current element.

A Node is called a local maxima if both next and previous elements are smaller than the current element.

### Constraints

- 1≤1 \leq1≤ Number of elements in the linked list  , NNN ≤105\leq 10^5≤105

- 1≤Node.data≤1091 \leq Node.data \leq 10^91≤Node.data≤109

### Sample 1:

Input

Output

```
8
1 2 3 3 3 5 1 3

```

```
2 
```

### Explanation:

1 is a minima and 5 is a maxima hence there are 2 critical points

### Sample 2:

Input

Output

```
7
1 2 3 2 1 3 2 
```

```
3
```

### Explanation:

3rd node, 5th node and 6th node are the critical nodes, hence the answer is 3
