/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Libro implements Serializable{
    private int codigo;
    private int isbn;
    private String titulo;
    private int cantPaginas;
    //private String autores;
    private List<Autor> autores;
    private String tematica;
    private Date fechaEdicion;

    public Libro() {
        autores = new ArrayList<Autor>();
    }

    public Libro(int codigo, int isbn, String titulo, int cantPaginas, String tematica, Date fechaEdicion) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.titulo = titulo;
        this.cantPaginas = cantPaginas;
        this.tematica = tematica;
        this.fechaEdicion = fechaEdicion;
        autores = new ArrayList<Autor>();
    }

    public void mostrarLibro(){
        System.out.println("Codigo: "+this.codigo);
//        System.out.println("ISBN: "+this.isbn);
        System.out.println("Titulo: "+this.titulo);
//        System.out.println("Cant Paginas: "+this.cantPaginas);
//        System.out.println("Autores: "+this.autores);
    }
    /**
     * Formatea la fecha de edicion al formato "yyyy-mm-dd"
     * @return devuelve la fecha de edicion en formato string "yyyy-mm-dd"
     */
    public String obtenerFechaFormateada(){
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(this.fechaEdicion.getTime());
    }
    
    /**
     * Convierte la lista de autores en una cadena
     * @return cadena que contiene todos los autores
     */
    public String obtenerAutoresFormateados(){
        String aux = "";
        for(Autor a: autores){
            aux = aux + a.toString()+ "; ";
        }
        return aux.substring(0, aux.length() - 2);
        //return aux;
    }
    
    public void agregarAutor(Autor autor){
        autores.add(new Autor(autor.getId(), autor.getNombre(), autor.getApellido()));
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
    public List<Autor> getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(List<Autor> autores) {
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
    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    /**
     * @param fechaEdicion the fechaEdicion to set
     */
    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", isbn=" + isbn + ", titulo=" + titulo + ", cantPaginas=" + cantPaginas + ", autores=" + autores + ", tematica=" + tematica + ", fechaEdicion=" + fechaEdicion + '}';
    }
    
    
    
}
