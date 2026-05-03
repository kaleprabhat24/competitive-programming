# Chef Solves Climbing Stairs Practice Problem in Dynamic programming

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-03 |

---

## Problem Statement

### Chef Solves Climbing Stairs

Chef has discovered a staircase with totalStepstotalStepstotalSteps steps leading to a secret treasure. Chef wants to reach the top by climbing either 1 step or 2 steps at a time. 

Chef is curious to know in how many distinct ways he can reach the top of the staircase by combining these moves in different sequences. 

Help Chef calculate the total number of unique ways to climb to the top so that he can plan his journey perfectly.

## Function Declaration

### Function Name

calculateWaysToClimbcalculateWaysToClimbcalculateWaysToClimb - This function calculates the number of distinct ways to climb a staircase given a total number of steps.

### Parameters

- totalStepstotalStepstotalSteps: The total number of steps in the staircase that need to be climbed.

### Return Value

- Returns a number representing the total number of unique ways to reach the top of the staircase.

- The output counts all possible sequences of 1-step or 2-step moves that sum to totalStepstotalStepstotalSteps.

## Constraints

- 1≤T≤101 \leq T \leq 101≤T≤10

- 1≤totalSteps≤451 \leq totalSteps \leq 451≤totalSteps≤45

### Input Format

- The first line contains a single integer TTT — the number of test cases.

- Each of the next TTT lines contains a single integer totalStepstotalStepstotalSteps — the number of steps in the staircase for that test case.

### Output Format

- For each test case, print a single line containing the number of distinct ways Chef can climb to the top of the staircase.

### Sample 1:

Input

Output

```
4
1
4
10
20
```

```
1
5
89
10946
```

### Explanation:

- t=1: Only 1 step, so 1 way to climb.

- t=4: Ways = 1, 2, 3, 5 for steps 1 to 4; output is 5.

- t=10: Number of ways follows Fibonacci sequence; 10th number is 89.

- t=20: 20th Fibonacci number is 10946, representing ways to climb 20 steps.
