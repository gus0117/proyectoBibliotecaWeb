/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IEditorialDAO;
import aplicacion.modelo.dominio.Editorial;
import aplicacion.modelo.util.ListaEditoriales;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Rocio
 */
public class EditorialDAOImp implements Serializable, IEditorialDAO{

    /**
     * Referencia al Data Source
     */
    private ListaEditoriales editoriales;

    /**
     * Constructor sin argumentos
     */
    public EditorialDAOImp() {
        //Inicializa ListaEditoriales
        editoriales = new ListaEditoriales();
    }
    
    /**
     * Agrega una nueva editorial al Data Source
     * @param editorial nueva editorial
     */
    @Override
    public void agregarEditorial(Editorial editorial) {
        editoriales.agregarEditorial(editorial);
    }

    /**
     * Elimina una editorial del Data Source.
     * @param editorial editorial a eliminar.
     */
    @Override
    public void borrarEditorial(Editorial editorial) {
        editoriales.borrarEditorial(editorial);
    }

    /**
     * Obtiene una editorial del Data Source
     * @param codigo codigo de la editorial a buscar
     * @return devuelve una editorial con el mismo codigo
     */
    @Override
    public Editorial obtenerEditorial(Integer codigo) {
        return editoriales.obtenerEditorial(codigo);
    }

    /**
     * Obtiene una lista de las editoriales dispobles
     * @return devuelve una lista de editoriales
     */
    @Override
    public List<Editorial> obtenerEditoriales() {
        return editoriales.getListaEditoriales();
    }
    
}
