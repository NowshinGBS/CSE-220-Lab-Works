public class LinkedList{
  public Node head;
  
  
  /* Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    head = new Node(a[0], null);
    Node tail = head;
    
    for(int i = 1; i<a.length; i++){
      Node mn = new Node(a[i], null);
      tail.next = mn;
      tail=tail.next;
    }  
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
  
  
  /* removes Node that contains the given element. returns index of the removed node.
   * return -1 if element does not exists in the list.
   */
  public int remove(Object elem){
     int c=0;
     Node n = head;
     int result = -1;
     Node i;
     int q;
    for( i= head; i!=null; i=i.next){
     c++;
//    q++;
    if(i==elem){
      q = c-1;
    result= c;
     Node pred = i.element;
     Node m = pred.next;
     Node succ = m.next;
    pred.next = succ;
    m.element = null;
    m.next = null;
    n = null;
   }
    n = n.next;
     }
    
    
    return result;
  }
    
    
    
//    Node n= head;
//    for(int i=0; i<idx; i++){
//     n = n.next;
//     result = n.element;
//  }

  
  
}