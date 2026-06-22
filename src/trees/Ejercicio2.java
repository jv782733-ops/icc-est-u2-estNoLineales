package trees;

import structures.node.Node;

public class Ejercicio2 {
    public void inverTree(Node<Integer>root){
        System.out.println("Arbol original");
        printTree(root);
        invertirRecursivo(root);
        System.out.println("Arbol invertido");
        printTree(root);
        
    }

    private void invertirRecursivo(Node<Integer> actual) {
        if(actual == null){
            return;
        }
        System.out.println("actual"+ actual);
        invertirRecursivo(actual.getLeft());
        invertirRecursivo(actual.getRight());
    }

    private void printTree(Node<Integer> root) {
        
    }
}
