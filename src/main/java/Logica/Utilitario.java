package Logica;

import Clases.Artista;
import Clases.Genero;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author eefre
 */
public class Utilitario {

    public static ArrayList<Artista> listaArtistas = new ArrayList<>();
    public static ArrayList<Genero> listaGeneros = new ArrayList<>();

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

    public static void inicializarArtistas() {
        // Agregar instancias de artistas a lstArtistas
        // Crear el objeto Artista y lo agregarlo a la lista de artistas
        listaArtistas.add(new Artista("Shakira", 1, Arrays.asList("Pop", "Clásico"), 0, "Colombia", "www.shakira.com", 10, 20, 1));
        listaArtistas.add(new Artista("Michael Jackson", 2, Arrays.asList("Pop", "R&B"), 1964, "Estados Unidos", "www.michaeljackson.com", 10, 30, 2));
        listaArtistas.add(new Artista("Adele", 2, Arrays.asList("Pop", "Soul"), 2006, "Reino Unido", "www.adele.com", 5, 15, 1));
        listaArtistas.add(new Artista("Metallica", 1, Arrays.asList("Metal", "Rock"), 1981, "Estados Unidos", "www.metallica.com", 10, 100, 1));
        listaArtistas.add(new Artista("Mozart", 2, Arrays.asList("Clásico"), 1756, "Austria", "www.mozart.com", 41, 626, 2));

    }

    public static void inicializarGeneros() {
        // Agregar instancias de Generos a lstGeneros
        listaGeneros.add(new Genero("Rock", "Este es un género popular de los años ..."));
        listaGeneros.add(new Genero("Pop", "El género pop es conocido por su ..."));
        listaGeneros.add(new Genero("Jazz", "El jazz es un género musical que ..."));
        listaGeneros.add(new Genero("Hip Hop", "El hip hop es un estilo musical que ..."));
        listaGeneros.add(new Genero("Clásico", "La música clásica es conocida por su ..."));
    }

public static void editarArtista(ArrayList<Artista> listaArtistas, int indice,
        JTextField txtNombre, JRadioButton rbtnSolista,JRadioButton rbtnBanda,
        JList<String> lstGeneros, JTextField txtAnoInicial,
        JTextField txtOrigen, JTextField txtWeb,
        JTextField txtCantAlbumes, JTextField txtCantCanciones,
        JRadioButton rbtnActivo, JRadioButton rbtnInactivo,
        JRadioButton rbtnPausa) {

    if (indice >= 0 && indice < listaArtistas.size()) {
        Artista artistaSeleccionado = listaArtistas.get(indice);

        // Actualiza los componentes del formulario con los valores del artista seleccionado
        txtNombre.setText(artistaSeleccionado.getNombre());
        int tipo = artistaSeleccionado.getTipo();
        rbtnSolista.setSelected(tipo == 1);
 
        rbtnBanda.setSelected(tipo == 2);
    
   
        // Actualiza los géneros seleccionados en la lista
        List<String> generosSeleccionados = artistaSeleccionado.getGeneros();
        int[] indicesGeneros = new int[generosSeleccionados.size()];
        DefaultListModel<String> modelo = (DefaultListModel<String>) lstGeneros.getModel();

        for (int i = 0; i < generosSeleccionados.size(); i++) {
            String genero = generosSeleccionados.get(i);
            int indiceGenero = modelo.indexOf(genero);
            indicesGeneros[i] = indiceGenero;
        }

        lstGeneros.setSelectedIndices(indicesGeneros);

        // Actualiza otros componentes según sea necesario
        txtAnoInicial.setText(Integer.toString(artistaSeleccionado.getAno()));
        txtOrigen.setText(artistaSeleccionado.getOrigen());
        txtWeb.setText(artistaSeleccionado.getWeb());
        txtCantAlbumes.setText(Integer.toString(artistaSeleccionado.getCantAlbumes()));
        txtCantCanciones.setText(Integer.toString(artistaSeleccionado.getCantCanciones()));

        int estadoActual = artistaSeleccionado.getEstadoActual();
        rbtnActivo.setSelected(estadoActual == 1);
        rbtnInactivo.setSelected(estadoActual == 2);
        rbtnPausa.setSelected(estadoActual == 3);
    }
}


    // recibe lista artistas y el indice seleccionado en la interfaz y lo remueve de la lista
    public static void eliminarArtista(ArrayList<Artista> listaArtistas, int indice) {

        if (indice >= 0 && indice < listaArtistas.size()) {
            Artista artistaSeleccionado = listaArtistas.get(indice);
            listaArtistas.remove(artistaSeleccionado);

        }
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
}
