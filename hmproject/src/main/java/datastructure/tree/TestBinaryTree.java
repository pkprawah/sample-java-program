package datastructure.tree;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestBinaryTree {

	public static void main(String[] args) {

		BinaryTreeOperation binaryTreeOperation = new BinaryTreeOperation();
		TreeNode root = null;

		int[] keys = { 12, 11, 8, 7, 4, 15, 16, 14, 9, 5, 3 };
		for (int key : keys) {
			root = binaryTreeOperation.recursiveInsert(root, key);
		}
		System.out.println("" + root);
		binaryTreeOperation.printNode(root);
		/*
		 * System.out.print("InOrder Traverse::");
		 * binaryTreeOperation.inOrder(root); System.out.println();
		 * System.out.print("PreOrder Traverse::");
		 * binaryTreeOperation.preOrder(root); System.out.println();
		 * System.out.print("PostOrder Traverse::");
		 * binaryTreeOperation.postOrder(root); boolean
		 * found=binaryTreeOperation.searchKey(root, 1); System.out.println();
		 * System.out.println("Passing Key found::"+found);
		 */
		int height = binaryTreeOperation.height(root);
		System.out.println("Height of the tree is :::" + height);
		// System.out.print("Level order Traversal (Using Recursive Process):
		// ");
		// binaryTreeOperation.printLevelOrder(root);
		System.out.println();
		System.out.print("Level order Traversal (Using Iterative Process): ");
		binaryTreeOperation.printLevelOrderIterative(root);
		System.out.println();
		// int treeDiameters=binaryTreeOperation.getDiameterOfTree(root);
		// System.out.println("Tree Diameters:::"+treeDiameters);

		// binaryTreeOperation.printSpiral(root);

		Lock lock = new ReentrantLock();

		Integer.parseInt("123");

	}

}
