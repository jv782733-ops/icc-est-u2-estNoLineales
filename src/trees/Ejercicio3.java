package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import structures.node.Node;
public class Ejercicio3 {
    public List<List<Node<Integer>>> listLevels(Node<Integer> root) {
        
        List<List<Node<Integer>>> resultado = new ArrayList<>();
        
        
        if (root == null) {
            return resultado;
        }

        
        Queue<Node<Integer>> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {
          
            int nodosEnNivel = cola.size();
            List<Node<Integer>> nivelActual = new ArrayList<>();

           
            for (int i = 0; i < nodosEnNivel; i++) {
                Node<Integer> nodoActual = cola.poll(); 
                nivelActual.add(nodoActual);            

                
                if (nodoActual.getLeft() != null) {
                    cola.add(nodoActual.getLeft());
                }
                
                if (nodoActual.getRight() != null) {
                    cola.add(nodoActual.getRight());
                }
            }

            
            resultado.add(nivelActual);
        }

        return resultado;
    }
}
