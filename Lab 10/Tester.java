import java.util.Scanner;
public class Tester{
  public static void main (String [] args){
    
    
    Scanner fr = new Scanner(System.in);
    System.out.print("size");
    int size = fr.nextInt();
    AdjList a = new AdjList(size);
    System.out.print("edge");
    int x = fr.nextInt();
    int y = fr.nextInt();
    a.insertEdge(x,y);
    a.printList();
  }
}