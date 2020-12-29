import java.util.*;
public class ArrayQueue {
	int front ;
	int rear ;
	int size ;
	int Id ;
	PatientInfoArray [] data =  new  PatientInfoArray[20];
	public ArrayQueue(){
		 front =-1;
		 rear =-1;
		 size = 0;
		 Id=0;	
	}
	public void resize(){
			PatientInfoArray [] tempData = new PatientInfoArray[data.length*2];
			for(int i=0; i<data.length; i++ ){
				tempData [i] = data[i];
			}
			data = tempData;
		}
	
public void RegisterPatient(){
	if(size==data.length){
		resize();
		}
	if(front==-1){
			System.out.println("Dear Patient, what is your name?");
			Scanner fr = new Scanner(System.in);
			String patinetName = fr.nextLine();
			Id++;
			System.out.println("ID of this Patient is : "+Id+" And name is : "+patinetName+".");
			front=0;
			rear=0;
			data[front]=new PatientInfoArray(Id, patinetName);
			size++;
		}else {
			System.out.println("Dear Patient, what is your name?");
			Scanner fr = new Scanner(System.in);
			String patinetName = fr.nextLine();
			Id++;
			System.out.println("ID of this Patient is : "+Id+" And name is : "+patinetName+".");
			rear++;
			data[rear]=new PatientInfoArray(Id, patinetName);
			size++;
		}
}
	
	public void ServePatient()throws QueueUnderflowException{
		if(front==-1){
			throw new QueueUnderflowException();
		}else if(front==rear){
			data[front].name=null;
			data[front].id=null;
			data[front]=null;
			front=-1;
			rear=-1;
			size--;
		}else {
			for(int i=0; i<size; i++){
				data[i]=data[i+1];
			}
			data[rear]=null;
			rear--;
			size--;
		}
	}
	public void CancelAll(){
		System.out.println("Sorry, all appointments are cancel for today.");
		for(int i=0; i<size; i++){
			data[i].name=null;
			data[i].id=null;
			data[i]=null;
		}
		front =-1;
		rear =-1;
		Id=0;
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
		   PatientInfoArray temp;
		   for(int i=0; i<size; i++){
			   for(int j=i+1; j<size; j++){
			   if(data[i].name.compareTo(data[j].name)>0){
				   temp = data[i];
				   data[i]=data[j];
				   data[j]=temp;
			   }else if(((Comparable) data[i].id).compareTo((Comparable)data[j].id)==0 && ((Comparable) data[i].id).compareTo((Comparable)data[j].id)>0){
				   temp = data[i];
				   data[i]=data[j];
				   data[j]=temp;		   
			   	}
			  }
		   }
		   
			   for(int i=0; i<size; i++){
		   
				   System.out.println(data[i].name+" "+data[i].id+" .");
			   }
		   }
	}

