
package Clases;

/**
 *
 * @author eefre
 */
public class Artista {
    private String nombre;
    private int tipo; // 1 = Solista; 2 = Banda.
    private String generos; // Puede ser 1 o varios
    private int ano; //formación Año en que el artista inició su carrera musical.
    private String origen; //Nacionalidad del artista
    private String web;
    private int cantAlbunes;
    private int cantCanciones;
    private int estadoActual;  //1 = Activo; 2 = Inactivo; 3 = Pausa.

    public Artista(String nombre, int tipo, String generos, int ano, String origen, String web, int cantAlbunes, int cantCanciones, int estadoActual) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.generos = generos;
        this.ano = ano;
        this.origen = origen;
        this.web = web;
        this.cantAlbunes = cantAlbunes;
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

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
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

    public int getCantAlbunes() {
        return cantAlbunes;
    }

    public void setCantAlbunes(int cantAlbunes) {
        this.cantAlbunes = cantAlbunes;
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
