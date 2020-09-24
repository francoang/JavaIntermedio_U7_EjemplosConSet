
package proyecto_ejemplosconset;

/**
 * Unidad 07. Ejemplos
 * Ejemplos utilizando la interfaz Set
 * @author Angonoa Franco
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfazSet is = new InterfazSet();
        
        System.out.println("===EJEMPLO CON HASHSET===");
        is.ejemploConHashSet();
        
        System.out.println("\n===EJEMPLO CON TREESET===");
        is.ejemploConTreeSet();
    }
    
}
