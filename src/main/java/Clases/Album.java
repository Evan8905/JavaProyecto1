package Clases;

import java.util.List;

public class Album {
    
    private int numero;
    private String album;
    private int tipo;
    private String pubDate;
    private List<String> generos;
    private String discografica;
    private int cantCanciones;
    

    public Album(int numero, String nombre, int tipo, String pubDate, List<String> generos, String discografica, int cantCanciones) {
        this.numero = numero;
        this.album = album;
        this.tipo = tipo;
        this.pubDate = pubDate;
        this.generos = generos;
        this.discografica = discografica;
        this.cantCanciones = cantCanciones;
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAlbum() {
        return album;
    }

    public void setNombre(String album) {
        this.album = album;
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
    
    
 
    
}
