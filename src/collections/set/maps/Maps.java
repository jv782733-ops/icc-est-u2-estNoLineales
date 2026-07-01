package collections.set.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.contacto;

public class Maps {
    public Map<String, Integer>construirHashMap(){
        Map<String, Integer>mapa= new HashMap<>();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A",50);
        System.out.println(mapa.size());
        System.out.println(mapa);

        // ==aRREGLO
        for(int i =0 ; i<mapa.size(); i++){
            System.out.println(mapa.values().toArray()[i]);
           // mapa.values().toArray();
        }
        //llAVES
        for(String key: mapa.keySet()){
            System.out.println(key);
        }

        System.out.println(mapa.get("A"));
        System.out.println(mapa.get("B"));
        System.out.println(mapa.get("F"));

        mapa.putIfAbsent("F", 100);
        mapa.putIfAbsent("A", 200);
        System.out.println(mapa);
        return mapa;


    }

   public Map<String, Integer>clinkdHashMap(){
    Map<String, Integer>mapa= new LinkedHashMap<>();
    mapa.put("A", 10);
    mapa.put("B", 20);
    mapa.put("C", 30);
    mapa.put("A",50);
    System.out.println(mapa);
    return mapa;
   }

   public Map<String, Integer> cTreeMap(){
    Map<String, Integer>mapa= new TreeMap<>();
    mapa.put("J", 10);
    mapa.put("B", 20);
    mapa.put("C", 30);
    mapa.put("A",50);
    System.out.println(mapa);
    return mapa;
    
   }


   public Set<contacto> filtrarOrdenarUnicos(List<contacto> contactos) {

        Set<contacto> nueva = new TreeSet<>(
            (c1, c2) -> {
                if (c1.getNombre().equals(c2.getNombre())) {
                    return 0;
                }
                return c1.getApellido().compareTo(c2.getApellido());
            });

        for (contacto contacto : contactos) {
            nueva.add(contacto);
        }
        return nueva;
    }
}
