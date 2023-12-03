package Clases;

import Logica.Utilitario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eefre
 */
public class Artista {

    private String nombre;
    private int tipo; // 1 = Solista; 2 = Banda. // se tuvo que hacer asi y no con true or false porque generaba problemas a la hora de editar
    private List<String> generos; // Puede ser 1 o varios
    private int ano; // Año en que el artista inició su carrera musical.
    private String origen; // Nacionalidad del artista
    private String web;
    private int cantAlbumes;
    private int cantCanciones;
    private int estadoActual;  // 1 = Activo; 2 = Inactivo; 3 = Pausa.

    public Artista(String nombre, int tipo, List<String> generos, int ano, String origen, String web, int cantAlbumes, int cantCanciones, int estadoActual) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.generos = generos;
        this.ano = ano;
        this.origen = origen;
        this.web = web;
        this.cantAlbumes = cantAlbumes;
        this.cantCanciones = cantCanciones;
        this.estadoActual = estadoActual;
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



}
