import java.util.*;
public class Task01 {
	public static void main(String[] args) throws Exception {
		Scanner fr = new Scanner(System.in);
		String str = fr.nextLine();
			test(str);
	}
	public static void test(String s)throws StackOverflowException, StackUnderflowException{
		ArrayStack as = new ArrayStack();
		ArrayStack asPos = new ArrayStack();
		boolean flag = false;
		int i = 0 ;
		char[] charArray = s.toCharArray();
		try{
			for (i = 0; i < charArray.length; i++) {
			if(charArray[i]=='(' || charArray[i]=='{' || charArray[i]=='['){
				as.push(charArray[i]);
				asPos.push(i);
			}else if (charArray[i]==')' || charArray[i]=='}' || charArray[i]==']') {
				char popCh =  (char) as.pop();
				int popInt = (int) asPos.pop();
				if(popCh == '(' && charArray[i]==')'){
					flag = true;
				}else if (popCh == '{' && charArray[i]=='}'){
					flag = true;
				}else if(popCh == '[' && charArray[i]==']'){
					flag = true;
				}else {
					System.out.println("This expression is NOT correct.\nError at character # "+ (popInt+1) +". '"+popCh+"'- not closed.");
					flag = false;
//					break;
					}
				}
			}
		}
		catch(Exception e){
			flag = false;
			System.out.println("This expression is NOT correct.\nError at character # "+(i+1)+". ‘"+ s.charAt(i)+"‘- not opened.");
		}
		if(as.isEmpty()==true){
			if(flag==true){
				System.out.println("This arithmetic expression is balanced."); 
			}else{
				System.out.println("This arithmetic expression is not balanced.");
			}
		}else{
			System.out.println("This arithmetic expression is not balanced.");
		}
	}
}