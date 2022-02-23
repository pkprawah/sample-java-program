package datastructure.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeOperation {

	public TreeNode iterativeInsert(TreeNode root, int key) {
		System.out.println("Root:::" + root);
		TreeNode currentNode = root;
		TreeNode parentNode = null;
		if (root == null) {
			return new TreeNode(key);

		}

		while (currentNode != null) {
			parentNode = currentNode;
			if (key < currentNode.getData()) {
				currentNode = currentNode.getLeft();
			} else {
				currentNode = currentNode.getRight();
			}
		}

		if (key < parentNode.getData()) {
			TreeNode temp = new TreeNode(key);
			parentNode.setLeft(temp);
			// root=currentNode;
		} else {
			TreeNode temp = new TreeNode(key);
			parentNode.setRight(temp);
			// root=currentNode;
		}
		System.out.println("returning value is ::" + root);
		return root;
	}

	public TreeNode recursiveInsert(TreeNode root, int key) {
		System.out.println("Root:::" + root);
		TreeNode currentNode = root;

		if (root == null) {
			return new TreeNode(key);

		}
		if (key < root.getData()) {
			TreeNode temp = recursiveInsert(root.getLeft(), key);
			root.setLeft(temp);

		} else {
			TreeNode temp = recursiveInsert(root.getRight(), key);
			root.setRight(temp);
		}

		System.out.println("returning value is ::" + root);
		return root;
	}

	public int getTotalBinaryNode(TreeNode root) {
		TreeNode tempTree = root;
		int count = 0;
		if (tempTree != null) {
			if (tempTree != null && tempTree.getLeft() != null)
				tempTree = tempTree.getLeft();
			if (tempTree != null && tempTree.getRight() != null)
				tempTree = tempTree.getRight();
			count++;
		}
		return count;
	}

	public void printNode(TreeNode root) {
		int maxLevel = maxLevel(root);
		// System.out.println("Max level value:::"+maxLevel );
		printNodeInternal(Collections.singletonList(root), 1, maxLevel);
		// System.out.println();
	}

	private static void printNodeInternal(List<TreeNode> nodes, int level, int maxLevel) {
		if (nodes.isEmpty() || isAllElementsNull(nodes))
			return;

		int floor = maxLevel - level;
		//System.out.println("floor value::"+floor);
		int endgeLines = (int) Math.pow(2, (Math.max(floor - 3, 0)));
		//System.out.println("endgeLines value::"+endgeLines);
		int firstSpaces = (int) Math.pow(2, (floor-2)) - 1;
		//System.out.println("firstSpaces value::"+firstSpaces);
		int betweenSpaces = (int) Math.pow(2, (floor - 1)) - 1 ;
		//System.out.println("betweenSpaces value::"+betweenSpaces);

		printWhitespaces(firstSpaces);

		List<TreeNode> newNodes = new ArrayList<TreeNode>();
		for (TreeNode node : nodes) {
			if (node != null) {
				System.out.print(node.getData());
				newNodes.add(node.getLeft());
				newNodes.add(node.getRight());
			} else {
				newNodes.add(null);
				newNodes.add(null);
				System.out.print(" ");
			}

			printWhitespaces(betweenSpaces);
		}
		System.out.println("");

		for (int i = 1; i <= endgeLines; i++) {
			for (int j = 0; j < nodes.size(); j++) {
				printWhitespaces(firstSpaces - i);
				if (nodes.get(j) == null) {
					printWhitespaces(endgeLines + endgeLines + i + 1);
					continue;
				}

				if (nodes.get(j).getLeft() != null)
					System.out.print("/");
				else
					printWhitespaces(1);

				printWhitespaces(i + i - 1);

				if (nodes.get(j).getRight() != null)
					System.out.print("\\");
				else
					printWhitespaces(1);

				printWhitespaces(endgeLines + endgeLines - i);
			}

			System.out.println("");
		}

		printNodeInternal(newNodes, level + 1, maxLevel);
	}

	private static void printWhitespaces(int count) {
		for (int i = 0; i < count; i++)
			System.out.print(" ");
	}

	private <T extends Comparable<?>> int maxLevel(TreeNode node) {
		if (node == null)
			return 0;
		int leftNodeLength = maxLevel(node.getLeft());
		// System.out.println("leftNodeLength value::"+leftNodeLength);
		int rightNodeLength = maxLevel(node.getRight());
		// System.out.println("rightNodeLength value::"+rightNodeLength);
		int maxlevel = Math.max(leftNodeLength, rightNodeLength) + 1;
		// System.out.println("returned max level value is ::"+maxlevel);
		return maxlevel;
	}

	private static <T> boolean isAllElementsNull(List<TreeNode> list) {
		for (Object object : list) {
			if (object != null)
				return false;
		}

		return true;
	}

	public TreeNode test1() {
		TreeNode root = new TreeNode(2);
		TreeNode n11 = new TreeNode(7);
		TreeNode n12 = new TreeNode(5);
		TreeNode n21 = new TreeNode(2);
		TreeNode n22 = new TreeNode(6);
		TreeNode n23 = new TreeNode(3);
		TreeNode n24 = new TreeNode(6);
		TreeNode n31 = new TreeNode(5);
		TreeNode n32 = new TreeNode(8);
		TreeNode n33 = new TreeNode(4);
		TreeNode n34 = new TreeNode(5);
		TreeNode n35 = new TreeNode(8);
		TreeNode n36 = new TreeNode(4);
		TreeNode n37 = new TreeNode(5);
		TreeNode n38 = new TreeNode(8);

		root.setLeft(n11);
		root.setRight(n12);

		n11.setLeft(n21);
		n11.setRight(n22);
		n12.setLeft(n23);
		n12.setRight(n24);

		n21.setLeft(n31);
		n21.setRight(n32);
		n22.setLeft(n33);
		n22.setRight(n34);
		n23.setLeft(n35);
		n23.setRight(n36);
		n24.setLeft(n37);
		n24.setRight(n38);

		return root;
	}

	public void preOrder(TreeNode root) {
		TreeNode currentTree = root;
		if (currentTree == null)
			return;
		System.out.print(currentTree.getData() + " ");
		preOrder(currentTree.getLeft());
		preOrder(currentTree.getRight());
	}

	public void inOrder(TreeNode root) {
		TreeNode currentTree = root;
		if (currentTree == null)
			return;

		inOrder(currentTree.getLeft());
		System.out.print(currentTree.getData() + " ");
		inOrder(currentTree.getRight());
	}

	public void postOrder(TreeNode root) {
		TreeNode currentTree = root;
		if (currentTree == null)
			return;
		postOrder(currentTree.getLeft());
		postOrder(currentTree.getRight());
		System.out.print(currentTree.getData() + " ");
	}

	public boolean searchKey(TreeNode root, int key) {
		boolean found = false;
		TreeNode currentTree = root;
		if (currentTree == null)
			return false;

		while (currentTree != null) {
			if (key < currentTree.getData()) {
				if (key == currentTree.getData()) {
					found = true;
				}
				currentTree = currentTree.getLeft();
				// return found;
			} else {
				if (key == currentTree.getData()) {
					found = true;

				}
				currentTree = currentTree.getRight();
			}

		}
		return found;
	}

	/* function to print level order traversal of tree */
	void printLevelOrder(TreeNode root) {
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			printGivenLevelRecursive(root, i);
	}

	/*
	 * Compute the "height" of a tree -- the number of nodes along the longest
	 * path from the root node down to the farthest leaf node.
	 */
	int height(TreeNode root) {
		if (root == null)
			return 0;
		else {
			/* compute height of each subtree */
			int lheight = height(root.getLeft());
			int rheight = height(root.getRight());

			int height = (lheight > rheight) ? lheight + 1 : rheight + 1;
			return height;
			// /* use the larger one */
			// if (lheight > rheight)
			// return(lheight+1);
			// else return(rheight+1);
		}
	}

	/* Print nodes at the given level Recursively */
	void printGivenLevelRecursive(TreeNode root, int level) {
		if (root == null)
			return;
		System.out.print(root.getData() + " ");
		if (level > 1) {
			printGivenLevelRecursive(root.getLeft(), level - 1);
			printGivenLevelRecursive(root.getRight(), level - 1);
		}
	}

	/*
	 * Given a binary tree. Print its nodes in level order using array for
	 * implementing queue
	 */
	void printLevelOrderIterative(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {

			/*
			 * poll() removes the present head. For more information on poll()
			 * visit http://www.tutorialspoint.com/java/util/linkedlist_poll.htm
			 */
			TreeNode tempNode = queue.poll();
			System.out.print(tempNode.getData() + " ");

			/* Enqueue left child */
			if (tempNode.getLeft() != null) {
				queue.add(tempNode.getLeft());
			}

			/* Enqueue right child */
			if (tempNode.getRight() != null) {
				queue.add(tempNode.getRight());
			}
		}
	}
	
	
	public int getDiameterOfTree(TreeNode root){
		TreeNode currentTree=root;
		if(currentTree==null)
			return 0;
		int lheight=getDiameterOfTree(currentTree.getLeft());
		int rheight=getDiameterOfTree(currentTree.getRight());
		int lDiameter=getDiameterOfTree(currentTree.getLeft());
		int rDiameter=getDiameterOfTree(currentTree.getRight());
		int finalDiameter=Math.max((lheight+rheight+1),Math.max(lDiameter,rDiameter));
		return finalDiameter;
	}
	
	public boolean isIsomorphicTree(TreeNode root1,TreeNode root2){
		
		return false;
	}
	
	
	// Function to print the spiral traversal of tree
    void printSpiral(TreeNode node) 
    {
        int h = height(node);
        int i;
  
        /* ltr -> left to right. If this variable is set then the
           given label is transversed from left to right */
        boolean ltr = false;
        for (i = 1; i <= h; i++) 
        {
            printGivenLevel(node, i, ltr);
  
            /*Revert ltr to traverse next level in opposite order*/
            ltr = !ltr;
        }
  
    }
    
    /* Print nodes at a given level */
    void printGivenLevel(TreeNode node, int level, boolean ltr) 
    {
        if (node == null) 
            return;
        if (level == 1) 
            System.out.print(node.getData() + " ");
        else if (level > 1) 
        {
            if (ltr != false) 
            {
                printGivenLevel(node.getLeft(), level - 1, ltr);
                printGivenLevel(node.getRight(), level - 1, ltr);
            } 
            else
            {
                printGivenLevel(node.getRight(), level - 1, ltr);
                printGivenLevel(node.getLeft(), level - 1, ltr);
            }
        }
    }

}
