# Chef Builds Queue Using Stacks Practice Problem in Stacks and Queues

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-16 |

---

## Problem Statement

### Chef Builds Queue Using Stacks

Chef wants to implement a queue that follows the **First-In-First-Out (FIFO)** principle using only **two stacks**.

Stacks support operations such as **push**, **pop**, **peek**, **size**, and **isEmpty**.

Chef needs to design a queue using only stack operations such that it behaves exactly like a normal queue and each operation runs in **amortized O(1)O(1)O(1) time**.

## **Class Description**

Chef will implement a class named **QueueUsingStacksQueueUsingStacksQueueUsingStacks**.
The class supports the following operations:

- 

**pushElement(x)pushElement(x)pushElement(x)**

Inserts the element xxx at the back of the queue.

- 

**popElement()popElement()popElement()**

Removes and returns the front element of the queue.

- 

**peekElement()peekElement()peekElement()**

Returns the front element of the queue without removing it.

- 

**isEmptyResult()isEmptyResult()isEmptyResult()**

Returns **true** if the queue is empty, otherwise returns **false**.

## **Constraints**

- 1≤T≤1051 \le T \le 10^51≤T≤105

- 1≤N≤2×1051 \le N \le 2 \times 10^51≤N≤2×105

- 1≤x≤1091 \le x \le 10^91≤x≤109

- The total number of operations across all test cases will not exceed 10610^6106

- All popElement()popElement()popElement() and peekElement()peekElement()peekElement() operations are guaranteed to be valid

### Input Format

- The first line contains an integer TTT — the number of test cases.

- For each test case:

The first line contains an integer NNN — the number of operations.

- The next NNN lines contain one of the following operations:

`push x`

- `pop`

- `peek`

- `empty`

### Output Format

- For each test case, print the result of each operation on a new line.

- For popElement()popElement()popElement() and peekElement()peekElement()peekElement(), print the integer value.

- For isEmptyResult()isEmptyResult()isEmptyResult(), print **true** if the queue is empty, otherwise print **false**.

- For pushElement(x)pushElement(x)pushElement(x), print **None**.

### Sample 1:

Input

Output

```
1
6
push 10
push 20
peek
pop
empty
pop
```

```
None
None
10
10
false
20
```

### Explanation:

- `push` 10: Added 10 to the queue, output None as push returns nothing.

- `push` 20: Added 20 to the queue, output None again.

- `peek`: Front element is 10, so output is 10.

- `pop`: Removed and returned front element 10.

- `empty`: Queue still has 20, so output is false.

- `pop`: Removed and returned 20, queue is now empty.

### Sample 2:

Input

Output

```
1
8
push 5
push 3
push 7
pop
peek
pop
pop
empty
```

```
None
None
None
5
3
3
7
true
```

### Explanation:

- `push` 5: Queue = [5], output None as push doesn't return value.

- `push` 3: Queue = [5, 3], output None.

- `push` 7: Queue = [5, 3, 7], output None.

- `pop`: Removes front 5, output 5. Queue = [3, 7].

- `peek`: Front is 3, output 3. Queue unchanged.

- `pop`: Removes front 3, output 3. Queue = [7].

- `pop`: Removes front 7, output 7. Queue = [].

- `empty`: Queue is empty, output true.
