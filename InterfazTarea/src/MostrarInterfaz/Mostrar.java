
package MostrarInterfaz;

import Clases.ClaseA;
import Clases.ClaseB;
import Clases.ClaseD;

/**
 *
 * @author Isaac Hernandez
 */
public class Mostrar {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ClaseA a = new ClaseA(5,2);
        System.out.println("La suma de la claseA es:"+a.Suma());
        ClaseB b = new ClaseB(1,3,5);
        System.out.println("La suma de la claseB es:"+b.Suma());
        ClaseD d = new ClaseD(4,4);
        System.out.println("La suma doble de la claseD:"+d.SumaDoble());
        
        System.out.println("La multiplicacion es:"+a.Multiplica(0));
        
        System.out.println("El valor mayor es:"+a.Mayor());
        
      
    }
    
}
