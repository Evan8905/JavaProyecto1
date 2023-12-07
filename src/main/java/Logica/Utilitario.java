package Logica;

import Clases.Album;
import Clases.Artista;
import Clases.Cancion;
import Clases.Genero;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author eefre
 */
public class Utilitario {

    public static ArrayList<Artista> listaArtistas = new ArrayList<>();
    public static ArrayList<Genero> listaGeneros = new ArrayList<>();
    public static ArrayList<Album> listaAlbum = new ArrayList<>();
    public static ArrayList<Cancion> listaCanciones = new ArrayList<>();

    /**
     * Inicializa los datos del sistema. Este método se encarga de realizar la
     * inicialización de todos los datos del sistema.
     *
     * @see #inicializarArtistas()
     */
    public static void inicializarDatosSistema() {
        inicializarArtistas();
        inicializarGeneros();
        inicializarAlbum();
        inicializarCanciones();

    }

    public static void inicializarArtistas() {
        // Agregar instancias de artistas a lstArtistas
        // Crear el objeto Artista y lo agregarlo a la lista de artistas
        listaArtistas.add(new Artista("Ed Sheeran", 1, Arrays.asList("Pop", "Funk"), 0, "Colombia", "www.shakira.com", 10, 20, 1));
        listaArtistas.add(new Artista("Queen", 2, Arrays.asList("Pop", "Funk"), 1964, "Estados Unidos", "www.michaeljackson.com", 10, 30, 2));
        listaArtistas.add(new Artista("Luis Fonsi", 2, Arrays.asList("Pop", "Reggaetón"), 2006, "Reino Unido", "www.adele.com", 5, 15, 1));
        listaArtistas.add(new Artista("Michael Jackson", 1, Arrays.asList("Metal", "Rock"), 1981, "Estados Unidos", "www.metallica.com", 10, 100, 1));
        listaArtistas.add(new Artista("Eagles", 2, Arrays.asList("Clásico"), 1756, "Austria", "www.mozart.com", 41, 626, 2));

    }

    public static void inicializarGeneros() {
        // Agregar instancias de Generos a lstGeneros
        listaGeneros.add(new Genero("Pop", "Melodías pegajosas y estructuras de canciones accesibles."));
        listaGeneros.add(new Genero("Rock", "Género diverso con guitarras eléctricas y estructuras centradas en la canción."));
        listaGeneros.add(new Genero("Reggaetón", "Ritmos latinos, reggae y hip hop con letras pegajosas."));
        listaGeneros.add(new Genero("Hip Hop", "Estilo musical y movimiento cultural con rap y ritmos percusivos."));
        listaGeneros.add(new Genero("Disco", "Género de los años 70 con ritmos bailables y ambiente festivo."));
        listaGeneros.add(new Genero("Funk", "Ritmos pegajosos y líneas de bajo prominentes."));
        listaGeneros.add(new Genero("Metal", "Género con guitarras distorsionadas y voces expresivas."));
        listaGeneros.add(new Genero("Clásico", "Música de períodos históricos, compleja y orquestada."));

    }

    public static void inicializarAlbum() {
        // Agregar instancias de Album a listaAlbum
        listaAlbum.add(new Album(1, "Verano Sin ti", 2, "2020-06-05", Arrays.asList("Pop"), "Sony Music", 10));
        listaAlbum.add(new Album(2, "Greatest Hits", 1, "2010-11-15", Arrays.asList("Pop"), "Sony Music", 20));
        listaAlbum.add(new Album(3, "21", 3, "2011-01-19", Arrays.asList("Pop"), "XL Recordings", 15));
        listaAlbum.add(new Album(4, "Master of Puppets", 4, "1986-03-03", Arrays.asList("Metal"), "Elektra Records", 8));
        listaAlbum.add(new Album(5, "Symphony No. 40", 5, "1788-07-25", Arrays.asList("Clásico"), "Deutsche Grammophon", 12));
    }

