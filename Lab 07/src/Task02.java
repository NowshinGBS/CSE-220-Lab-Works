import java.util.Scanner;
public class Task02 {
	public static void main(String[] args) throws Exception {
		Scanner fr = new Scanner(System.in);
		String str = fr.nextLine();
			test(str);
	}
	public static void test(String s)throws StackOverflowException, StackUnderflowException{
		ListStack ls = new ListStack();
		ListStack lsPos = new ListStack();
		boolean flag = false;
		int i = 0 ;
		char[] charArray = s.toCharArray();
		try{
			for (i = 0; i < charArray.length; i++) {
			if(charArray[i]=='(' || charArray[i]=='{' || charArray[i]=='['){
				ls.push(charArray[i]);
				lsPos.push(i);
			}else if (charArray[i]==')' || charArray[i]=='}' || charArray[i]==']') {
				char popCh =  (char) ls.pop();
				int popInt = (int) lsPos.pop();
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
			System.out.println("Error at character # "+i+". ‘"+ s.charAt(i)+"‘- not opened.");
		}
		if(ls.isEmpty()==true){
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