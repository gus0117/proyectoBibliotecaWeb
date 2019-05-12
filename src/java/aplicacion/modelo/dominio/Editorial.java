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
    private int codigo;
    /**
     * Nombre de la editorial
     */
    private String nombre;
    
    private String email;

    /**
     * Constructor sin parametros
     */
    public Editorial() {
    }

    /**
     * Constructor con parametros (Todos los atributos)
     * @param codigo codigo de editorial
     * @param nombre nombre de la editorial
     * @param email email de la editorial
     */
    public Editorial(int codigo, String nombre, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
    }

    //Metodos accesores
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
