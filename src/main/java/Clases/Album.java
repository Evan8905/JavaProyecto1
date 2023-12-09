package Clases;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private int numero;
    private String nombre;
    private int tipo;
    private String pubDate;
    private List<String> generos;
    private String discografica;
    private int cantCanciones;
    private List<Cancion> canciones;
    private Artista artista; // Nuevo atributo
    private final int numeroArtista;

//    public Album(int numero, String nombre, int tipo, String pubDate, List<String> generos, String discografica, int cantCanciones) {
//        this.numero = numero;
//        this.nombre = nombre;
//        this.tipo = tipo;
//        this.pubDate = pubDate;
//        this.generos = generos;
//        this.discografica = discografica;
//        this.cantCanciones = cantCanciones;
//        this.canciones = canciones;
//        this.artista = artista;
//    }
    public Album(int numero, String nombre, int tipo, String pubDate, List<String> generos, String discografica, int cantCanciones, int numeroArtista) {
        this.numero = numero;
        this.nombre = nombre;
        this.tipo = tipo;
        this.pubDate = pubDate;
        this.generos = generos;
        this.discografica = discografica;
        this.cantCanciones = cantCanciones;
        this.numeroArtista = numeroArtista; // Nuevo atributo para almacenar el número del artista


    }

    public int getNumeroArtista() {
        return numeroArtista;
    }

    
    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public int getCantCanciones() {
        return cantCanciones;
    }

    public void setCantCanciones(int cantCanciones) {
        this.cantCanciones = cantCanciones;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }
}
