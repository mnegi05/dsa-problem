## Question 20 -> Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false

 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.


## Solution -> 

This is a classic Stack problem.

Algorithm:

Create a stack.

Iterate through the string:

If character is opening bracket → push to stack.

If character is closing bracket:

Check if stack is empty → return false.

Pop top element.

Check if it matches the current closing bracket.

If not → return false.

After loop → if stack is empty → return true, else false.
