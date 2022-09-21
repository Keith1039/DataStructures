public class Improved_Linked_List<E> {
    /*This Node class is built with an improved way of replacing the last node in a linked list by
      Only having the final node be doubly linked.
    */
    private Node<E> head=null;
    private Node<E> tail=null;
    public static void main(String[] args){
        Improved_Linked_List<Integer> list = new Improved_Linked_List<Integer>();
        list.push(1);
        list.push(23);
        list.push(3);
        Node<Integer> temp = list.head;
        while(temp != null){
            System.out.println(temp.isType());
            temp = temp.getNext();
        }
    }
    public static interface Node<E>{
        /*interface Node because the "next" and "prev" Node can be 1 of 2 types. Simply saves me the headache */
        public void setNext(Node<E> node);
        public void setPrev(Node<E> node);
        public Node<E> getNext();
        public Node<E> getPrev();
        public E getValue();
        public String isType();
        

    }
    
    public static class Node1<E> implements Node<E>{
        /*Typical Node structure */
        private E value;
        private Node<E> next;

        public Node1(){

        }
        public Node1(E value){
            this.value = value;
        }
        public Node1(E value, Node<E> next){
            this.value = value;
            this.next = next;
        }
        public void setNext(Node<E> node){
            this.next = node;
        }
        public void setPrev(Node<E> node){

        }
        public Node<E> getNext(){
            return(this.next);
        }
        public Node<E> getPrev(){
            /*Never gonna be used but I have to implement it anyway :) */
            return(null);
        }
        public E getValue(){
            return(this.value);
        }
        public String isType(){
            return("Node1");
        }
        

    }

    public static class Node2<E> implements Node<E>{
        /*the Node with the pointer both forwards and backwards. */
        private E value;
        private Node<E> prev;
        private Node<E> next;

        public Node2(E value,Node<E> prev, Node<E> next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
        public Node1<E> getNode1(){
            return(new Node1<E>(this.value,this.next));
        }

        public void setNext(Node<E> node){
            this.next = node;
        }
        public void setPrev(Node<E> node){
            this.prev = node;
        }
        public Node<E> getNext(){
            return(this.next);
        }
        public Node<E> getPrev(){
            return(this.prev);
        }
        public E getValue(){
            return(this.value);
        }
        public String isType(){
            return("Node2");
        }
        

    }

    public void push(E value){
        //less efficient push
        if(head == null){
            head = new Node1<E>(value);
            tail = head;
        }
        else{

            /*


            Node1 prev = tail.getPrevious();
             */
            tail.setNext(new Node2<E>(value,tail,null));
            tail.getNext().setPrev(tail);
            if(head != tail){ //Condition ensures that only a Node2 type triggers this
                //replaces the old tail with the same tail of Node1 type
                tail.getPrev().setNext(new Node1<E>(tail.getValue(),tail.getNext()) );
            }
            tail = tail.getNext();
            
        }
    }

    public void Replace_Last(E value){
        if(head ==tail){
            head = new Node1<E>(value, null);
        }
        else{
            Node2<E> new_node = new Node2<E>(value, tail.getPrev(), null);
            tail.getPrev().setNext(new_node);
            tail = new_node;
            
        }
    }

    
}
