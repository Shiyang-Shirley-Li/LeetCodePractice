 /*
 * Author: Shiyang (Shirley) Li
 * Tag: Two Pointers
 * Difficulty： Easy
 * 
 * Given the heads of two singly linked-lists headA and headB, 
 * return the node at which the two lists intersect. 
 * If the two linked lists have no intersection at all, return null.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionOfTwoLinkedList160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null) {
			return null;
		}
		
		//Two pointers
		ListNode a = headA;
		ListNode b = headB;
		
		
		while(a != b) {
			if(a != null) {
				a = a.next;
			}
			else {
				a = headB;
			}
			
			if(b != null) {
				b = b.next;
			}
			else {
				b = headA;
			}
		}
		
		return a;
	}
}


/*
 * Conclusion:
 * 	Different Cases:
 * 		Case 1: have intersection & same length
 * 		Case 2: have intersection & different length
 * 		Case 3: have no intersection & same length
 * 		Case 4: have not intersection & different length
 */

		
