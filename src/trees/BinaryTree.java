package trees;

import structures.node.Node;

public class BinaryTree<T extends Comparable<T>> {
     private Node<T> root;

   
    public BinaryTree() {
        this.root = null;
    }

   
    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void setRoot(T value) {
        this.root = new Node<>(value);
    }

   
    public void add(T value) {
        Node<T> node = new Node<>(value);
        root = addRecursivo(root, node);
    }

    private Node<T> addRecursivo(Node<T> actual, Node<T> nodeInsertar) {
        if (actual == null)
            return nodeInsertar;

        if (nodeInsertar.getValue().compareTo(actual.getValue()) < 0) {
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;
    }

    
    public void preOrden() {
        preOrdenRecursivo(root);
    }

    private void preOrdenRecursivo(Node<T> actual) {
        if (actual == null)
            return;

        System.out.println(actual.getValue());
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }

    
    public void inOrden() {
        inOrdenRecursivo(root);
    }

    private void inOrdenRecursivo(Node<T> actual) {
        if (actual == null)
            return;

        inOrdenRecursivo(actual.getLeft());
        System.out.println(actual.getValue());
        inOrdenRecursivo(actual.getRight());
    }

    public void postOrden() {
        postOrdenRecursivo(root);
    }

    private void postOrdenRecursivo(Node<T> actual) {
        if (actual == null)
            return;

        postOrdenRecursivo(actual.getLeft());
        postOrdenRecursivo(actual.getRight());
        System.out.println(actual.getValue());
    }

    
    public int getHeight() {
        return getHeightRecursivo(root);
    }

    private int getHeightRecursivo(Node<T> actual) {
        if (actual == null)
            return 0;

        int hIzq = getHeightRecursivo(actual.getLeft());
        int hDer = getHeightRecursivo(actual.getRight());

        return Math.max(hIzq, hDer) + 1;
    }

    public int pesoTree() {
        return getPesoRecursivo(root);
    }

    private int getPesoRecursivo(Node<T> actual) {
        if (actual == null)
            return 0;

        int pIzq = getPesoRecursivo(actual.getLeft());
        int pDer = getPesoRecursivo(actual.getRight());

        return pIzq + pDer + 1;
    }
}