    public static void inicializarCanciones() {
        // Ed Sheeran (Pop, Funk)
        listaCanciones.add(new Cancion(1, "Shape of You", 3, 54, "Ed Sheeran", 2017));
        listaCanciones.add(new Cancion(2, "Thinking Out Loud", 4, 41, "Ed Sheeran", 2014));
        listaCanciones.add(new Cancion(3, "Don't", 3, 39, "Ed Sheeran", 2014));

        // Queen (Pop, Funk)
        listaCanciones.add(new Cancion(4, "Bohemian Rhapsody", 5, 55, "Queen", 1975));
        listaCanciones.add(new Cancion(5, "Another One Bites the Dust", 3, 36, "Queen", 1980));
        listaCanciones.add(new Cancion(6, "We Will Rock You", 2, 2, "Queen", 1977));

        // Luis Fonsi (Pop, Reggaetón)
        listaCanciones.add(new Cancion(7, "Despacito", 3, 48, "Luis Fonsi", 2017));
        listaCanciones.add(new Cancion(8, "Échame La Culpa", 2, 54, "Luis Fonsi", 2017));
        listaCanciones.add(new Cancion(9, "Calypso", 3, 20, "Luis Fonsi", 2018));

        // Michael Jackson (Metal, Rock)
        listaCanciones.add(new Cancion(10, "Billie Jean", 4, 54, "Michael Jackson", 1982));
        listaCanciones.add(new Cancion(11, "Thriller", 5, 57, "Michael Jackson", 1982));
        listaCanciones.add(new Cancion(12, "Beat It", 4, 18, "Michael Jackson", 1983));

        // Eagles (Clásico)
        listaCanciones.add(new Cancion(13, "Hotel California", 6, 30, "Eagles", 1976));
        listaCanciones.add(new Cancion(14, "Take It Easy", 3, 29, "Eagles", 1972));
        listaCanciones.add(new Cancion(15, "Desperado", 3, 33, "Eagles", 1973));

    }

