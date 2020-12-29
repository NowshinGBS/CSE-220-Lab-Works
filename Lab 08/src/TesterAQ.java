import java.util.Scanner;

public class TesterAQ {

	public static void main(String[] args) {
		
		Scanner fr = new Scanner(System.in);
		ArrayQueue ar = new ArrayQueue();
		
		int i;
		try{
			for(i=0;;i++){
			printLine("----------Welcome to Doctor's chamber.----------");
			printLine("Enter 1 to Register Patient\n");
			printLine("Enter 2 to Serve Patient\n");
			printLine("Enter 3 to Cancel All\n");
			printLine("Enter 4 to Can Doctor Go Home\n");
			printLine("Enter 5 to Show All Patient\n");
			int userInput =fr.nextInt();
			
			if(userInput>5){
				printLine("Sorry, your number do not match with us. \nSo, please enter your number between 1-5. ");			
			}
			
			if(userInput==1){
				ar.RegisterPatient();
			}else if(userInput==2){
				ar.ServePatient();
			}else if(userInput==3){
				ar.CancelAll();
			}else if (userInput==4) {
//				ar.CanDoctorGoHome();
				printLine(ar.CanDoctorGoHome());
			}else if (userInput==5) {
				ar.ShowAllPatient();
			}
		printLine("If u want to continue the program please press Y/y.");
		String userChoice = fr.nextLine();
		 userChoice = fr.nextLine();
		
		String y1="y";
		String y2="Y";
		if(userChoice.equals(y1) || userChoice.equals(y2)){
			continue;
			
		}else{
			print("----Thanks for visiting Doctor's chamber!----");
			break;
			}
		
		}
	}catch(Exception e){
		
		print(e);
		e.printStackTrace();
	}
		}
	public static void printLine(Object anyObject){
		System.out.println(anyObject);	
	}
	
	
	public static void print(Object anyObject){
		System.out.print(anyObject);
		
	}
}