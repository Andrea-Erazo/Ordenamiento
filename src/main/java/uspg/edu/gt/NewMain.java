
package uspg.edu.gt;

/**
 *
 * @author Andrea Erazo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arreglo = {6,9,7,4,1,10,3,5,2,8};
        Ordenador o = new Ordenador();
        o.OrdenarBurbuja(arreglo);
        
        for(int i=0;i<arreglo.length;i++)
        {
            System.out.println(arreglo[i]);
        }
        
        
    }
    
}
