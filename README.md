# Estructuras no lineales 
### Nombre
 - Jose Luis Vega Pesantez

 ## Descripcion general:
 - Esta es una práctica de estructura de datos que esta enfocada en el uso y recorrido de Árboles Binarios en Java. El objetivo fue aprender la lógica detrás de estas estructuras mediante punteros y recursividada.

 ## Explicacion ejercicio 1
 - Este ejercicio recibe un arreglo de números desordenados y los mete dentro de un Árbol Binario. Para lograrlo, recorro el arreglo con un bucle for y voy insertando cada número uno por uno usando el método .add(). Si el número es menor va a la izquierda y si es mayor va a la derecha. Al final, uso un método recursivo auxiliar para imprimir el árbol de manera horizontal.

  ## Explicacion ejercicio 2
  - El objetivo de este ejercico es voltear lo q hicimos en el ejercicio 1. Usaremos el método que usa recursión. Primero validando un caso base: si el nodo actual es nulo, se detiene. Si tiene datos, uso una variable temporal para guardar el nodo izquierdo, luego muevo lo de la derecha a la izquierda, y lo que guardé en la variable temporal y lo pongo en la derecha. Una vez hecho este intercambio en el nodo actual, el método se vuelve a llamar a sí mismo para hacer lo mismo con los hijos izquierda y derecha hasta voltear todo el árbol.

  ## Explicacion ejercicio 3
- Este algoritmo agrupa los nodos del árbol dependiendo del nivel en la que se encuentren. Utilicé un recorrido en anchura apoyándome en una estructura de Cola. El método mide cuántos elementos hay en la cola al inicio de cada nivel; y con el tamaño, procesa exactamente esos nodos mediante un ciclo, los guarda en una lista  para ese nivel, y pone a sus respectivos hijos en la cola para que sean procesados en el siguiente paso. Al final, devuelve una lista que contiene las sublistas de cada nivel.

## Explicacion ejercicio 4
- Este método calcula la longitud del camino más largo desde la raíz hasta la hoja q esta mas lejos. Y si el nodo que está comparando es nulo, devuelve 0. Si no es nulo, calcula por separado la profundidad que esta a la izquierdo y la de su lado derecho. Al final, usando Math.max(), compara ambos resultados, elige el camino que sea más largo y le suma 1 para obtener la altura total real.