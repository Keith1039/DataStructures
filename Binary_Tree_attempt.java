public class Binary_Tree_attempt<Integer> {
    public static class Node<E>{
        private int value;
        private Node<E> Greater_than;
        private Node<E> Less_Than;

        public Node<E>(){
            this.value=null;
            this.Greater_than=null;
            this.Less_Than=null
        }

    } 
    Node<Integer> root;
}
