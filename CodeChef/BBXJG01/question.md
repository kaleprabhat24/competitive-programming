# Chef Builds Stack Practice Problem in Stacks and Queues

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-15 |

---

## Problem Statement

### Chef Builds Stack

Chef wants to implement a stack that follows the **Last-In-First-Out (LIFO)** principle using only **two queues**.

**Queues** support operations such as **push to back**, **pop or peek from front**, **size**, and **isEmpty**.

Chef needs to design a stack using only queue operations such that it behaves **exactly like a normal stack**.

### Class Description

Chef will implement a class named **StackUsingQueuesStackUsingQueuesStackUsingQueues**.

The class supports the following operations:

- **push(x)push(x)push(x)**

Pushes the element **xxx** onto the **top of the stack**.

- **pop()pop()pop()**

Removes and returns the **top element** of the stack.

- **top()top()top()**

Returns the **top element** of the stack **without removing it**.

- **empty()empty()empty()**

Returns **true** if the stack is empty, otherwise returns **false**.

### Constraints

- **1≤T≤1051 \le T \le 10^51≤T≤105** — number of test cases

For each test case: At most **100100100 operations** will be performed.

- For each push operation: **1≤x≤1091 \le x \le 10^91≤x≤109**

- All **pop()pop()pop()** and **top()top()top()** operations are guaranteed to be valid.

### Input Format

The first line contains a single integer **TTT** — the number of test cases.

For each test case:

- A sequence of operations is performed on the stack.

- Each operation is one of the following:

**push xxx**

- **pop**

- **top**

- **empty**

### Output Format

For each operation that produces a result, print the output on a new line.

- For **pop()pop()pop()** and **top()top()top()**, print the integer value.

- For **empty()empty()empty()**, print **true** if the stack is empty, otherwise print **false**.

- For push(x)push(x)push(x), print **None**.

### Sample 1:

Input

Output

```
2
4
push 1
push 2
pop
top
3
push 9
pop
empty
```

```
None
None
2
1
None
9
true
```

### Explanation:

### For Test Case 1:

- `push 1`: Stack becomes `[1]`, output `None`

- `push 2`: Stack becomes `[1, 2]`, output `None`

- `pop`: Stack becomes `[1]`, output `2`

- `top`: Stack remains `[1]`, output `1`

### For Test Case 2:

- `push 9`: Stack becomes `[9]`, output `None`

- `pop`: Stack becomes `[]` (empty), output `9`

- `empty`: Stack is empty, output `true`
