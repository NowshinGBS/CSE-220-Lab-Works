public class ArrayStack implements Stack{
    int size;
    int top;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        top =-1;
        data = new Object[20];
    }

public int size(){
	for(int c = 0; c<data.length; c++){
		if(data[c]!=null){
			size++;
		}else{
			break;
		}
	}
	return size;
}

public boolean isEmpty(){
//	if(size==0){???????
//	if(top==-1){???????
	if(data[0]==null){
		return true;
	}else{
		return false;
	}
}

public void push(Object e) throws StackOverflowException{
	if(size==data.length){
		throw new StackOverflowException();
	}else{
		data[top+1]=e;
//		data[size]=e;
		top++;
		size++;
	}
	
}

public Object pop() throws StackUnderflowException{
	Object m;
//	if(size==0){
	if(top==-1){
		throw new StackUnderflowException();
	}else{
		m = data[top];
		data[top]= null;
		top--;
		size--;
		return m;
	}
}

public Object peek() throws StackUnderflowException{
	Object m;
//	if(size==0){
	if(top==-1){
		throw new StackUnderflowException();
	}else{
//		 m = data[top];
		return data[top];
	}
//		return m;
}

public String toString(){
	String str = "";
	for(int c =0; c < data.length; c++){
		str = str + data[c];
	}
	return str;
}

public Object[] toArray(){ 
	Object [] temp = new Object[size];
	int i = size-1;
	for(int n = 0; n<=size-1; n++, i-- ){
		temp[n]=data[i];
	}
	return temp;
}

public int search(Object e){
	for(int offset= 0; offset<=size-1; offset++){
		if(data[offset]==e){
			return offset;
		}
	}
		return -1;
	}
}