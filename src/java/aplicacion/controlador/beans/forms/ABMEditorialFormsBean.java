/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.EditorialBean;
import aplicacion.modelo.dominio.Editorial;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Rocio
 */
@ManagedBean
@RequestScoped
public class ABMEditorialFormsBean implements Serializable{

    /**
     * Bean Administrado
     */
    @ManagedProperty(value="#{editorialBean}")
    private EditorialBean editorialBean;
    /**
     * Variable para capturar los inputs del formulario
     */
    private Editorial editorial;
    
    /**
     * Constructor por defecto
     */
    public ABMEditorialFormsBean() {
        //Se inicializan las referencias
        editorial = new Editorial();
    }
    
    /**
     * Agrega una nueva editorial
     */
    public void agregarEditorial(){
        editorialBean.agregaEditorial(editorial);
        mostrarMensajeGrowl("Guardado","Se ha GUARDADO la editorial");
    }
    
    /**
     * Elimina una editorial de la lista.
     * @param e Editorial a eliminar
     */
    public void borrarEditorial(Editorial e){
        editorialBean.borrarEditorial(e);
        mostrarMensajeGrowl("Borrado","Se ha BORRADO la editorial");
    }
    
    /**
     * Muestra un mensaje al realizar una operacion de alta o de baja;
     * @param summary summary del mensaje
     * @param detalle detalle del mensaje
     */
    public void mostrarMensajeGrowl(String summary, String detalle){
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(summary, detalle));
    }
    
    /**
     * Solicita la lista de editoriales disponibles al bean administrado
     * @return Devuelve una lista de editoriales
     */
    public List<Editorial> obtenerEditoriales(){
        return editorialBean.obtenerEditoriales();
    }
    
    /**
     * Inicializa la editorial para reiniciar los inputs
     */
    public void iniciarEditorial(){
        editorial = new Editorial();
    }
    
    //GETTERS Y SETTERS

    public EditorialBean getEditorialBean() {
        return editorialBean;
    }

    public void setEditorialBean(EditorialBean editorialBean) {
        this.editorialBean = editorialBean;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
}
