import java.util.LinkedList;
import java.util.List;

import models.Persona;
import structures.node.Node;
import trees.BinaryTree;
import trees.Ejercicio1;
import trees.Ejercicio2;
import trees.Ejercicio3;
import trees.Ejercicio4;
import trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
       runIntTree();
       runBinaryTree();
       runEjercicios();
       runEjercicio2();
       runEjercicio3();
       runEjercicio4();
    }

    private static void runEjercicios() {
        Ejercicio1  ejercicio1 = new Ejercicio1();
        int[] numeros = new int[]{5, 3, 7, 2, 4, 6, 8};
       

        System.out.println("Ejercicio1:");
        ejercicio1.insert(numeros);

    }
   private static void runEjercicio2() {
    System.out.println("Ejercicio 2");

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
private static void runEjercicio3() {
    System.out.println("\nEjercicio 3");
    
    int[] numeros = {4, 2, 7, 1, 3, 6, 9};
    IntTree tree = new IntTree();
    for (int numero : numeros) {
        tree.add(numero);
    }

    Node<Integer> root = tree.getRoot();
    
    Ejercicio3 ejecutor = new Ejercicio3();
    List<List<Node<Integer>>> niveles = ejecutor.listLevels(root);

    for (List<Node<Integer>> nivel : niveles) {
        for (int i = 0; i < nivel.size(); i++) {
            System.out.print(nivel.get(i).getValue());
            if (i < nivel.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println(); 
    }
}
private static void runEjercicio4() {
    System.out.println("\n Ejercicio 4");

   
    Node<Integer> nodo4 = new Node<>(4);
    Node<Integer> nodo2 = new Node<>(2);
    Node<Integer> nodo7 = new Node<>(7);
    Node<Integer> nodo1 = new Node<>(1);
    Node<Integer> nodo3 = new Node<>(3);
    Node<Integer> nodo8 = new Node<>(8);

    
    nodo4.setLeft(nodo2);
    nodo4.setRight(nodo7);

    nodo2.setLeft(nodo1);
    nodo2.setRight(nodo3);

    nodo1.setLeft(nodo8); 

    Ejercicio4 ejecutor = new Ejercicio4();
    int profundidadMaxima = ejecutor.maxDepth(nodo4);

    System.out.println("Output: " + profundidadMaxima);
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
