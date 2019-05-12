/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author tom-4
 */
public class Autor implements Serializable{
    
    /**
     * Id del autor
     */
    private int id;
    /**
     * Nombre del autor
     */
    private String nombre;
    /**
     * Apellido del autor
     */
    private String apellido;
    
    /**
     * Fecha de nacimiento del autor
     */
    private Date fechaNac;

    /**
     * Constructor por defecto
     */
    public Autor() {
        //Se inicializan referencias
        fechaNac = Calendar.getInstance().getTime();
    }

    /**
     * Constructor con argumentos
     * @param id id del autor
     * @param nombre nombre del autor
     * @param apellido apellido del autor
     * @param fechaNac fecha de nacimiento del autor
     */
    public Autor(int id, String nombre, String apellido, Date fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        
    }

    //METODOS ACCESORES
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    //METODOS PARA CONVERTIR
    /**
     * Convierte un objeto Autor en String
     * @return Devuelve un Autor en formato String
     */
    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + '}';
    }

    /**
     * Genera un codigo de objeto
     * @return Devuelve el codigo del objeto generado
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
        return hash;
    }

    /**
     * Compara un objeto con este Autor
     * @param obj objeto a comparar
     * @return devuelve true si son iguales y false si no lo son
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
    
}
