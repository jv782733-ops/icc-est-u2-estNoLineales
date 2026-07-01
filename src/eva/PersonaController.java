package eva;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PersonaController {
   public Set<Persona> filtrarYOrdenar(List<Persona> personas, int edadUmbral) {
        
        Set<Persona> resultado = new TreeSet<>((p1, p2) -> {
            
           
            if (p1.getEdad() == p2.getEdad() && p1.getNombre().equalsIgnoreCase(p2.getNombre())) {
                return 0;
            }

            
            if (p1.getEdad() != p2.getEdad()) {
                return Integer.compare(p2.getEdad(), p1.getEdad()); 
            }

          
            return p1.getNombre().compareToIgnoreCase(p2.getNombre());
        });

        
        for (Persona p : personas) {
            if (p.getEdad() >= edadUmbral) {
                resultado.add(p);
            }
        }

        return resultado; 
    }
}


