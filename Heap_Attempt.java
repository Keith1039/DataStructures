public class Heap_Attempt {
    //This heap is a min-heap since that is probably going to be more useful for when I use heap sort
    public static class Node{
        private int val;
        private Node parent;
        private Node left;
        private Node right;

        public Boolean isExternal(){
            if(left == null && right == null){
                return(true);
            }
            return(false);
        }
    }
    private Node head;
    private Node next_external;
    
    public Heap_Attempt(){
        this.head = null;
    }

    public void push(Node node){
        if(head == null){
            head = node;
            next_external = node;
        }
        else{

        }
    }

    public void heapify(Node node){
        //upheap
    }

    
}
