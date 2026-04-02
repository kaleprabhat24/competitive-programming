# Linked List

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-02 |

---

## Problem Statement

### Linked List - Insertion at k-th position

In the last two lessons, we saw how to insert at the start and end of a linked list. How about inserting after some k-th node in the linked list?

The approach is similar to inserting at the end, but rather than going to the end of the list, we will just iterate to the k-th node.

To insert a node in between the k and k+1 node, we will have to change the next pointer of both the k-th node and new Node.

- Set next of new Node to next of current

- Set next of current to new Node

### Task

Complete the function **insertAfterK** in IDE to insert an element after k-th node.

### Input Format

First line denotes 'n' the number of elements in the list.

Second line consists of two space separated integers, xxx - the value to be added and kkk - the position after which the value is added.

Third line consists of n space-separated integers denoting the elements in the list.

### Output Format

The complete list after insertion.

### Constraints

- 1≤N≤10001 \leq N \leq 10001≤N≤1000

### Sample 1:

Input

Output

```
4
3 2
2 32 23 53
```

```
2 32 3 23 53
```
