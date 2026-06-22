package trees;

import structures.node.Node;

public class IntTree {

    private Node<Integer> root;

    public IntTree() {
        this.root = null;
    }

    
    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }

    public void setRoot(int value) {
        this.root = new Node<>(value);
    }

    public void add(int value) {
        Node<Integer> node = new Node<>(value);
        root = addRecursivo(root, node);
    }

    private Node<Integer> addRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar) {
        if (actual == null)
            return nodeInsertar;

        if (nodeInsertar.getValue() < actual.getValue()) {
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;
    }

    public void preOrden() {
        preOrdenRecursivo(root);
    }

    private void preOrdenRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;

        System.out.println(actual.getValue());
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }
     

    public void postOrden() {
        postOrdenRecursivo(root);
    }

    private void postOrdenRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;

        postOrdenRecursivo(actual.getLeft());
        postOrdenRecursivo(actual.getRight());
        System.out.println(actual.getValue());
    }
    
    public void inOrden() {
        inOrdenRecursivo(root);
    }

    private void inOrdenRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;

        inOrdenRecursivo(actual.getLeft());
        System.out.println(actual.getValue());
        inOrdenRecursivo(actual.getRight());
    }

    public int getHeight(){
        return getHeightRecursivo(root);
    }


    private int getHeightRecursivo(Node<Integer> actual) {
        if(actual == null)
            return 0;

        int heightLeft = getHeightRecursivo(actual.getLeft());
        int heightRight = getHeightRecursivo(actual.getRight());

        int masAlto = Math.max(heightLeft, heightRight);
        return masAlto + 1;
    }

    public int pesoTree(){
        return getPesoRecursivo(root);
        
    }


    private int getPesoRecursivo(Node<Integer> actual) {
      if(actual == null)
            return 0;

        int heightLeft = getHeightRecursivo(actual.getLeft());
        int heightRight = getHeightRecursivo(actual.getRight());

        return heightLeft  + heightRight + 1;
    }

    
     
}

    
        
    

