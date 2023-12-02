package Logica;

import Clases.Artista;
import Clases.Genero;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author eefre
 */
public class Utilitario {

    public static ArrayList<Artista> listaArtistas = new ArrayList<>();
    public static ArrayList<Genero> listaGeneros = new ArrayList<>();

    public static void inicializarArtistas() {
        // Agregar instancias de artistas a lstArtistas
        // Crear el objeto Artista para Shakira y agregarlo a la lista de artistas
          listaArtistas.add(new Artista("Shakira", true, Arrays.asList("Pop", "Clásico"), 0, "US", "www.shakira.com", 10, 20, 1));
//        listaArtistas.add(new Artista("Shakira", true, generos, anoInicio, "Pop", web, cantAlbumes, cantCanciones, estadoActual));
//        listaArtistas.add(new Artista("The Beatles", true, generos, anoInicio, "Pop", web, cantAlbumes, cantCanciones, estadoActual));
//        listaArtistas.add(new Artista("Beyoncé", true, generos, anoInicio, "Pop", web, cantAlbumes, cantCanciones, estadoActual));
//        listaArtistas.add(new Artista("Bob Marley", true, generos, anoInicio, "Pop", web, cantAlbumes, cantCanciones, estadoActual));
//        listaArtistas.add(new Artista("Queen", true, generos, anoInicio, "Pop", web, cantAlbumes, cantCanciones, estadoActual));
    }

    public static void inicializarGeneros() {
        // Agregar instancias de Generos a lstGeneros
        listaGeneros.add(new Genero("Rock", "Este es un género popular de los años ..."));
        listaGeneros.add(new Genero("Pop", "El género pop es conocido por su ..."));
        listaGeneros.add(new Genero("Jazz", "El jazz es un género musical que ..."));
        listaGeneros.add(new Genero("Hip Hop", "El hip hop es un estilo musical que ..."));
        listaGeneros.add(new Genero("Clásico", "La música clásica es conocida por su ..."));
    }

//    public static LinkedList<String> crearListaArtistas() {
//        LinkedList<String> resultado = new LinkedList<>();
//
//        for (Artista elemento : listaArtistas) {
//            String artista = elemento.getNombre();
//            resultado.add(artista);
//            System.out.println("Nombre: " + elemento.getNombre());
//        }
//
//        return resultado;
//    }
//
//    public static LinkedList<String> crearListaGeneros() {
//        LinkedList<String> resultado = new LinkedList<>();
//
//        for (Genero elemento : listaGeneros) {
//            String genero = elemento.getNomGenero();
//            resultado.add(genero);
//            System.out.println("Nombre: " + elemento.getNomGenero());
//        }
//
//        return resultado;
//    }
    /**
     * Inicializa los datos del sistema. Este método se encarga de realizar la
     * inicialización de todos los datos del sistema.
     *
     * @see #inicializarArtistas()
     */
    public static void inicializarDatosSistema() {
        inicializarArtistas();
        inicializarGeneros();


    }

}
