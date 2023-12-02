
package Clases;

/**
 *
 * @author eefre
 */
public class Genero {
    
    private String nomGenero;
    private String descripcion;

    public Genero(String nomGenero, String descripcion) {
        this.nomGenero = nomGenero;
        this.descripcion = descripcion;
    }

    public String getNomGenero() {
        return nomGenero;
    }

    public void setNomGenero(String nomGenero) {
        this.nomGenero = nomGenero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
