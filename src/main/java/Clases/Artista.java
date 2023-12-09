package Clases;

import java.util.ArrayList;
import java.util.List;

public class Artista {

    private int numero;  // Agregamos esta variable para almacenar el número asociado al artista
    private String nombre;
    private int tipo; // 1 = Solista; 2 = Banda.
    private List<String> generos;
    private int ano;
    private String origen;
    private String web;
    private int cantAlbumes;
    private int cantCanciones;
    private int estadoActual;
    private List<Album> albumes;

    public Artista(int numero, String nombre, int tipo, List<String> generos, int ano, String origen, String web, int cantAlbumes, int cantCanciones, int estadoActual) {
        this.numero = numero;
        this.nombre = nombre;
        this.tipo = tipo;
        this.generos = generos;
        this.ano = ano;
        this.origen = origen;
        this.web = web;
        this.cantAlbumes = cantAlbumes;
        this.cantCanciones = cantCanciones;
        this.estadoActual = estadoActual;
        // Inicializa la lista de álbumes como una nueva ArrayList
        this.albumes = new ArrayList<>();
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

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public int getCantAlbumes() {
        return cantAlbumes;
    }

    public void setCantAlbumes(int cantAlbumes) {
        this.cantAlbumes = cantAlbumes;
    }

    public int getCantCanciones() {
        return cantCanciones;
    }

    public void setCantCanciones(int cantCanciones) {
        this.cantCanciones = cantCanciones;
    }

    public int getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(int estadoActual) {
        this.estadoActual = estadoActual;
    }

    public List<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(List<Album> albumes) {
        this.albumes = albumes;
    }

}
