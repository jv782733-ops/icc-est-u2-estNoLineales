package trees;



import structures.node.Node;

public class Ejercicio2 {

    public static void invertTree(Node<Integer> actual) {
        
    if (actual == null) {
            return;
        }

        System.out.println("Nodo actual: " + actual);

       
        Node<Integer> temp = actual.getLeft();

        actual.setLeft(actual.getRight());
        actual.setRight(temp);

        invertTree(actual.getLeft());
        invertTree(actual.getRight());


    }
    public static void imprimirArbolInvertido(Node<Integer> actual) {
    imprimirInvertidoRecursivo(actual, 0);
}

    private static void imprimirInvertidoRecursivo(Node<Integer> actual, int nivel) {
    if (actual == null) {
        return;
    }
    imprimirInvertidoRecursivo(actual.getRight(), nivel + 1);

    for (int i = 0; i < nivel; i++) {
        System.out.print("    "); 
    }
    System.out.println(actual.getValue());

    imprimirInvertidoRecursivo(actual.getLeft(), nivel + 1);
}
    
}