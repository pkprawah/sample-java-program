package datastructure.linkedlist;

import java.util.Arrays;

public class UnrolledLinkedListNode {

	int numElements;
	int array[];
	UnrolledLinkedListNode next;
	
    /* Constructor */

    public UnrolledLinkedListNode(int n)

    {

        next = null;

        numElements = 0;

        array = new int[n];        

    }

	@Override
	public String toString() {
		return "UnrolledLinkedListNode [numElements=" + numElements + ", array=" + Arrays.toString(array) + ", next="
				+ next + "]";
	}

    
}
