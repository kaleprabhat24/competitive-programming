# Fit in Data Type Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-07-11 |

---

## Problem Statement

### Fit in Data Type

Chef wants to store some important numerical data on his personal computer. He is using a new data type that can store values only from 000 till NNN both inclusive. If this data type receives a value greater than NNN then it is cyclically converted to fit into the range 000 to NNN.
For example:

- Value N+1N+1N+1 will be stored as 000.

- Value N+2N+2N+2 will be stored as 111.

and so on...

Given XXX, the value chef wants to store in this new data type. Determine what will be the actual value in memory after storing XXX.

### Input Format

- First line will contain TTT, number of testcases. Then the testcases follow.

- Each testcase contains a single line of input, two space separated integers N,XN, XN,X - the maximum value a data type can store and the value Chef wants to store in the data type respectively.

### Output Format

For each testcase, output in a single line the value which will be actually stored in memory.

### Constraints

- 1≤T≤30001 \leq T \leq 30001≤T≤3000

- 1≤N≤501 \leq N \leq 501≤N≤50

- 0≤X≤500 \leq X \leq 500≤X≤50

### Sample 1:

Input

Output

```
5
15 0
15 10
11 12
27 37
50 49
```

```
0
10
0
9
49
```

### Explanation:

**Test Case 111**: The data type can store values from 000 to 151515. If we try to put 000 in this data type, then the stored value will be the same, that is 000.

**Test Case 222**: The data type can store values from 000 to 151515. If we try to put 101010 in this data type, then the stored value will be the same, that is 101010.

**Test Case 333**: The data type can store values from 000 to 111111. If we try to put 121212 in this data type, then the stored value will cyclically come back to 000. Hence the output is 000.

**Test Case 444**: The data type can store values from 000 to 272727. If we try to put 373737 in this data type, then the stored value will cyclically convert to 999. Hence the output is 999.
