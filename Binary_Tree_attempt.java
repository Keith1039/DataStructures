
public class Binary_Tree_attempt<E>{ 
    public static class Node<E>{
        private int value;
        private Node<E> Greater_than;
        private Node<E> Less_Than;

        
        public Node(int val){
            this.value= val;
        }

    } 
    Node<E> root;
    
    public Binary_Tree_attempt(int val){
        root=new Node<E>(val);
    }

    public void push(int value){ //put a clause here about how duplicates are a nono
        Node<E> new_node= new Node<E>(value);
        Boolean flag=false; //is the new node added yet?
        if(this.root==null){
            this.root=new_node;
        }
        else{
            Node<E> current_node=root;
            while(flag==false){
                if(current_node.value< value &&current_node.Greater_than==null){
                    current_node.Greater_than=new_node;
                    flag=true;
                }
                
                else if(current_node.value> value &&current_node.Less_Than==null){
                    current_node.Less_Than=new_node;
                    flag=true;
                }
                else if(current_node.value < value){
                    current_node=current_node.Greater_than;
                }
                else if(current_node.value > value){
                    current_node=current_node.Less_Than;
                }
            }
        }
        
    }

    public void get(){ //

    }

    public int Sumation(){
        int returnable =0;

        return(returnable);
    }


    
}
