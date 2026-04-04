# Optimal insertion at the end in Linked Lists

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-04 |

---

## Problem Statement

### Optimal insertion at the end

The way we are doing insertion at the end is not really optimal. Every time we want to add an item at the end, we iterate through the complete list to reach the end.

The time complexity of insertion at end is thus O(N) where N is the size of the linked list. But we can make it O(1).

How?

By maintaining a **tail** pointer, which will point to the last element of the linked list. Thus whenever we want to insert at the end, we can use **tail** for that.

### Task

Add a new **tail** pointer and update the current **insertAtEnd** to pass this exercise.

### Sample 1:

Input

Output

```
4
2 32 23 53
```

```
2 32 23 53
```

### Explanation:

Initially we have an empty linked list. After each step:

- 2

- 2->32

- 2->32->23

- 2->32->23->53
