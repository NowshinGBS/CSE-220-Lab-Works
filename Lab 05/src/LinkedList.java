public class LinkedList{
  public Node head;
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
	  head = new Node(a[0], null);
	  Node n = head;
	  for(int i=1; i<a.length; i++){
		  Node tempNode = new Node(a[i], null);
		  n.next = tempNode;
		  n=n.next;
	  }
  }
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    head = h;
  }
  /* Counts the number of Nodes in the list */
  public int countNode(){
    int c=0;
    for(Node i= head; i!=null;c++, i=i.next){
    	c++;
    }
    return c; 
  }
  /* prints the elements in the list */
  public void printList(){
    for(Node i=head; i!=null; i=i.next){
       if(i.next==null) {
    	System.out.print(i.element+".\n");
	    }    else{
	    	System.out.print(i.element+",");
	    }
    }
  } 
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
	  if(this.countNode()<idx || idx<0){
		  return null;
	  }
	  Node m = null;
	  int c= 0;
	  for(Node n = head; n!= null; n= n.next, c++){
		  if(c==idx){
			  m = n;	   
		  }
	  }
	  return m;
  }  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    Node n = this. nodeAt(idx);
    if(n==null){
    	return null;
    }else{
    	return n.element;
    } 
  } 
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
	  
    Node n = this.nodeAt(idx);
//    int count ;
    if(n==null){
        return null;
    } else{
    	Object oldElenent = n.element;
    	n.element = elem;
    	return oldElenent;
    }
  }  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    int result=0;
    int a=0;
    for(Node n= head; n != null; n=n.next, a++){
    	if (n.element==elem) {
			result = a;
			break;
		}else{
			result=-1;
		}
    }
	return result;
  } 
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
	  boolean result=false;
	    for(Node n= head; n != null; n=n.next ){
	    	if (n.element==elem) {
				result = true;
				break;
			}else{
				result=false;
			}
	    }
    return result; // please remove this line!
  } 
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    Node h1= new Node(head.element, null);
    Node n1 = h1;
    for(Node n= head.next; n!=null; n=n.next){
    	Node temp = new Node(n.element, null);
    	n1.next = temp;
    	n1= temp;
    }
    return h1; // please remove this line!
  } 
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
	  Node rev = null;
    for(Node n= head; n!= null; n=n.next){
    	
    	Node mn= new Node(n.element, null);
    		mn.next= rev;
    		rev = mn;
    	}   
    return rev; // please remove this line!
  } 
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    Node mn = new Node(elem, null);
	  if(idx==0){
    	mn.next = head;
    	head= mn;
	  }
    	else {
			Node pred = nodeAt(idx-1);
			Node succ = pred.next;
			mn.next= succ;
			pred.next = mn;
		}
  } 
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
	  Node n = null;
	  if(this.countNode()<=index || index<0){
		  return null;
	  }
    if(index==0){
    	n = head;
    	head = head.next;
    }
    else{
    	Node pred = nodeAt(index-1);
    	n = pred.next;
    	Node succ = n.next;
	    pred.next=succ;
    }
    Object m = n.element;
    		n.element = null;
    		n.next = null;
    		n=null;
	return m; 

  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
	  Node oldHead = head;
	  head = head.next;
	  Node tail ;
	  for (tail = head; tail.next != null;tail = tail.next){
	  }
	  tail.next = oldHead;
	  oldHead.next = null;
	  }
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
	  Node ptail;
	  Node tail = null;
	 for( ptail = head; ptail.next != null; ptail=ptail.next) {
		  tail = ptail;
		  }
	 ptail.next = head;
	 head = ptail;
	 tail.next = null; 
  }
}