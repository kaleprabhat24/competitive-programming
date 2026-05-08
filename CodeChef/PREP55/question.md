# Remove Duplicates from Sorted List Practice Problem in Linked Lists

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-08 |

---

## Problem Statement

### Remove Duplicates from Sorted List

You are given head of the **non-empty** sorted linked list where the value of the ithi^{th}ith node will be AiA_iAi​.

Your task is to delete all duplicates such that each element appears only once and return the linked list sorted.

### Input:

- First line will contain TTT, number of test cases. Then the test cases follow.

- The first line contains one integer NNN — the length of the linked list.

- The second line contains NNN space separated integers A1,A2,…ANA_1, A_2, \ldots A_NA1​,A2​,…AN​ — the value of the linked list nodes starting from the head for the linked list.

**Note:**

- For Java language, you need to:

Complete the function in the submit solution tab:

```
Node removeDuplicates(Node head){...}

```

 \  

- For C++ language, you need to:

Complete the function in the submit solution tab:

```
Node* removeDuplicates(Node* head){...}

```

 \  

- For Python language, you need to:

Complete the function in the submit solution tab:

```
def Node removeDuplicates(self, head):

```

### Output:

The function you complete should return the required answer.

### Constraints

- 1≤T≤101 \leq T \leq 101≤T≤10

- 1≤N,Ai≤1051 \leq N, A_i \leq 10^51≤N,Ai​≤105

### Sample 1:

Input

Output

```
3
5
1 1 6 8 8
5
1 2 3 4 5
4
5 5 5 5
```

```
1 6 8 
1 2 3 4 5 
5 
```

### Explanation:

**Test case 111:** We will remove duplicate entry of 111, 888. So the sorted linked list will be 1→6→81 \rightarrow 6 \rightarrow 81→6→8.

**Test case 222:** There is no duplicate entry. So the sorted linked list will be 1→2→3→4→51 \rightarrow 2 \rightarrow 3 \rightarrow 4 \rightarrow 51→2→3→4→5.

**Test case 333:** We will remove duplicate entry of 555. So the sorted linked list will be 555.
