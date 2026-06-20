# The Love-Letter Mystery

| Field | Value |
|-------|-------|
| **Platform** | HackerRank |
| **Language** | Java |
| **Solved On** | 2026-06-20 |

---

## Problem Statement

James found a love letter that his friend Harry has written to his girlfriend. James is a prankster, so he decides to meddle with the letter. He changes all the words in the letter into palindromes.   

To do this, he follows two rules:  

- He can only reduce the value of a letter by 

, i.e. he can change *d* to *c*, but he cannot change *c* to *d* or *d* to *b*.  

- The letter 

 may not be reduced any further.  

Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome.

**Example** 

   

The following two operations are performed:  *cd**e*** → *cd**d*** → *cdc*.  Return 

.

**Function Description**  

Complete the *theLoveLetterMystery* function in the editor below.  

theLoveLetterMystery has the following parameter(s):  

- *string s*: the text of the letter   

**Returns**   

- *int:* the minimum number of operations  

**Input Format**

The first line contains an integer 

, the number of queries. 

The next 

 lines will each contain a string 

.

**Constraints**

 

 | s | 

 

All strings are composed of lower case English letters, *ascii[a-z]*, with no spaces.

**Sample Input**

```
STDIN   Function
-----   --------
4       q = 4
abc     query 1 = 'abc'
abcba
abcd
cba

```

**Sample Output**

```
2
0
4
2

```

**Explanation**

- For the first query, *ab**c** → ab**b** → aba*.

- For the second query, *abcba* is already a palindromic string.

- For the third query, *abc**d** → abc**c** → abc**b** → ab**c**a → abba*.

- For the fourth query, ***c**ba → **b**ba → aba*.
