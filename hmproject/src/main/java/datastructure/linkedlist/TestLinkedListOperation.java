package datastructure.linkedlist;

import java.util.Scanner;

public class TestLinkedListOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedListOperation linkedListOperation = new LinkedListOperation();
		try {
			System.out.println("How many node you want to create!");
			int n = sc.nextInt();
			Node temp = null;
			Node head = null;
			for (int i = 0; i < n; i++) {
				System.out.println("Enter the Node data");
				int data = sc.nextInt();
				temp = linkedListOperation.createTempNode(data);
				head = linkedListOperation.pushAtBegining(temp);
			}
			linkedListOperation.traverse();
			int listLength = linkedListOperation.getListLength();
			System.out.println();
			System.out.println("Total list length is ::" + listLength);
			int valueusingRecursive = linkedListOperation.getListLengthByRecursive(head);
			System.out.println("LinkedList Length::: " + valueusingRecursive);

			// int nthNodeData=linkedListOperation.getNthNodeData(head, 2);
			// System.out.println("Nth Position Node value is ::"+nthNodeData);

			int nthNodeDataFromLast = linkedListOperation.getNthNodeFromLast(head, 2);
			System.out.println("Nth Node value from last :" + nthNodeDataFromLast);

			int middleNodeDataFromLast = linkedListOperation.getMiddleNode(head);
			System.out.println("middleNodeDataFromLast Node value from last :" + middleNodeDataFromLast);

			/*
			 * int middleNodeDataUsingTraversing = linkedListOperation
			 * .getMiddleNodeWithTraverseOneNodeBy2AndOtherNodeBy1(head);
			 * System.out.
			 * println("middleNodeDataUsingTraversing Node value from last :" +
			 * middleNodeDataUsingTraversing);
			 * 
			 * head.getNext().getNext().getNext().setNext(head.getNext());
			 */
			linkedListOperation.detectLoop(head);
		} catch (Exception e) {
			e.printStackTrace();// should not be used due to security reason
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
