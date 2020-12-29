import java.util.Scanner;
public class AdjList{
Node head[];
AdjList(int s){
  head = new Node[s]; 
}
public void insertEdge(int c, int v){
Node n = new Node(v, null);

if(head[c]==null){
head[c]=n;
}else{
  for(Node k = head[c];;k=k.next){
    if(k.next==null){
      k.next=n;
      break;
  }
}
}
head = new Node[null];
}
public void printList(){
  for(int i=0; i<head.length; i++){
    for(Node n = head[i]; n!=null; n=n.next){
    System.out.print(n.val);
    }
    System.out.println();
  }
}
}
