package App;

import static Logica.Utilitario.inicializarArtistas;
import static Logica.Utilitario.inicializarDatosSistema;
import Pantallas.frmPrincipal;

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
        //inicializarArtistas();
        //inicializarDatosSistema();

    }

}
