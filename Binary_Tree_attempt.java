
public class Binary_Tree_attempt<Integer> {
    public static class Node<Integer>{
        private int value;
        private Node<Integer> Greater_than;
        private Node<Integer> Less_Than;

        
        public Node(int val){
            this.value= val;
        }

    } 
    Node<Integer> root;
    
    public Binary_Tree_attempt(int val){
        root=new Node<Integer>(val);
    }

    public void push(int value){ //put a clause here about how duplicates are a nono
        Node<Integer> new_node= new Node<Integer>(value);
        Boolean flag=false; //is the new node added yet?
        if(this.root==null){
            this.root=new_node;
        }
        else{
            Node<Integer> current_node=root;
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

    public void get(){
        
    }
}
