package Logica;

import Clases.Artista;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author eefre
 */
public class Utilitario {

    public static ArrayList<Artista> listaArtistas = new ArrayList<>();

    public static void inicializarArtistas() {
        // Agregar instancias de artistas a lstArtistas
        listaArtistas.add(new Artista("Shakira", 1, "Pop, Latin", 1990, "Colombia", "http://shakira.com", 15, 100, 1));
        listaArtistas.add(new Artista("The Beatles", 2, "Rock", 1960, "Reino Unido", "http://thebeatles.com", 12, 200, 1));
        listaArtistas.add(new Artista("Beyoncé", 1, "R&B, Pop", 1997, "Estados Unidos", "http://beyonce.com", 6, 80, 1));
        listaArtistas.add(new Artista("Bob Marley", 1, "Reggae", 1962, "Jamaica", "http://bobmarley.com", 10, 70, 2));
        listaArtistas.add(new Artista("Queen", 2, "Rock", 1970, "Reino Unido", "http://queenonline.com", 15, 150, 1));
    }

    public static LinkedList<String> crearListaArtistas() {
        LinkedList<String> resultado = new LinkedList<>();

        for (Artista elemento : listaArtistas) {
            String artista = elemento.getNombre();
            resultado.add(artista);
            System.out.println("Nombre: " + elemento.getNombre());
        }

        return resultado;
    }

}
