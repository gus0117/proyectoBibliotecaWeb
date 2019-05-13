/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Joel
 */
public class Libro implements Serializable{
    /**
     * Codigo de libro
     */
    private int codigo;
    /**
     * ISBN del libro
     */
    private String isbm;
    /**
     * Nombre del libro
     */
    private String nombre;
    /**
     * Cantidad de paginas del libro
     */
    private int paginas;
    /**
     * Autor del libro
     */
    private Autor autor;
    /**
     * Editorial del libro
     */
    private Editorial editorial;
    /**
     * Fecha de edicion del libro
     */
    private Date fechaEdicion;
    /**
     * Tematica del libro
     */
    private String tematica;
    
    //Constructores
    public Libro() {
    }

    /**
     * Constructor con argumentos
     * @param codigo codigo numerico del libro
     * @param isbm codigo ISBN del libro
     * @param nombre Nombre del libro
     * @param paginas Cantidad de paginas
     * @param autor Autor del libro
     * @param editorial Editorial del libro
     * @param fechaEdicion Fecha de edicion
     * @param tematica Tematica del libro
     */
    public Libro(int codigo, String isbm, String nombre, int paginas, Autor autor, Editorial editorial, Date fechaEdicion, String tematica) {
        this.codigo = codigo;
        this.isbm = isbm;
        this.nombre = nombre;
        this.paginas = paginas;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaEdicion = fechaEdicion;
        this.tematica = tematica;
    }

    
 
    //Getter & Setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }  

    public String getIsbm() {
        return isbm;
    }

    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
    
}