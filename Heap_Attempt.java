
public class Heap_Attempt {
    //This heap is a min-heap since that is probably going to be more useful for when I use heap sort
    public static void main(String[] args){
        Heap_Attempt Heap = new Heap_Attempt();
        for(int i=0; i< 8; i++){
            Heap.push(i);
        }
        System.out.println(Heap.next_external.val);


    }
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

    public void push(int num){
        Node node = new Node();
        node.val = num;
        size++;
        node.pos = size;
        if(head == null){
            head = node;
            next_external = node;
            head.depth =0;
        }
        else{
            node.parent = next_external;
            node.depth=node.parent.depth+1;
            maxDepth=node.depth;
            if(next_external.left == null){
                next_external.left = node;
            }
            else{
                next_external.right = node;
            }
        }
        if(next_external.isFull()){
            System.out.println("Triggered");
            //finds the left most external node after the current one is full
            if(next_external.isMostRight()){
                //goes down to the left most node of the same depth;
                int z = next_external.depth+1;
                next_external = head;
                for(int i =0;i<z;i++){
                    next_external=next_external.left;
                }
            }
            else{
                next_external = findNextExternal(next_external.pos,head);
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
    public static Node findNextExternal(int pos, Node node){
        //Finds the next external node to populate recursively
        if(node.pos == pos+1){
            return(node);
        }
        else if(node.left != null && findNextExternal(pos, node.left) == null){
            //if the next external node is not on the right side, backtrack once and go right
            return(findNextExternal(pos, node.right));
        }
        else{
            return(null);
        }

    }



    
}
