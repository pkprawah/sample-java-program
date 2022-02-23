package datastructure.linkedlist;

public class LinkedListOperation {

	Node head;

	public Node createTempNode(int data) {
		Node temp = new Node(data);
		return temp;
	}

	public int getListLength() {
		Node currentNode = head;
		int count = 0;
		while (currentNode != null) {
			currentNode = currentNode.getNext();
			count++;
		}
		return count;
	}

	public Node pushAtBegining(Node tempNode) {
		tempNode.setNext(head);
		head = tempNode;
		return head;

	}

	public Node pushAtMiddle(Node tempNode) {

		return null;

	}

	public Node pushAtGivenPosition(Node tempNode) {

		return null;

	}

	public Node pushAtLast(Node tempNode) {

		return null;

	}

	public void traverse() {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.getData() + "->");
			currentNode = currentNode.getNext();
		}
	}

	public int getListLengthByRecursive(Node head) {
		Node currentNode = head;
		return (currentNode == null) ? 0 : 1 + getListLengthByRecursive(currentNode.getNext());

	}

	public int getNthNodeData(Node head, int nodeIndex) {
		Node currentNode = head;
		int indexPos = nodeIndex;
		int tempCount = 0;
		Node c = null;
		while (currentNode != null) {
			if (indexPos == tempCount) {
				c = currentNode;
				break;
			}
			currentNode = currentNode.getNext();
			tempCount++;
		}
		return c.getData();
	}

	public int getNthNodeFromLast(Node head, int nodeIndex) {

		Node currentNode = head;
		int indexPos = nodeIndex;
		int tempCount = 0;
		while (currentNode != null) {
			currentNode = currentNode.getNext();
			tempCount++;
		}
		currentNode = head;
		for (int i = 1; i < tempCount - indexPos + 1; i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode.getData();
	}

	public int getMiddleNode(Node head) {
		Node currentNode = head;
		double listLenght = 0;
		while (currentNode != null) {
			currentNode = currentNode.getNext();
			listLenght++;
		}
		double val = (listLenght % 2 == 0) ? (listLenght / 2 + 1) : Math.ceil(listLenght / 2);
		System.out.println("Double value is ::" + val);
		int a = (int) val;
		System.out.println("Actual position(Node Count starts from zero)::" + (a - 1));
		currentNode = head;
		for (int i = 0; i < a - 1; i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode.getData();
	}

	public int getMiddleNodeData(Node head) {
		Node fastNode = head;
		Node slowNode = head;

		while (fastNode != null && fastNode.getNext() != null) {
			fastNode = fastNode.getNext().getNext();
			slowNode = slowNode.getNext();
		}
		return slowNode.getData();
	}

	public Boolean detectLoop(Node head) {
		/*
		 * Node currentNode = head; if (currentNode.getData() !=
		 * currentNode.getNext().getData()) return false; return true;
		 */

		Node fastNodeSpeed = head;
		Node slowNodeSpeed = head;

		while (fastNodeSpeed != null && fastNodeSpeed.getNext().getNext() != null) {
			fastNodeSpeed = fastNodeSpeed.getNext().getNext();
			slowNodeSpeed = fastNodeSpeed.getNext();

			if (slowNodeSpeed.getData() == fastNodeSpeed.getData()) {
				System.out.println("Loop Found...");
				return true;
			} else {
				return false;
			}

		}

		return null;
	}
}
