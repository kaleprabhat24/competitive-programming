# Get Subscription Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-08-25 |

---

## Problem Statement

### Get Subscription

Chef wants to conduct a lecture for which he needs to set up an online meeting of exactly XXX minutes.

The meeting platform supports a meeting of maximum 303030 minutes without subscription and a meeting of unlimited duration with subscription.

Determine whether Chef needs to take a subscription or not for setting up the meet.

### Input Format

- First line will contain TTT, the number of test cases. Then the test cases follow.

- Each test case contains a single integer XXX - denoting the duration of the lecture.

### Output Format

For each test case, print in a single line, `YES` if Chef needs to take the subscription, otherwise print `NO`.

You may print each character of the string in uppercase or lowercase (for example, the strings `YES`, `yEs`, `yes`, and `yeS` will all be treated as identical).

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X≤1001 \leq X \leq 1001≤X≤100

### Sample 1:

Input

Output

```
4
50
3
30
80

```

```
YES
NO
NO
YES

```

### Explanation:

**Test Case 111:** Without subscription, the platform allows only 303030 minutes of duration. Since Chef needs to conduct a lecture of 505050 minutes, he needs to buy the subscription.

**Test Case 222:** Without subscription, the platform allows 303030 minutes of duration. Since Chef needs to conduct a lecture of 333 minutes only, he does not need to buy the subscription.

**Test Case 333:** Without subscription, the platform allows 303030 minutes of duration. Since Chef needs to conduct a lecture of 303030 minutes only, he does not need to buy the subscription.

**Test Case 444:** Without subscription, the platform allows only 303030 minutes of duration. Since Chef needs to conduct a lecture of 808080 minutes, he needs to buy the subscription.
