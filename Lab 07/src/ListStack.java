public class ListStack implements Stack{
    int size;
    Node top;
    Node head;
    
    public ListStack(){
        size = 0;
        top = null;
        head = null;
    }
    
    public int size(){
    	int count =0;
    	Node n;
    	for(n= head; n!=null; n= n.next, count++){	
    	}
    	return count;
    }
    
    public boolean isEmpty(){
    	if(size==0){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    public void push(Object e){
    	Node mn = new Node(e, null);
    	mn.next = top;
    	top = mn;
    	size++;
    }
    
    public Object pop() throws StackUnderflowException{
    	Object n= null;
    	if(size==0){
    		throw new StackUnderflowException();
    	}else{
    		n = top.val;
    		Node m = top;
    		top = top.next;
    		m.val = null;
    		m.next = null;
    		m = null;
    		size--;
    		return n;
    	}
    }
    
    public Object peek() throws StackUnderflowException{
    	if(size==0){
    		throw new StackUnderflowException();
    	}else{
    		return top.val;
    	}
    }
    
    public String toString(){
    	String str = "";
    	for(Node n = top; n.next!=null; n= n.next){
    		str = str + n.val;
    	}
    	return str;
    }
    
    public Object[] toArray(){
    	Object [] temp = new Object[size];
    	Node n = top;
    	for(int i= size-1; i>=0; i--, n= n.next){
    		temp[i]= top.val;
    	}
    	return temp;
    }

	public int search(Object e) {
		    int offset=0;
		    for(Node n= head; n != null; n=n.next, offset++){
		    	if (n.val==e) {
					return offset;
				}
		    }
			return -1;
	}
}