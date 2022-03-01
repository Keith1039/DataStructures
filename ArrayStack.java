
public class ArrayStack implements Stack {
    private Object[] stack;
    private int top;

    //making a dynamic array list seems more fun
    public ArrayStack(int capacity){
        stack = new Object[capacity];
        top=-1;
    }
    public int getLength(){
        return(this.stack.length);
    }

    public Object peek(){
        if(top <0){
            return(null);
        }
        return(stack[top]);
    
    }

    public Object pop(){
        if(top < 0){
            return(null);
        }
        Object returnable=stack[top];
        stack[top]=null;
        top--;
        return(returnable);
        
    }

    public void push(Object other){
        if(top==this.getLength()-1){
            ArrayStack stack2;
            stack2=new ArrayStack(this.getLength()+1);
            for(int i=0; i<this.getLength();i++){
                stack2.stack[i]=this.stack[i];
            }
            stack2.stack[this.getLength()+1]=other;
            this.stack=stack2.stack;
        }
        else{
            top++;
            this.stack[top+1]=other;
        }
    }
    public boolean IsEmpty(){
        return(top==-1);
    }

    
}
