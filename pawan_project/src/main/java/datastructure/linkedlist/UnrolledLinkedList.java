package datastructure.linkedlist;

public class UnrolledLinkedList {

	private UnrolledLinkedListNode start;

	private UnrolledLinkedListNode end;

	private int sizeNode;

	private int nNode;

	/* Constructor */

	public UnrolledLinkedList(int capacity)

	{

		start = null;

		end = null;

		nNode = 0;

		sizeNode = capacity + 1;

	}
	
    /* Function to insert element */

    public void insert(int x)

    {

        nNode++;

        if (start == null)

        {

            start = new UnrolledLinkedListNode(sizeNode);

            start.array[0] = x;

          
            start.numElements++;
           
            //System.out.println("UnrolledLinkedList Insert method start.numElements++ value is :::"+start.numElements++);
            System.out.println("UnrolledLinkedList Insert method start value is :::"+start);

            end = start;
            
            System.out.println("UnrolledLinkedList Insert method in first if end value is :::"+end);

            return;

        }

        if (end.numElements + 1 < sizeNode)

        {

            end.array[end.numElements] = x;

            end.numElements++;                        

        }

        else

        {

        	UnrolledLinkedListNode nptr = new UnrolledLinkedListNode(sizeNode);

            int j = 0;

            for (int i = end.numElements / 2 + 1; i < end.numElements; i++)

                nptr.array[j++] = end.array[i];

            nptr.array[j++] = x;
            System.out.println("UnrolledLinkedList Insert in else condition method start value is :::"+nptr);

            nptr.numElements = j;
            System.out.println("UnrolledLinkedList Insert in else condition method start value is :::"+j);

            end.numElements = end.numElements/2 + 1;
            
            System.out.println("UnrolledLinkedList Insert in else condition  end.numElements method start value is :::"+ end.numElements);

            end.next = nptr;  
            
            System.out.println("UnrolledLinkedList Insert in else condition  end.numElements method start value is :::"+ end);


            end = nptr;          

        }        

    }
    
    
    /* Function to display list */

    @Override
	public String toString() {
		return "UnrolledLinkedList [start=" + start + ", end=" + end + ", sizeNode=" + sizeNode + ", nNode=" + nNode
				+ "]";
	}

	public void display()

    {

        System.out.print("\nUnrolled Linked List = ");

        if (nNode == 0) 

        {

            System.out.print("empty\n");

            return;

        }

        System.out.println();

        UnrolledLinkedListNode ptr = start;

        while (ptr != null)

        {

            for (int i = 0; i < ptr.numElements; i++)

                System.out.print(ptr.array[i] +" ");

            System.out.println();            

            ptr = ptr.next;

        }

    }
	
	
	
}
