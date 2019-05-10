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
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

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
    }
    
    /**
     * Se elimina la editorial
     */
    public void borrarEditorial(){
        editorialBean.borrarEditorial(editorial);
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
