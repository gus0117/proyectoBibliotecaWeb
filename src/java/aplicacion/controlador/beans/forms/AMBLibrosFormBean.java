/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.AutorBean;
import aplicacion.controlador.beans.EditorialBean;
import aplicacion.controlador.beans.LibroBean;
import aplicacion.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Joel
 */
@ManagedBean
@ViewScoped
public class AMBLibrosFormBean implements Serializable{

/**
 * Beans Administrados
 */
@ManagedProperty(value = "#{libroBean}")
private LibroBean libroBean;

@ManagedProperty(value = "#{autorBean}")
private AutorBean autorBean;

@ManagedProperty(value = "#{editorialBean}")
private EditorialBean editorialBean;

/**
 * Libro para capturar los inputs
 */
private Libro unLibro;

/**
 * Lista de libros para mostrar en la tabla
 */
private List<Libro> libros;

/**
 * Lista de tematicas
 */
private List<String> tematicas;
    
/**
 * Constructor por defecto
 */
    public AMBLibrosFormBean() {
       //Se inicializan referencias
       unLibro = new Libro();
       tematicas = new ArrayList();
       //Se agregan tematicas por defecto
       tematicas.add("Drama");
       tematicas.add("Terror");
       tematicas.add("Policial");
       tematicas.add("Programacion");
    }
    
    /**
     * se ejecuta este metodo despues de la instancia
     * del manage bean, por que tiene @postConstruct
     */
    @PostConstruct
    public void init(){
         unLibro = new Libro();
         generarLibros();
    }
    
    /**
     * Inicializacion de lista de libros
     * obtiene los valores posibles de autorBean
     */
    public void generarLibros(){
        libros = libroBean.obtenerLibro();
    }
    
    /**
     * guarda el autor en libro bean
     */
    public void guardarNuevoLibro(){
    libroBean.agregarLibro(unLibro);
    //MENSAJE
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"EXITO","Se Ha Registrado el Libro") );
    //RESETER EL ESATDO PARA LA VENTANA
       unLibro = new Libro();
    //ACTUALIZAR LISTA DE AUTORES
       generarLibros();
    //OCULTAR VENTANA DE AGREGAR
       PrimeFaces.current().executeScript("PF('nuevoLibro').hide()");
    
    }
    
    /**
     * elimina un libro de la lista seleccionandolo
     * @param libroSeleccionado 
     */
    public void eliminarLibroSeleccionado(Libro libroSeleccionado){
        libroBean.eliminarLibro(libroSeleccionado);
        
    //MENSAJE
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"EXITO","Se Ha Eliminado el Libro") );
    //ACTUALIZAR LISTA DE AUTORES
       generarLibros();
    }
    
    /**
     * envento para el RowEdit cuando se confirma
     * la edicion
     * p/ mostrar un mensaje
     * @param event 
     */
        public void onRowEdit(RowEditEvent event) {
        Libro libroModificado = (Libro) event.getObject();
        libroBean.getLibroDao().modificar(libroModificado);
        FacesMessage msg = new FacesMessage("Exito", "Autor Modificado Exitosamente");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
        
        /**
         * evento para el RowEdit cuando se cancela
         * la edicion
         * @param event 
         */
       public void onRowEditCancel(RowEditEvent event) {
    
        FacesMessage msg = new FacesMessage("Edicion Cancelada", "No se ha confirmador los cambios ");
        FacesContext.getCurrentInstance().addMessage(null, msg);
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

    public AutorBean getAutorBean() {
        return autorBean;
    }

    public void setAutorBean(AutorBean autorBean) {
        this.autorBean = autorBean;
    }

    public EditorialBean getEditorialBean() {
        return editorialBean;
    }

    public void setEditorialBean(EditorialBean editorialBean) {
        this.editorialBean = editorialBean;
    }

    public List<String> getTematicas() {
        return tematicas;
    }

    public void setTematicas(List<String> tematicas) {
        this.tematicas = tematicas;
    }
    
    
}
