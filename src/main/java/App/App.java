package App;

import Logica.Utilitario;
import static Logica.Utilitario.crearListaArtistas;
import static Logica.Utilitario.inicializarArtistas;
import Pantallas.frmPrincipal;
import java.util.LinkedList;

/**
 *
 * @author eefre
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        frmPrincipal formPrincipal = new frmPrincipal();
        formPrincipal.setTitle("Menú Principal");
        formPrincipal.setVisible(true);
         formPrincipal.setLocationRelativeTo(null);
        formPrincipal.setResizable(false);  
        inicializarArtistas();
        LinkedList<String> listaArtistas = crearListaArtistas();
        
    }

}
