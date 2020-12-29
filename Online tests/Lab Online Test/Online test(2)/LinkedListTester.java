public class LinkedListTester{
  public static void main(String [] args){
    
    LinkedList h1 = new LinkedList(); // Creates a linked list with head = null
    h1.insertSorted(7);
    System.out.print("Step 1: ");
    h1.printList(); // Should print: 7.
    
    h1.insertSorted(5);
    System.out.print("Step 2: ");
    h1.printList(); // Should print: 5,7. 
    
    h1.insertSorted(78);
    System.out.print("Step 3: ");
    h1.printList(); // Should print: 5,7,78.
    
    h1.insertSorted(2);
    System.out.print("Step 4: ");
    h1.printList(); // Should print: 2,5,7,78.
    
    h1.insertSorted(1);
    System.out.print("Step 5: ");
    h1.printList(); // Should print: 1,2,5,7,78. 
    
    h1.insertSorted(5);
    System.out.print("Step 6: ");
    h1.printList(); // Should print: 1,2,5,5,7,78. 
    
    h1.insertSorted(80);
    System.out.print("Step 7: ");
    h1.printList(); // Should print: 1,2,5,5,7,78,80. 
    
  }
  
}