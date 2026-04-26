## Question 22 -> Generate Parentheses

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

Constraints:

1 <= n <= 8


## Solution -> 

This is a classic backtracking problem. The main idea is to build the string character by character, ensuring at each step that the parentheses remain valid.

Approach (Backtracking)
Define a recursive function that builds the string.
Parameters needed:
current string
number of open brackets used
number of close brackets used
maximum number (n)
Rules:
You can add ‘(‘ if open < n.
You can add ‘)’ if close < open.
Base Case: When the string length is 2 * n, add it to the result list.

This ensures that we only generate valid combinations without needing to check validity afterward.
