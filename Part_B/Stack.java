// You should utilise your implementation of ArrayDeque methods to implement this
public class Stack implements StackInterface {
	DequeInterface myStack = new ArrayDeque();
	public void push(Object o){
    	myStack.insertLast(o);
  	}

	public Object pop() throws EmptyStackException{
    	if(myStack.isEmpty()){
    		throw new EmptyStackException("Stack is Empty");
		}else{
    		try {
				return myStack.removeLast();
			}catch(EmptyDequeException e){
    			throw new EmptyStackException("Stack is Empty");
				}
			}
    	}

	public Object top() throws EmptyStackException{
		if(myStack.isEmpty()){
			throw new EmptyStackException(("Stack is Empty"));
		}else{
			try{
				return myStack.last();
			}catch (EmptyDequeException e){
				throw new EmptyStackException("Stack is Empty");
			}
		}
	}

	public boolean isEmpty(){
    	return myStack.isEmpty();
	}

    public int size(){
    	return myStack.size();
    }
}