import java.util.LinkedList;

import models.Persona;
import structures.node.Node;
import trees.BinaryTree;
import trees.Ejercicio1;
import trees.Ejercicio2;
import trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
       runIntTree();
       runBinaryTree();
       runEjercicios();

       System.out.println("Ejercicio 2");
       runEjercicio2();
    }

    private static void runEjercicios() {
        Ejercicio1  ejercicio1 = new Ejercicio1();
        int[] numeros = new int[]{5, 3, 7, 2, 4, 6, 8};
        //ejercicio1.insert(numeros);

        System.out.println("Ejercicio1:");
        ejercicio1.insert(numeros);

    }
   private static void runEjercicio2() {

    int[] numeros = {5, 3, 7, 2, 4, 6, 8};
    IntTree tree = new IntTree();

    for (int numero : numeros) {
        tree.add(numero);
    }

    Node<Integer> root = tree.getRoot();

    Ejercicio2 ejercicio2 = new Ejercicio2();
    ejercicio2.invertTree(root);
    System.out.println("Arbol invertido");
    ejercicio2.imprimirArbolInvertido(root);

}

    private static void runBinaryTree() {
        BinaryTree<String> arbolString = new BinaryTree<>();
        BinaryTree<Persona> arbolPersonas = new BinaryTree<>();
        arbolPersonas.add(new Persona("Pablo", 30));
        arbolPersonas.add(new Persona("Ana", 25));
        arbolPersonas.add(new Persona("Luis", 35));
        arbolPersonas.add(new Persona("Maria", 28));
        System.out.println("Personas");
        arbolPersonas.inOrden();
        

        
    }

    private static void runIntTree() {
        IntTree arbolNumero = new IntTree();
        arbolNumero.add(50);
        arbolNumero.add(10);
        arbolNumero.add(30);
        arbolNumero.add(60);
        arbolNumero.add(75);
        arbolNumero.add(55);
        System.out.println("preorder");
        arbolNumero.preOrden();

        System.out.println("Posorder");
        arbolNumero.postOrden();

        System.out.println("Inorder");
        arbolNumero.inOrden();

        System.out.println("Altura: " + arbolNumero.getHeight());
    

        System.out.println("Peso: "+ arbolNumero.pesoTree());
        

        //arbolNumero.



        //arbolNumero.setRoot(50);

        //LinkedList<Integer>numeros= new LinkedList<>();
        
       // Node<Integer> node1= new Node<>(50);
        //Node<Integer> node2= new Node<>(10);
        //Node<Integer> node3= new Node<>(30);


        //arbolNumero.setRoot(node1);
        //node1.setRight(node2);
        //node2.setLeft(node3);

        //System.out.println(arbolNumero.getRoot());
        //System.out.println(arbolNumero.getRoot().getLeft().getRight());


    }
}
