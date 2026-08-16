# Tom and Jerry Chase Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-08-16 |

---

## Problem Statement

### Tom and Jerry Chase

In a classic chase, Tom is running after Jerry as Jerry has eaten Tom's favourite food.

Jerry is running at a speed of XXX metres per second while Tom is chasing him at a speed of YYY metres per second. Determine whether Tom will be able to catch Jerry.

Note that initially Jerry is not at the same position as Tom.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of two space-separated integers XXX and YYY — the speeds of Jerry and Tom respectively.

### Output Format

For each test case, output on a new line, `YES`, if Tom will be able to catch Jerry. Otherwise, output `NO`.

You can print each character in uppercase or lowercase. For example `NO`, `no`, `No`, and `nO` are all considered the same.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X,Y≤101 \le X, Y \le 101≤X,Y≤10

### Sample 1:

Input

Output

```
4
2 3
4 1
1 1
3 5

```

```
YES
NO
NO
YES

```

### Explanation:

**Test case 111:** Jerry is running at the speed of 222 metres per second while Tom is chasing him at the speed of 333 metres per second. Since Jerry's speed is less than Tom's, Tom will eventually catch Jerry.

**Test case 222:** Jerry is running at the speed of 444 metres per second while Tom is chasing him at the speed of 111 metres per second. Since Jerry's speed is higher than Tom's, Tom will never be able to catch Jerry.

**Test case 333:** Jerry is running at the speed of 111 metre per second while Tom is chasing him at the speed of 111 metre per second. Since Jerry's speed is same as that of Tom's and both of them are not at the same position, Tom will never be able to catch Jerry.

**Test case 444:** Jerry is running at the speed of 333 metres per second while Tom is chasing him at the speed of 555 metres per second. Since Jerry's speed is less than Tom's, Tom will eventually catch Jerry.
