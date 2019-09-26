package datastructure.linkedlist;

import java.util.Scanner;

public class UnrolledLinkedListTest {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unrolled Linked List Test\n");  

        System.out.println("Enter array size of each node");       

        /* Creating object of class UnrolledLinkedList */

        UnrolledLinkedList ull = new UnrolledLinkedList(scanner.nextInt() ); 
        
        
        char ch;

        /*  Perform list operations  */

        do

        {

            System.out.println("\nUnrolled Linked List Operations\n");

            System.out.println("1. Insert");
            
            int choice = scanner.nextInt();            

            switch (choice)

            {

            case 1 :  

                System.out.println("Enter integer element to insert");

                ull.insert( scanner.nextInt() );                     

                break;
                
            default : 

                System.out.println("Wrong Entry \n ");

                break;   

            }

            /*  Display List  */ 

            ull.display();
            
            System.out.println("\nDo you want to continue (Type y or n) \n");

            ch = scanner.next().charAt(0);                        

        } while (ch == 'Y'|| ch == 'y');               

	}

}
