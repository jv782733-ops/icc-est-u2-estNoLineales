package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.contacto;

public class Sets {
     public Set<String> construirHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Gggggggggggggggggegegegeg");
        hashSet.add("2Gggggggggggggggggegegegeg");
        hashSet.add("3Gggggggggggggggggegegegeg");
        hashSet.add("4Ggg4gggggggggggggegegegeg");
        hashSet.add("5Gggggggggggggggggegegegeg");
        hashSet.add("5Gggggggggggggggggegegegeg");
        return hashSet;  
     }
     public Set<String> construirLinkedHashSet() {
        Set<String> lSet = new LinkedHashSet<>();
       lSet.add("A");
        lSet.add("B");
        lSet.add("C");
        lSet.add("A");
        lSet.add("D");
        lSet.add("E");
        lSet.add("F");
        lSet.add("1Ggggggeegeg");
        lSet.add("2G2gggggeegeg");
        lSet.add("3Gggggeegeg");
        lSet.add("4Ggggggeegeg");
        lSet.add("5Ggggggeegeg");
        lSet.add("5Ggggggeegeg");
        lSet.add("6Ggggggeegeg");
        lSet.add("G7gggggeegeg");
        return lSet;
    }

        public Set<String> construirTreeSet() {
        Set<String> lSet = new TreeSet<>();
       lSet.add("A");
        lSet.add("B");
        lSet.add("C");
        lSet.add("A");
        lSet.add("D");
        lSet.add("E");
        lSet.add("F");
        lSet.add("1Ggggggeegeg");
        lSet.add("2G2gggggeegeg");
        lSet.add("3Gggggeegeg");
        lSet.add("4Ggggggeegeg");
        lSet.add("5Ggggggeegeg");
        lSet.add("5Ggggggeegeg");
        lSet.add("6Ggggggeegeg");
        lSet.add("G7gggggeegeg");
        return lSet;
    }
    
    public Set<contacto>construirHashSetContacto(){

        Set<contacto>hCSet=new HashSet<>();
        contacto c1 = new contacto("Juan", "Perez", "123456789");
        contacto c2 = new contacto("Pedro", "Lopez", "456789123");
        contacto c3 = new contacto("Ana", "Gomez", "987654321");
        contacto c4= new contacto("Juan", "Perez", "123456789");
        contacto c5 = new contacto("Juan", "Lopez", "123456789");
        return hCSet;

    }
    public Set<contacto> construirTreeSetContacto(){
        Set<contacto> tCSet = new TreeSet<>(
            (c1, c2)->{
                return c1.getNombre().compareTo(c2.getNombre());
            }
        );
        
        tCSet.add(new contacto("Juan", "Perez", "123456789"));
        tCSet.add(new contacto("Pedro", "Lopez", "456789123"));
        tCSet.add(new contacto("Ana", "Gomez", "987654321"));
        tCSet.add(new contacto("Maria", "Rodriguez", "789123456"));
        return tCSet;
    }
}

