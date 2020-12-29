public class LinkedList{
  public Node head;
  
  
  /* Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(){
    head = null;
  }
  
  /* prints the elements in the list */
  public void printList(){
    for(Node n = head; n!=null; n=n.next){
      if(n.next!=null){
        System.out.print(n.element + ",");         
      }
      else{
        System.out.print(n.element + ".");   
      }
    }
    System.out.println();       
  }
  
  /* inserts Node that contains the given element in sorted order.
   */
  public void insertSorted(Object elem){
    
    //TO DO
  }
  
}