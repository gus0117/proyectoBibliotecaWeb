/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Editorial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rocio
 */
public class ListaEditoriales implements Serializable{
    /**
     * Lista de editoriales (Data Source)
     */
    private List<Editorial> editoriales;

    /**
     * Constructor sin argumentos
     */
    public ListaEditoriales() {
        //Se inicializa List
        this.editoriales = new ArrayList();
        
        //Se agrega una editorial para prueba
        editoriales.add(new Editorial(1, "Prueba"));
    }
    
    /**
     * Agrega una nueva editorial al Data Source
     * @param edit nueva editorial
     */
    public void agregarEditorial(Editorial edit){
        editoriales.add(new Editorial(edit.getCodigo(), edit.getNombre()));
    }
    
    /**
     * Elimina una editorial del Data Source
     * @param edit editorial a eliminar
     */
    public void borrarEditorial(Editorial edit){
        editoriales.removeIf(e -> e.getCodigo().compareTo(edit.getCodigo()) == 0);
    }
    
    /**
     * Busca y obtiene una editorial del Data Source por codigo.
     * @param codigo codigo de la editorial a buscar.
     * @return devuelve una editorial con el mismo codigo. Si no se encuentra
     * devuelve null.
     */
    public Editorial obtenerEditorial(Integer codigo){
        for(Editorial e : editoriales){
            if(e.getCodigo().compareTo(codigo) == 0){
                return e;
            }
        }
        return null;
    }
    // Getters y Setters
    public List<Editorial> getListaEditoriales() {
        return editoriales;
    }

    public void setListaEditoriales(List<Editorial> listaEditoriales) {
        this.editoriales = listaEditoriales;
    }
    
    
}
