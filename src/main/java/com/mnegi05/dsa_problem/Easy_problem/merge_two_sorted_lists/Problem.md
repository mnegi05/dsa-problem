## Question 21 -> Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.


## Solution -> 

This is the classic “Merge Two Sorted Linked Lists” problem. The key idea is to compare nodes one-by-one and build a new sorted list.

## Approach (Iterative – Optimal)
- Use a dummy node to simplify handling the head
- Maintain a pointer current
- Compare list1 and list2:
  - Attach the smaller node to current
  - Move that list forward
- When one list ends → attach the remaining part of the other list