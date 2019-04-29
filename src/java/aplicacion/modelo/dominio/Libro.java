/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.util.Calendar;

public class Libro {
    private int codigo;
    private int isbn;
    private String titulo;
    private int cantPaginas;
    private String autores;
    private String tematica;
    private Calendar fechaEdicion;

    public Libro() {
    }

    public Libro(int codigo, int isbn, String titulo, int cantPaginas, String autores, String tematica, Calendar fechaEdicion) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.titulo = titulo;
        this.cantPaginas = cantPaginas;
        this.autores = autores;
        this.tematica = tematica;
        this.fechaEdicion = fechaEdicion;
    }

    

    public void mostrarLibro(){
        System.out.println("Codigo: "+this.codigo);
//        System.out.println("ISBN: "+this.isbn);
        System.out.println("Titulo: "+this.titulo);
//        System.out.println("Cant Paginas: "+this.cantPaginas);
//        System.out.println("Autores: "+this.autores);
    }
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the cantPaginas
     */
    public int getCantPaginas() {
        return cantPaginas;
    }

    /**
     * @param cantPaginas the cantPaginas to set
     */
    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    /**
     * @return the autores
     */
    public String getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(String autores) {
        this.autores = autores;
    }

    /**
     * @return the tematica
     */
    public String getTematica() {
        return tematica;
    }

    /**
     * @param tematica the tematica to set
     */
    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    /**
     * @return the fechaEdicion
     */
    public Calendar getFechaEdicion() {
        return fechaEdicion;
    }

    /**
     * @param fechaEdicion the fechaEdicion to set
     */
    public void setFechaEdicion(Calendar fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", isbn=" + isbn + ", titulo=" + titulo + ", cantPaginas=" + cantPaginas + ", autores=" + autores + ", tematica=" + tematica + ", fechaEdicion=" + fechaEdicion + '}';
    }
    
    
    
}
