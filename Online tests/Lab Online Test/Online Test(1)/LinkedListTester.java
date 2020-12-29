public class LinkedListTester{
  public static void main(String [] args){
    
    
    Object [] a1 = {10,20,30,40,50,60};
    LinkedList h1 = new LinkedList(a1); // Creates a linked list using the values from the array
    // head will refer to the Node that contains the element from a[0]
    
    h1.printList(); // This should print: 10,20,30,40,50,60. 
 
    
   /* removes Node that contains the given element. returns index of the removed node.
   * return -1 if element does not exists in the list.
   */
    System.out.println("Index of removed element: "+ h1.remove(10)); // This should print: Index of removed element: 0
    h1.printList(); // This should print: 20,30,40,50,60.  
    System.out.println("Index of removed element: "+ h1.remove(95)); // This should print: Index of removed element: -1
    h1.printList(); // This should print: 20,30,40,50,60.  
    System.out.println("Index of removed element: "+ h1.remove(50)); // This should print: Index of removed element: 3
    h1.printList(); // This should print: 20,30,40,60. 
    
    
  
  }
  
}