    // Manejo de artistas
    public static void editarArtista(ArrayList<Artista> listaArtistas, int indice,
            JTextField txtNombre, JRadioButton rbtnSolista, JRadioButton rbtnBanda,
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

    public static void actualizarArtista(ArrayList<Artista> listaArtistas, int indice,
            JTextField txtNombre, JRadioButton rbtnSolista, JRadioButton rbtnBanda,
            JList<String> lstGeneros, JTextField txtAnoInicial,
            JTextField txtOrigen, JTextField txtWeb,
            JTextField txtCantAlbumes, JTextField txtCantCanciones,
            JRadioButton rbtnActivo, JRadioButton rbtnInactivo,
            JRadioButton rbtnPausa) {

        if (indice >= 0 && indice < listaArtistas.size()) {
            Artista artistaSeleccionado = listaArtistas.get(indice);

            // Actualiza los atributos del artista con los nuevos valores
            artistaSeleccionado.setNombre(txtNombre.getText());

            int tipo = 0;
            if (rbtnSolista.isSelected()) {
                tipo = 1;
            } else if (rbtnBanda.isSelected()) {
                tipo = 2;
            }
            artistaSeleccionado.setTipo(tipo);

            // Actualiza los géneros del artista con los seleccionados en la lista
            List<String> nuevosGeneros = lstGeneros.getSelectedValuesList();
            artistaSeleccionado.setGeneros(nuevosGeneros);

            // Actualiza otros atributos según sea necesario
            artistaSeleccionado.setAno(Integer.parseInt(txtAnoInicial.getText()));
            artistaSeleccionado.setOrigen(txtOrigen.getText());
            artistaSeleccionado.setWeb(txtWeb.getText());
            artistaSeleccionado.setCantAlbumes(Integer.parseInt(txtCantAlbumes.getText()));
            artistaSeleccionado.setCantCanciones(Integer.parseInt(txtCantCanciones.getText()));

            int estadoActual = 0;
            if (rbtnActivo.isSelected()) {
                estadoActual = 1;
            } else if (rbtnInactivo.isSelected()) {
                estadoActual = 2;
            } else if (rbtnPausa.isSelected()) {
                estadoActual = 3;
            }
            artistaSeleccionado.setEstadoActual(estadoActual);

        }
    }

    // recibe lista artistas y el indice seleccionado en la interfaz y lo remueve de la lista
    public static void eliminarArtista(ArrayList<Artista> listaArtistas, int indice) {

        if (indice >= 0 && indice < listaArtistas.size()) {
            Artista artistaSeleccionado = listaArtistas.get(indice);
            listaArtistas.remove(artistaSeleccionado);

        }
    }

    // Manejo de Generos
    public static void editarGenero(ArrayList<Genero> listaGeneros, int indice,
            JTextField txtNombre, JTextArea textArea) {

        if (indice >= 0 && indice < listaGeneros.size()) {
            Genero generoSeleccionado = listaGeneros.get(indice);

            // Actualiza los componentes del formulario con los valores del artista seleccionado
            txtNombre.setText(generoSeleccionado.getNomGenero());
            textArea.setText(generoSeleccionado.getDescripcion());

        }
    }

    public static void actualizarGenero(ArrayList<Genero> listaGeneros, int indice,
            JTextField txtNombre, JTextArea textArea) {

        if (indice >= 0 && indice < listaGeneros.size()) {
            Genero generoSeleccionado = listaGeneros.get(indice);

            // Actualiza los atributos del Genero con los nuevos valores
            generoSeleccionado.setNomGenero(txtNombre.getText());
            generoSeleccionado.setDescripcion(textArea.getText());
        }
    }

    public static void eliminarGenero(ArrayList<Genero> listaGeneros, int indice) {

        if (indice >= 0 && indice < listaGeneros.size()) {
            Genero generoSeleccionado = listaGeneros.get(indice);
            listaGeneros.remove(generoSeleccionado);

        }
    }

    // Manejo de Albumes
    public static void eliminarAlbum(ArrayList<Album> listaAlbumes, int indice) {

        if (indice >= 0 && indice < listaAlbumes.size()) {
            Album albumSeleccionado = listaAlbumes.get(indice);
            listaAlbumes.remove(albumSeleccionado);
        }
    }

    public static void editarAlbum(ArrayList<Album> listaAlbumes, int indice,
            JTextField txtNumeroAlbum, JTextField txtNombreAlbum, JRadioButton rbtnEstudio, JRadioButton rbtnEp,
            JRadioButton rbtnEnVivo, JRadioButton rbtnSencillo, JRadioButton rbtnRecopilatorio, JTextField txtPubDate,
            JList<String> lstGeneros, JTextField txtDiscografia, JTextField txtNumeroCanciones
    ) {

        if (indice >= 0 && indice < listaAlbum.size()) {
            Album albumSeleccionado = listaAlbum.get(indice);

            // Actualiza los componentes del formulario con los valores del artista seleccionado
            txtNumeroAlbum.setText(Integer.toString(albumSeleccionado.getNumero()));
            txtNombreAlbum.setText(albumSeleccionado.getNombre());
            int tipo = albumSeleccionado.getTipo();
            rbtnEstudio.setSelected(tipo == 1);
            rbtnEp.setSelected(tipo == 2);
            rbtnEnVivo.setSelected(tipo == 3);
            rbtnSencillo.setSelected(tipo == 4);
            rbtnRecopilatorio.setSelected(tipo == 5);
            txtPubDate.setText(albumSeleccionado.getPubDate());

            // Actualiza los géneros seleccionados en la lista
            List<String> generosSeleccionados = albumSeleccionado.getGeneros();
            int[] indicesGeneros = new int[generosSeleccionados.size()];
            DefaultListModel<String> modelo = (DefaultListModel<String>) lstGeneros.getModel();

            for (int i = 0; i < generosSeleccionados.size(); i++) {
                String genero = generosSeleccionados.get(i);
                int indiceGenero = modelo.indexOf(genero);
                indicesGeneros[i] = indiceGenero;
            }
            lstGeneros.setSelectedIndices(indicesGeneros);

            txtDiscografia.setText(albumSeleccionado.getDiscografica());
            txtNumeroCanciones.setText(Integer.toString(albumSeleccionado.getCantCanciones()));
        }
    }

    public static void actualizarAlbum(ArrayList<Album> listaAlbumes, int indice,
            JTextField txtNumeroAlbum, JTextField txtNombreAlbum, JRadioButton rbtnEstudio, JRadioButton rbtnEp,
            JRadioButton rbtnEnVivo, JRadioButton rbtnSencillo, JRadioButton rbtnRecopilatorio, JTextField txtPubDate,
            JList<String> lstGeneros, JTextField txtDiscografia, JTextField txtNumeroCanciones
    ) {
        if (indice >= 0 && indice < listaAlbumes.size()) {
            Album albumSeleccionado = listaAlbumes.get(indice);

            // Actualiza los valores del álbum seleccionado con los valores ingresados
            albumSeleccionado.setNumero(Integer.parseInt(txtNumeroAlbum.getText()));
            albumSeleccionado.setNombre(txtNombreAlbum.getText());

            int tipo = 0;
            if (rbtnEstudio.isSelected()) {
                tipo = 1;
            } else if (rbtnEp.isSelected()) {
                tipo = 2;
            } else if (rbtnEnVivo.isSelected()) {
                tipo = 3;
            } else if (rbtnSencillo.isSelected()) {
                tipo = 4;
            } else if (rbtnRecopilatorio.isSelected()) {
                tipo = 5;
            }
            albumSeleccionado.setTipo(tipo);

            albumSeleccionado.setPubDate(txtPubDate.getText());

            // Actualiza el género del álbum seleccionado
            List<String> nuevoGenero = lstGeneros.getSelectedValuesList();
            albumSeleccionado.setGeneros(new ArrayList<>(nuevoGenero));

            albumSeleccionado.setDiscografica(txtDiscografia.getText());
            albumSeleccionado.setCantCanciones(Integer.parseInt(txtNumeroCanciones.getText()));
        }
    }
// Manejo de canciones 

    public static void eliminarCancion(ArrayList<Cancion> listaCancions, int indice) {

        if (indice >= 0 && indice < listaCanciones.size()) {
            Cancion cancionSeleccionado = listaCanciones.get(indice);
            listaCanciones.remove(cancionSeleccionado);
        }
    }

    public static void editarCancion(ArrayList<Cancion> listaCanciones, int indice,
            JTextField txtNumero, JTextField txtTitulo, JTextField txtMinutos,
            JTextField txtSegundos, JTextField txtLetra, JTextField txtGrabacion) {

        if (indice >= 0 && indice < listaCanciones.size()) {
            Cancion cancionSeleccionada = listaCanciones.get(indice);

            // Actualiza los componentes del formulario con los valores del artista seleccionado
            txtNumero.setText(Integer.toString(cancionSeleccionada.getNumero()));
            txtTitulo.setText(cancionSeleccionada.getTitulo());
            txtMinutos.setText(Integer.toString(cancionSeleccionada.getMinutos()));
            txtSegundos.setText(Integer.toString(cancionSeleccionada.getSegundos()));
            txtLetra.setText(cancionSeleccionada.getLetraAutor());
            txtGrabacion.setText(Integer.toString(cancionSeleccionada.getAnoGrabacion()));

//            // Actualiza los géneros seleccionados en la lista
//            List<String> generosSeleccionados = albumSeleccionado.getGeneros();
//            int[] indicesGeneros = new int[generosSeleccionados.size()];
//            DefaultListModel<String> modelo = (DefaultListModel<String>) lstGeneros.getModel();
//
//            for (int i = 0; i < generosSeleccionados.size(); i++) {
//                String genero = generosSeleccionados.get(i);
//                int indiceGenero = modelo.indexOf(genero);
//                indicesGeneros[i] = indiceGenero;
//            }
//            lstGeneros.setSelectedIndices(indicesGeneros);
//
//            txtDiscografia.setText(albumSeleccionado.getDiscografica());
//            txtNumeroCanciones.setText(Integer.toString(albumSeleccionado.getCantCanciones()));
        }
    }

    public static void actualizarCancion() {

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
