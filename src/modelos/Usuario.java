package modelos;

import java.io.Serializable;

/**
 * Clase que representa a un Usuario del sistema de parqueadero.
 * Implementa Serializable para permitir persistencia en archivos.
 * 
 * @author Sistema Parqueadero
 * @version 1.0
 */
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String nombreCompleto;
    
    /**
     * Constructor con parámetros
     * @param id Identificación del usuario
     * @param nombreCompleto Nombre completo del usuario
     */
    public Usuario(String id, String nombreCompleto) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
    }
    
    /**
     * Constructor por defecto
     */
    public Usuario() {
        this.id = "";
        this.nombreCompleto = "";
    }
    
    // Getters y Setters
    /**
     * Obtiene la identificación del usuario
     * @return ID del usuario
     */
    public String getId() {
        return id;
    }
    
    /**
     * Establece la identificación del usuario
     * @param id ID a establecer
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Obtiene el nombre completo del usuario
     * @return Nombre completo
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    /**
     * Establece el nombre completo del usuario
     * @param nombreCompleto Nombre a establecer
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    /**
     * Método toString para representación en texto
     * @return Representación del usuario
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                '}';
    }
    
    /**
     * Método equals para comparar usuarios
     * @param o Objeto a comparar
     * @return true si son iguales
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id.equals(usuario.id);
    }
}
