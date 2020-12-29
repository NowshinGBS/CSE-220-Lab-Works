public class Node{
	Object ID;
	String name;
    Node next;
    
    public Node(Object i, String nm, Node n){
        ID = i;
        name = nm;
        next = n;
    }
}