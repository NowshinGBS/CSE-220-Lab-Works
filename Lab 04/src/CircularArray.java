public class CircularArray {
 private int start;
   private int size;
   private Object [] cir;
   
   /*
    * if Object [] lin = {10, 20, 30, 40, null}
    * then, CircularArray(lin, 2, 4) will generate
    * Object [] cir = {40, null, 10, 20, 30}
    */
   public CircularArray(Object [] lin, int st, int sz){
     cir = new Object[lin.length];
   int k= start = st;
    size = sz;
     for(int i=0; i<sz; i++){
      cir[k] = lin[i];
      k=(k+1)% cir.length;
     }
     }
   //Prints from index --> 0 to cir.length-1
   public void printFullLinear(){
         int i;
         for(i=0; i<=cir.length-1; i++){
          if(i<cir.length-1){
           System.out.print(cir[i] + ", ");
          }else{
           System.out.print(cir[i] + ".\n");
          }
         }
   } 
   // Starts Printing from index start. Prints a total of size elements
   public void printForward(){
    int k= start;
     for(int i=0; i<size; i++){
      if(i<size-1){
      System.out.print (cir[k] +", ");
      }
      else {
       System.out.print(cir[k] +".\n");
   }
      k= (k+1)%cir.length;
     }
   }
   public void printBackward(){
    int k=(start+size-1)%cir.length;
    for(int i=0; i<=size-1; i++){
      if(i<size-1){
      System.out.print (cir[k] +", ");
      }
      else {
       System.out.print(cir[k] +".\n");
   }
      k--;
      if(k<0){
       k = cir.length-1;
      }
     }
   }
   // With no null cells
   public void linearize(){
    Object [] tempArray = new Object[size];
     int k=start;
     for(int i=0; i<size; i++){
      tempArray[i]=cir[k];
      k=(k+1)%cir.length;
     }
     cir = tempArray;
     start=0;
   }
   // Do not change the Start index
   public void resizeStartUnchanged(int newcapacity){
     Object [] tempArray = new Object[newcapacity];
     int k=start;
     int p=start;
     for(int i=0; i<size; i++){
      tempArray[p]= cir[k];
      k=(k+1) % cir.length;
      p=(p+1) % tempArray.length;  
     }
     cir=tempArray;
   }
   // Start index becomes zero
   public void resizeByLinearize(int newcapacity){
    Object [] tempArray = new Object[newcapacity];
    int k= start;
    for(int i=0; i<size; i++){
     tempArray[i]= cir[k];
     k=(k+1)%cir.length;
//     k++;
//     if(k==cir.length){
//      k=0;
//     }
    }
    cir= tempArray;
   }
   public void insertByRightShift(Object elem, int pos){
     if(size== cir.length){
      resizeStartUnchanged(cir.length+3);
     }
      int nshift=(size-pos);
     int form = (start + size - 1) % cir.length;
     int to = (form + 1) % cir.length;
     for(int i=0; i<nshift; i++){
      cir[to] = cir[form];
      to = form;
      form--;
      if(form<0){
       form=cir.length-1;
      }
     }
//     int index= form;
     int index = (start+ pos)%cir.length;
     cir[index]=elem;
     size++;
   }
   public void insertByLeftShift(Object elem, int pos){
     if(size==cir.length){
      resizeStartUnchanged(cir.length+3);
      }
      int nShift = pos + 1;
      int form = start;
      int to = (form -1);
      if(to<0){
       to = cir.length-1;
      }
      for(int i=0; i<nShift; i++){
       cir[to]=cir[form];
       to = form;
//       to=(to+1)%cir.length;
       form=(form+1)%cir.length;
      }
//     }   
     int index = (start+ pos)%cir.length;
     cir[index] = elem;
     size++;
     start--;
     if(start<0){
      start=cir.length-1;
      }
     }
   /* parameter--> pos. pos --> position relative to start.
    * Valid range of pos--> 0 to size-1
    */
   public void removeByLeftShift(int pos){
     int nShift = size-(pos-1);
     int to = (start+pos)%cir.length;
     int form = (to+1)%cir.length;
     for(int i=0; i<nShift; i++){
      cir[to] = cir[form];
      to= form;
      form = (form+1)%cir.length;
     }
     int lastIndex = (start+ size-1)%cir.length;
     cir[lastIndex]=null;
     size--;
   }
   
   /* parameter--> pos. pos --> position relative to start.
    * Valid range of pos--> 0 to size-1
    */
   public void removeByRightShift(int pos){
     int nShift = pos;
     int to = (start + pos)%cir.length;
     int form = to-1;
     if(form<0){
      form = cir.length-1;
     }
     for(int i=0; i<nShift; i++){
      cir[to] = cir[form];
      to = form;
      form--;
      if(form<0){
       form = cir.length-1;
      }
     }
       cir[start]=null;
       start = (start + 1) % cir.length;
       size--;
     }
   }

