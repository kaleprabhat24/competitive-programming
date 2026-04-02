# Chef and Character Frequency Sort Practice Problem in Strings

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-02 |

---

## Problem Statement

### Chef and Character Frequency Sort

Chef is experimenting with strings. He wants to rearrange all the characters of a given string **SSS** in decreasing order of their frequency.

If two characters have the same frequency, Chef sorts them in **lexicographical (ASCII) order**.

Help Chef by printing the final rearranged string.

### Function Declaration

- 

**Function Name:**

**sortByFrequencysortByFrequencysortByFrequency**

- 

**Parameters:**

**sss** (`string`)
A string consisting of uppercase and lowercase English letters and digits.

- 

**Return Value:**

Returns a `string` representing the rearranged string after sorting by the given rules.

### Input Format

- The first and only line contains a string **S**.

- The string consists of uppercase and lowercase English letters and digits.

### Output Format

## Print the rearranged string after sorting by the given rules.

### Constraints

- 1≤∣S∣≤5×1051 \le |S| \le 5 \times 10^{5}1≤∣S∣≤5×105

### Sample 1:

Input

Output

```
CookBook

```

```
ooookkBC

```

### Explanation:

**Input:** `CookBook`

The character frequencies are:

- `o` ? 3

- `B` ? 1

- `C` ? 1

- `k` ? 1

- `u` ? 1

Chef first places characters in **decreasing frequency** order, so `o` comes first as `ooo`.
The remaining characters all have the same frequency **1**, so they are arranged in **ASCII (lexicographical) order**:

`B < C < k < u`

So the final rearranged string is:

```
oooBCku

```

### Sample 2:

Input

Output

```
aabbbcddd

```

```
bbbdddaac

```

### Explanation:

**Input:** `aabbbcddd`

The character frequencies are:

- `b` ? 3

- `d` ? 3

- `a` ? 2

- `c` ? 1

Characters with frequency **3** are `b` and `d`, and since `b < d`, they appear as:
`bbbddd`

Then `a` appears twice:
`aa`

Finally, `c` appears once:
`c`

So the final rearranged string is:

```
bbbdddaac

```
