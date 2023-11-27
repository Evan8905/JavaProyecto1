
package Utilitario;

import Clases.Artista;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author eefre
 */
public class Utilitario {
    public static ArrayList<Artista> lstArtistas = new ArrayList<Artista>();
    
        public static LinkedList <String> crearListaArtistas(){
        LinkedList <String> resultado = new LinkedList<>();
        
        for (Artista elemento : lstArtistas){
        
            resultado.add(elemento.getNombre());
        }
    
        return resultado;
    }

    
}
