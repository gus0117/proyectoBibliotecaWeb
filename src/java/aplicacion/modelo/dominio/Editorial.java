/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;


public class Editorial implements Serializable{
    /**
     * Codigo de la editorial
     */
    private Integer codigo;
    /**
     * Nombre de la editorial
     */
    private String nombre;

    /**
     * Constructor sin parametros
     */
    public Editorial() {
    }

    /**
     * Constructor con parametros (Todos los atributos)
     * @param codigo codigo de editorial
     * @param nombre nombre de la editorial
     */
    public Editorial(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    //Metodos accesores
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
