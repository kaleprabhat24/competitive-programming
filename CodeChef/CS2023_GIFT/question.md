# The Gift Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-25 |

---

## Problem Statement

### The Gift

Om has XXX rupees. He wants to gift a laptop worth NNN rupees to his girlfriend.

We know that Om is the technical secretary of IIIT-A and has access to the Gymkhana funds of IIIT-A. Currently there are MMM rupees in the fund and Om can use the fund as much as he wants.

Find whether Om can gift his girlfriend a new laptop.

### Input Format

- The first and only line of input contains three space-separated integers XXX, NNN, and MMM — the amount Om has, the price of the laptop, and the amount present in the Gymkhana fund respectively.

### Output Format

For each input, output `YES` if Om can buy the laptop and `NO` otherwise.

You may print each character in uppercase or lowercase. For example `YES`, `Yes`, `yes`, and `yES` are all considered the same.

### Constraints

- 1≤X,N,M≤1031 \leq X, N, M \leq 10^{3}1≤X,N,M≤103

### Sample 1:

Input

Output

```
5 10 15

```

```
YES

```

### Explanation:

Om uses 555 rupees from Gymkhana fund. So, the amount he has is 5+5=105+5= 105+5=10 rupees.
He can buy the laptop with cost 101010 rupees.

### Sample 2:

Input

Output

```
4 50 7
```

```
NO
```

### Explanation:

Even if Om uses the whole Gymkhana fund, he won't be able to buy the laptop.
