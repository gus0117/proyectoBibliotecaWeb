/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Autor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tom-4
 */
public class ListaAutores implements Serializable{
    
    private List<Autor> autores;
    
    

    public ListaAutores() {
        
        autores = new ArrayList<>();
    }

    public ListaAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    public void agregarAutor(Autor unAutor){
        Autor autoraux = new Autor();
        
        autoraux.setId(unAutor.getId());
        autoraux.setNombre(unAutor.getNombre());
        autoraux.setApellido(unAutor.getApellido());
        autoraux.setDate(unAutor.getDate());
    }
    
    public void modificarAutor(Autor unAutor){
        
        for(int i=0; i<getAutores().size(); i++){
            if ( getAutores().get(i).getId()== (unAutor.getId())) {
            
                    getAutores().set(i, unAutor);
            }
        }
    }
    
    public void eliminarAutor (Autor unAutor){
    
        for(int i=0; i<getAutores().size(); i++){
            if ( getAutores().get(i).getId()==(unAutor.getId())) {
                   getAutores().remove(i);
            }
        }    
    
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
}
