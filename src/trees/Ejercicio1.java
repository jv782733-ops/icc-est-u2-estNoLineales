package trees;

import structures.node.Node;

public class Ejercicio1 {
    public void insert(int[] numeros){
        //Crear arbol de enteros
        //Insertar cada numero
        // imprimir el arbol

        BinaryTree<Integer> tree = new BinaryTree<>();
        for(int numero : numeros ){
              tree.add(numero);
            
        }
        printTree(tree.getRoot());

        
    }

    private void printTree(Node<Integer> root) {
       // System.out.println("imprimiendo el arbol");
        printTreeRecursivo(root, 0);
    }

    private void printTreeRecursivo(Node<Integer> actual, int nivel) {
       if(actual== null ) return;
       printTreeRecursivo(actual.getRight(),nivel+1);

       for(int  i=0 ; i< nivel;i++){
       System.out.print("\t");
       }
       System.out.println(actual.getValue());
       printTreeRecursivo(actual.getLeft(), nivel+1 );

       
    }

}
