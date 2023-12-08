package Clases;

/**
 *
 * @author eefre
 */
public class Cancion {

    private int numero;
    private String titulo;
    private int minutos;
    private int segundos;
    private String letraAutor;
    private int anoGrabacion;

    public Cancion(int numero, String titulo, int minutos, int segundos, String letraAutor, int anoGrabacion) {
        this.numero = numero;
        this.titulo = titulo;
        this.minutos = minutos;
        this.segundos = segundos;
        this.letraAutor = letraAutor;
        this.anoGrabacion = anoGrabacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String getLetraAutor() {
        return letraAutor;
    }

    public void setLetraAutor(String letraAutor) {
        this.letraAutor = letraAutor;
    }

    public int getAnoGrabacion() {
        return anoGrabacion;
    }

    public void setAnoGrabacion(int anoGrabacion) {
        this.anoGrabacion = anoGrabacion;
    }

}
