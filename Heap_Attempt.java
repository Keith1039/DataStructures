
public class Heap_Attempt {
    //This heap is a min-heap since that is probably going to be more useful for when I use heap sort
    public static class Node{
        private int val;
        private Node parent;
        private Node left;
        private Node right;
        private int depth;
        private int pos;

        public Boolean isExternal(){
            return(left==null && right ==null);
        }
        public boolean isFull(){
            return(left != null && right != null);
        }
        public boolean isMostRight(){
            return(pos == (int)(Math.pow(2, depth+1)-1));
        }
    }
    private Node head;
    private Node next_external;
    private int size =0;
    private int maxDepth =0;
    
    public Heap_Attempt(){
        this.head = null;
    }

    public void push(Node node){
        size++;
        node.pos = size;
        if(head == null){
            head = node;
            next_external = node;
            head.depth =0;
        }
        else{
            node.depth=node.parent.depth+1;
            maxDepth=node.depth;
            node.parent = next_external;
            if(next_external.left == null){
                next_external.left = node;
            }
            else{
                next_external.right = node;
            }
        }
        if(next_external.isFull()){
            //finds the left most external node after the current one is full
            if(next_external.isMostRight()){
                //goes down to the left most node of the same depth;
                int z = next_external.depth;
                next_external = head;
                for(int i =0;i<z;i++){
                    next_external=next_external.left;
                }
            }
            else{
                //next_external = findNextExternal();
            }
        }
        
    }

    public void heapify(Node node){
        //upheap meant to be active only after data is pushed by the push function.
        if(node.parent.val > node.val){
            //swaps values 
            int val = node.parent.val;
            node.parent.val = node.val;
            node.val = val;
        }
    }
    public static Node findNextExternal(int pos){
        //Finds the next external node to populate recursively
        



        return(null);
    }



    
}
