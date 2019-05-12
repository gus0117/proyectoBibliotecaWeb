/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.AutorBean;
import aplicacion.modelo.dominio.Autor;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Rocio
 */
@ManagedBean
@ViewScoped
public class ABMAutorFormBean implements Serializable{

    /**
     * Bean administrado
     */
    @ManagedProperty(value="#{autorBean}")
    private AutorBean autorBean;
    
    /**
     * Variable para guardar los inputs
     */
    private Autor autor;
    
    /**
     * Constructor
     */
    public ABMAutorFormBean() {
        //Se inicializan Referencias
        autor = new Autor();
    }
    
    /**
     * Agrega un autor a la lista
     */
    public void agregarAutor(){
        autorBean.agregarAutor(autor);
        //iniciarAutor();
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage("", new FacesMessage("Exito","Se agrego autor"));
    }
    
    /**
     * Elimina un autor de la lista
     * @param autor autor a eliminar
     */
    public void borrarAutor(Autor autor){
        autorBean.eliminarAutor(autor);
        
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage("", new FacesMessage("Exito","Se borro autor"));
    }
    
    /**
     * Inicializa el autor
     */
    public void iniciarAutor(){
        this.autor = new Autor();
    }
    
    /**
     * Obtiene una lista de autores del data source
     * @return retorna una lista de autores
     */
    public List<Autor> obtenerAutores(){
        return autorBean.obtenerAutores();
    }

    /**
     * Metodo para edicion de autor
     * @param event 
     */
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Autor Editado");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    /**
     * Metodo para cancelar edicion de autor
     * @param event 
     */
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edicion Cancelada");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    //GETTERS Y SETTERS
    public AutorBean getAutorBean() {
        return autorBean;
    }

    public void setAutorBean(AutorBean autorBean) {
        this.autorBean = autorBean;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    
}
