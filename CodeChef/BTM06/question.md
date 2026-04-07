# Bitwise AND, OR in Bit Manipulation

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-07 |

---

## Problem Statement

### Bitwise AND, OR

All the Bitwise operators perform operations independently on each bit. 

That is, iii-th bit of the output isn't influenced by any bit jjj (jjj ≠\neq= iii) of the input.

The Bitwise **AND** operator - AAA &\&& BBB === CCC. 

iii-th bit of CCC will be set (be equal to 111) if and only if the iii-th bit of AAA and BBB are set.

**Example**

```
      11001000  (200 in decimal)
    & 10111000  (184 in decimal)
      -------- 
    = 10001000  (136 in decimal)

```

The Bitwise **OR** operator - AAA ∣|∣ BBB === CCC. 

iii-th bit of CCC will be set (be equal to 111) if iii-th bit of AAA or BBB are set.

**Example**

```
      11001000  (200 in decimal)
    | 10111000  (184 in decimal)
      -------- 
    = 11111000  (248 in decimal)

```

### Task

Run the code and check the output of the program. Also change the values of variables AAA and BBB and check the output.
