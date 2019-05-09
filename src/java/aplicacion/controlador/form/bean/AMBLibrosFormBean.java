/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.form.bean;

import aplicacion.modelo.dominio.Libro;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Joel
 */
@ManagedBean
@ViewScoped
public class AMBLibrosFormBean {
@ManagedProperty(value = "#{libroBean}")

private LibroBean libroBean;
private Libro unLibro;
private List<Libro> libros;
    
    /**
     * Creates a new instance of AMBLibrosFormBean
     */
    public AMBLibrosFormBean() {
        unLibro = new Libro();
    }
    
    public void init(){
        
         unLibro = new Libro();
    }
    
    public void geberarLibro(){
        libros = libroBean.obtenerLibro();
    }
    
    //Getter & Setter

    public LibroBean getLibroBean() {
        return libroBean;
    }

    public void setLibroBean(LibroBean libroBean) {
        this.libroBean = libroBean;
    }

    public Libro getUnLibro() {
        return unLibro;
    }

    public void setUnLibro(Libro unLibro) {
        this.unLibro = unLibro;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }   
}
