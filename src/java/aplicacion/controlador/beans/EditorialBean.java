/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.dao.IEditorialDAO;
import aplicacion.dao.imp.EditorialDAOImp;
import aplicacion.modelo.dominio.Editorial;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Rocio
 */
@ManagedBean
@RequestScoped
public class EditorialBean implements Serializable{

    /**
     * Referencia a la logica de negocios
     */
    private IEditorialDAO editorialDAO;
    
    /**
     * Constructor por defecto
     */
    public EditorialBean() {
        //Se inicializan las referencias
        editorialDAO = new EditorialDAOImp();
    }

    /**
     * Invoca al metodo para agregar una nueva editorial
     * @param e nueva editorial
     */
    public void agregaEditorial(Editorial e){
        editorialDAO.agregarEditorial(e);
    }
    
    /**
     * Invoca al metodo para borrar una editorial
     * @param e editorial a borrar
     */
    public void borrarEditorial(Editorial e){
        editorialDAO.borrarEditorial(e);
    }
    
    /**
     * Invoca al metodo para obtener una lista de editoriales.
     * @return devuelve una lista de editoriales disponibles.
     */
    public List<Editorial> obtenerEditoriales(){
        return editorialDAO.obtenerEditoriales();
    }
    
    //GETTERS Y SETTERS
    public IEditorialDAO getEditorialDAO() {
        return editorialDAO;
    }

    public void setEditorialDAO(IEditorialDAO editorialDAO) {
        this.editorialDAO = editorialDAO;
    }
    
    
}
