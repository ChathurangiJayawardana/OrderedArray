
package ordarrayapp;


public class OrdArrayApp {

  
    public static void main(String[] args) {
      OrdArray x=new OrdArray(10);  
        x.insert(4);
        x.insert(6);
        x.insert(2);
        x.insert(8);
        x.delete(2);
        x.display();
        
    }
    
}

class OrdArray{
    private long[]a;
    private int nElements;
    
    public OrdArray(int max){
        a=new long[max];
        nElements=0;
    }
    public int size(){
        return a.length;
    }
    public int find(long searchKey){
        for(int i=0;i<nElements;i++){
            if(a[i]==searchKey){
                return i;
            }
        }
        return -1;
    }
    public void insert(long value){
        if(a.length==nElements){
            System.out.println("array is full");
        }
        else{
            long temp;
            for(int i=0;i<nElements;i++){
                if(a[i]>value){
                    temp=a[i];
                    a[i]=value;
                    value=temp;
                }
            }
            a[nElements]=value;
            nElements++;
        }
    }
    public boolean delete(long value){
      if(nElements==0){
          System.out.println("array is empty");
          return false;
      } 
      boolean status =false;
      for(int i=0;i<nElements;i++){
          if(a[i]==value){
              for(int j=0;j<nElements;j++){
                  a[j]=a[j+1];
              }
              nElements--;
              status=true;
              i--;
          }
      }
      if(status){
          System.out.println("value deleted");
      }
      else{
          System.out.println("value not found");
      }
      return status;
    }
    public void display(){
       for(int i=0;i<nElements;i++){
           System.out.print(a[i]+" ");
       } 
       System.out.println();
    }
}
    
