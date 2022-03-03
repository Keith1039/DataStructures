public class NodeStack implements Stack {
    private Node top;
    private Node[] nodelist;
    private Node first;

    public NodeStack(){
        nodelist=new Node[1];
    }
    public void push(Object other){
        if(nodelist[0]==null){
            first=new Node(other,null);
            top=first;
            nodelist[0]=first;
        }
        else{
        Node nextnode=new Node(other,null);
        top.setNext(nextnode);
        top=nextnode;
        }
    }

    
    public boolean IsEmpty(){
        return(nodelist[0]==null);
    }
    
    public Object peek(){
        return(top.getValue());
    }

    
    public Object pop(){
        Node returnable;
        if(IsEmpty()==true){
            return(null);
        }else{
            returnable=top;
            top=newTop();
        }
        return(returnable.getValue());
    }
    public Node newTop(){
        Node CurrentNode;
        CurrentNode=nodelist[0];
        while(CurrentNode.getNext()!=null){
            CurrentNode=CurrentNode.getNext();
        }

        return(CurrentNode);
    }
    

    

    
}
