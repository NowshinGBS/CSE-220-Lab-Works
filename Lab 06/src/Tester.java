public class Tester {
	  
	  public static void main(String[] args) {
	    MyOrderList LinkList = new MyOrderList();
	    
	//  System.out.println(LinkList.isEmpty());
	    System.out.println(LinkList.isEmpty());
	    Node a = new Node(10, null);
	    LinkList.insert(a);
	    LinkList.showList();
	    
	    Node b = new Node(20, null);
	    LinkList.insert(b);
	    LinkList.showList();
	    
	    LinkList.remove();
	    
	    Node c = new Node(30, null);
	    LinkList.insert(c);
	    LinkList.showList();
	    
	    Node d = new Node(40, null);
	    LinkList.insert(d);
	    LinkList.showList();
	    
	    Node e = new Node(50, null);
	    LinkList.insert(e);
	    LinkList.showList();
	    
	    Node f = new Node(50, null);
	    LinkList.insert(f);
	    LinkList.showList();
	    
	    Node g = new Node(25, null);
	    LinkList.insert(g);
	    LinkList.showList();
	    
	    System.out.println(LinkList.isEmpty());
	    
	    LinkList.retrieve(20);
	    
	    a=LinkList.gotoNext();
	    System.out.println(a.data);
	    
	    a=LinkList.gotoNext();
	    System.out.println(a.data);
	    
	    a=LinkList.gotoPrior();
	    System.out.println(a.data);
	    
	    a=LinkList.getCursor();
	    System.out.println(a.data);
	    LinkList.showList();
	    
	    LinkList.remove(20);
	    
	    LinkList.remove(25);
	    LinkList.showList();
	    
	    LinkList.remove();
	    LinkList.showList();
	    
	  } 
	}
