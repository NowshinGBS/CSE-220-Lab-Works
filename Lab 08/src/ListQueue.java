import java.util.*;
public class ListQueue {
	Node front;
	Node rear;
	int size ;
	int Id;
	public ListQueue(){
		front = null;
		rear = null;
		size = 0;
		Id = 0;
	}
	
	
	public void RegisterPatient(){
		System.out.println("Dear Patient, what is your name?");
		Scanner fr = new Scanner(System.in);
		String patinetName = fr.nextLine();
		Id++;
		System.out.println("ID of this Patient is : "+Id+" And name is : "+patinetName+".");
		Node mn = new Node(Id, patinetName, null);
		if(size==0){
		front = mn;
		rear = mn;
	}else{
			rear.next = mn;
			rear = rear.next;
		}
		size++;
	}
	
	public void ServePatient()throws QueueUnderflowException{
		if(front==null){
			throw new QueueUnderflowException();
		}else if(front==rear){
			Node n= front;
			n.ID= null;
			n.name = null;
			n.next = null;
			size--;
		}else {
			Node n= front;
			front = front.next;
			n.ID= null;
			n.name = null;
			n.next = null;
			size--;
		}
	}
	public void CancelAll(){
		System.out.println("Sorry, all appointments are cancel for today.");
		front = null;
		size=0;
	}
	
	public boolean CanDoctorGoHome(){
		if (size==0) {
			System.out.println("Now doctor can go home.");
			return true;
		}
		System.out.println("Doctor cannot go home.");
		return false;
	}
	
	public void ShowAllPatient(){
		   PatientInfoArray tempCell;
		   PatientInfoArray [] temp = new PatientInfoArray[size];
		   Node n= front;
			for(int m= 0; m<size; m++){
				temp[m]=new PatientInfoArray(n.ID,n.name);
			    n=n.next;
			}
		   for(int i=0; i<size; i++){
			   for(int j=i+1; j<size; j++){
			   if(temp[i].name.compareTo(temp[j].name)>0){
				   tempCell = temp[i];
				   temp[i]=temp[j];
				   temp[j]=tempCell;
			   }else if(((Comparable) temp[i].id).compareTo((Comparable)temp[j].id)==0 && ((Comparable) temp[i].id).compareTo((Comparable)temp[j].id)>0){
				   tempCell = temp[i];
				   temp[i]=temp[j];
				   temp[j]=tempCell;		   
			   	}
			  }
		   }
		   
			   for(int i=0; i<size; i++){
		   
				   System.out.println(temp[i].name+" "+temp[i].id+" .");
			   }
		   }
	}
