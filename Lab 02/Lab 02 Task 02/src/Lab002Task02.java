import java.util.*;
import java.io.*;
public class Lab002Task02 {

	public static void main(String[] args) {
		

		Scanner fr = new Scanner(System.in);
		Book [] bookArray = new Book[100];
		int size=0;
		StringTokenizer ST;
		FileReader FR;
		BufferedReader BR;
		String line = null;
		
		try {
			 FR = new FileReader("Book.txt");
			 BR = new BufferedReader(FR);
//			 while(fr.hasNext()){
			 for(;(line=BR.readLine())!=null;){
				
				 String name = null;
				 String id = null;
				 String author = null;
				 String publisher = null;
				 
//				 StringTokenizer ST;
				 ST	= new StringTokenizer(line," ");
				 System.out.println("Total tokens : " + ST.countTokens());
		 				 

				 for(;ST.hasMoreTokens();) {

					 name=ST.nextToken();
					 id=ST.nextToken();
					 author=ST.nextToken();
					 publisher= ST.nextToken();					
				}
				 
				 bookArray[size]= new Book(name, id, author, publisher);
				 size++;
			 }
			 
//			 StringTokenizer ST;
//			 ST	= new StringTokenizer(line," ");
//				 
//				 while (ST.hasMoreTokens()){
//					 printLine("Next token : " + ST.nextToken());
//					 
//				 } 
				 
			 BR.close();
			
		} catch (Exception x) {
			// TODO: handle exception
			System.out.println(x);
			x.printStackTrace();
		}
			finally{
				
				printLine("----The End----");
			}
		int i = 0;
		
		while (i<size) {
			printLine(bookArray[i].name+" "+bookArray[i].id+" "+bookArray[i].author+" "+bookArray[i].publisher+" .");
			i++;
		}
	
	try{
//		printLine("Please enter your book name->Output.txt");
		File fileName = new File("Object.txt");
		FileWriter FW = new FileWriter(fileName);
		BufferedWriter BW = new BufferedWriter(FW);
		
		for(int a= 0; a<size; a++){
			BW.write( bookArray[a].name + " ");
			BW.write( bookArray[a].id + " ");
			BW.write( bookArray[a].author + " ");
			BW.write( bookArray[a].publisher + " ");
		    BW.newLine();
		    
		}
		BW.close();
	}
		catch (Exception e) {
			e.printStackTrace();
			printLine(e);
			// TODO: handle exception
		}
		finally{
			printLine("----The End----");
		}
		
	}

		public static void printLine(Object anyObject){
			System.out.println(anyObject);
			
		}
			
	}


