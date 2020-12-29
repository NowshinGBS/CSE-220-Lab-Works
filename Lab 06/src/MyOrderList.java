public class MyOrderList {
  public Node cursor;
  
  public MyOrderList(){
    cursor = null;
  }
  
  public Node gotoBeginning(){
    if(this.isEmpty()==true){
      return null;
    }
    return this.gotoEnd().next;
  }
  
  public Node gotoEnd(){
    if(this.isEmpty()==true){
      return null;
    }
    for( ; ; cursor = cursor.next){
      if(cursor.data>= cursor.next.data){
        break;
      }
    }
    return cursor;
  }
  
  public boolean isEmpty(){
    boolean flag = false;
    if(cursor==null){
      flag = true;
    }
    return flag;
  }
  
  public void insert(Node newElement){
    Node end = this.gotoEnd();
    Node begin = this.gotoBeginning();
    if(this.isEmpty()==true){
      cursor = newElement;
      cursor.next = cursor;
    }
   else if (newElement.data>=end.data || newElement.data<=begin.data){
      if (newElement.data==end.data || newElement.data==begin.data) 
      {
        System.out.println("Element has already been exsist.");
        return;
      }
      else{
        newElement.next = end.next;
        end.next = newElement; 
      }
    }
    else {
      for(Node n = begin; n!= end; n= n.next){
        if(newElement.data < n.next.data){
          newElement.next = n.next;
          n.next = newElement;
          break;
        }
      }
    }
  }
  
  public Node retrieve(int searchKey) {
    boolean flag = false;
    Node begin = this.gotoBeginning();
    if(begin.data==searchKey){
      flag = true;
      cursor = begin;
    }
    for(Node n = begin.next; n!=begin; n = n.next){
      if(n.data==searchKey){
        flag = true;
        cursor = n;
      }
    }
    if(flag == true){  
      return cursor;
    }else{
      System.out.println("Cannot find the sreachKey.");
      return null; 
    }
  }
  
//  public Node remove() {
//    Node begin = this.gotoBeginning();
//    Node n = cursor;
//    if(this.isEmpty() == true){
//      return null;
//    }
//    for(; begin.next!=n; begin=begin.next){  
//    }
//    cursor= cursor.next;
//    begin.next = n.next;
//    n=null;
//    return cursor;
//  }
  
//  public Node remove(){
//    Node begin = this.gotoBeginning();
//    Node n;
//    if(this.isEmpty() == true){
//      return null;
//    }
//    for(n = begin; n.next!=cursor; n=n.next){  
//    }
//    Node m = cursor;
//    cursor= cursor.next;
//    n.next = cursor;
//    m=null;
//    return cursor;
//  }
  
  public Node remove() {
    Node n;
    if(this.isEmpty() == true){
      return null;
    }
    for(n= cursor; n.next!=cursor; n=n.next){  
    }
    Node m = null;
    cursor= cursor.next;
    n.next = cursor;
    m=null;
    return cursor;
  }
  
  public void clear(){
    cursor = null;
  }
  
  public Node gotoNext(){
    if(this.isEmpty()==false){
      cursor=cursor.next;
      return cursor;
    }
    else{
      return null;
    }
  }
  
  public Node gotoPrior() {
    Node n;
    if(this.isEmpty()==false){
      for(n = cursor.next; n.next!=cursor; n= n.next){
      }
      cursor = n;
      return cursor;
    }else{
      return null;
    } 
  }
  
  public void showList() {
    if(this.isEmpty()==false){
      Node begin = this.gotoBeginning();
      if(begin.next==begin){
        System.out.println(begin.data + ".");
      }else{
        System.out.print(begin.data + ", ");
        for(Node n = begin.next; n!= begin; n=n.next){
          if(n.next==begin){
            System.out.println(n.data + ".");
          }else{
            System.out.print(n.data + ", ");
          }
        }
      }  
    }
  }
  
//  public Node remove(int deleteKey) {
//    Node begin = this.gotoBeginning();
//    Node n = retrieve(deleteKey);
//    if((this.isEmpty() == true)||n==null){
//      return null;
//    }
//    for( ; begin.next != n; begin = begin.next){
//      
//    }
//    begin.next = n.next;
//    n= null;
//    return cursor;
//  }
//  
//  public Node getCursor( ){
//    return cursor;
//  }
//}

public Node remove(int deleteKey) {
    Node n = retrieve(deleteKey);
    Node m ;
    if((this.isEmpty() == true)||n==null){
      return null;
    }
    for(m = cursor; m.next!= n; m= m.next){
    }
    cursor = n.next;
    m.next = cursor;
    n= null;
    return cursor;
  }
  
  public Node getCursor( ){
    return cursor;
  }
}

