package proyecto_ejemplosconset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author fnang
 */
public class InterfazSet {
    public void ejemploConHashSet(){
        Set<String> unHashSet = new HashSet<>();

        unHashSet.add("Elemento C");
        unHashSet.add("Elemento A");
        unHashSet.add("Elemento B");
        unHashSet.add("Elemento B"); //No será agregado

        for (String elementos : unHashSet) {
            System.out.println("Elemento: " + elementos);
        }
    }
    
    public void ejemploConTreeSet(){
        Set<Integer> unTreeSet = new TreeSet<>();

        unTreeSet.add(50);
        unTreeSet.add(23);
        unTreeSet.add(1);
        unTreeSet.add(15);
        unTreeSet.add(15); //No será agregado

        for (Integer elementos : unTreeSet) {
            System.out.println("Elemento: " + elementos);
        }
    }
}
