package Logica;

import Clases.Album;
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
    public static ArrayList<Album> listaAlbum = new ArrayList<>();
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
    
                public static void inicializarAlbum() {
              // Agregar instancias de Album a listaAlbum
              listaAlbum.add(new Album("El Dorado", "Descripción de El Dorado"));
              listaAlbum.add(new Album("Álbum2", "Descripción del Álbum2"));
              listaAlbum.add(new Album("Álbum3", "Descripción del Álbum3"));
              listaAlbum.add(new Album("Álbum4", "Descripción del Álbum4"));
              listaAlbum.add(new Album("Álbum5", "Descripción del Álbum5"));
          }


    
    
    

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
