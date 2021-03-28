public class ArrayDeque implements DequeInterface {
  private Object[] arr;
  private int f,r,n,currSize;
  public ArrayDeque(){
    arr=new Object[1];
    n=arr.length;
    f=-1;
    r=0;
    currSize=0;
  }
  public void insertFirst(Object o){
    if(size()==n){
      Object[] newArr=new Object[2*n];
      int i;
      for(i=0;i<n;i++){
        newArr[i]=arr[(f+i)%n];
      }
      arr=newArr;
      n*=2;
      f=0;
      r=i-1;
      f=(n+f-1)%n;

    }
    else{
      // first element in deque
      if(f==-1){
        f++;
      }
      else{
        f=(n+f-1)%n;
      }
    }
    arr[f]=o;
    currSize++;
  }
  
  public void insertLast(Object o){
    if(size()==n){
      Object[] newArr= new Object[2*n];
      int i;
      for(i=0;i<n;i++){
        newArr[i]=arr[(f+i)%n];
      }
      arr=newArr;
      f=0;
      n*=2;
      r=i-1;
      r=(r+1)%n;
    }
    else{
      // first element in deque
      if(f==-1){
        f++;
      }
      else{
        r=(r+1)%n;
      }
    }
    arr[r]=o;
    currSize++;
  }
  
  public Object removeFirst() throws EmptyDequeException{
    if(isEmpty()==true){
      throw new EmptyDequeException("Deque is Empty");
    }else{
      Object popped=arr[f];
      // only one element in Deque
      if(f==r){
        f=-1;
        r=0;
      }else{
        f=(f+1)%n;
      }
      currSize--;
      return popped;
    }
  }
  
  public Object removeLast() throws EmptyDequeException{
    if(isEmpty()==true){
      throw new EmptyDequeException("Deque is Empty");
    }
    else{
      Object dequeued=arr[r];
      //only one element in Deque
      if(f==r){
        f=-1;
        r=0;
      }else{
        r=(n+r-1)%n;
      }
      currSize--;
      return dequeued;
    }
  }

  public Object first() throws EmptyDequeException{
    if(isEmpty()==true){
      throw new EmptyDequeException("Deque is Empty");
    }else{
      return arr[f];
    }
  }
  
  public Object last() throws EmptyDequeException{
    if(isEmpty()==true){
      throw new EmptyDequeException("Deque is Empty");
    }else{
      return arr[r];
    }
  }
  
  public int size(){
    return currSize;
  }
  
  public boolean isEmpty(){
    return currSize==0;
  }

  public String toString(){
    String answer="[";
    if(f<=r){
      for(int i=f;i<=r;i++){
        if(i==r){
          answer+=String.valueOf(arr[i]);
        }else{
          answer+=String.valueOf(arr[i])+", ";
        }
      }
    }else{
      for(int i=f;i<n;i++){
        answer+=String.valueOf(arr[i])+", ";
      }
      for(int i=0;i<=r;i++){
        if(i==r){
          answer+=String.valueOf(arr[i]);
        }else{
          answer+=String.valueOf(arr[i])+", ";
        }
      }
    }
    answer+="]";
    return answer;
  }  
}