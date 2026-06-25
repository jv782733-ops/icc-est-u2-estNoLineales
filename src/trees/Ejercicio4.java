package trees;

import structures.node.Node;
public class Ejercicio4 {
    public int maxDepth(Node<Integer> root) {
        
        if (root == null) {
            return 0;
        }        
        int depthIzquierdo = maxDepth(root.getLeft());
        int depthDerecho = maxDepth(root.getRight());
        return Math.max(depthIzquierdo, depthDerecho) + 1;
    }
}
