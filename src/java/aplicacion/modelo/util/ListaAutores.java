/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Autor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author tom-4
 */
public class ListaAutores implements Serializable{
    
    /**
     * Lista de autores (data source)                                                          
     */
    private List<Autor> autores;
    
    
    /**
     * Constructor por defecto
     */
    public ListaAutores() {
        //Se inicializan las referencias
        autores = new ArrayList<>();
        //Se agrega autores para prueba
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(1809, 1, 19);
        Date fechaNac = cal.getTime();
        autores.add(new Autor(1,"Edgar Alan","Poe", fechaNac));
        
        cal.clear();
        cal.set(1899, 8, 24);
        Date fechaNac2 = cal.getTime();
        autores.add(new Autor(2,"Jorge Luis","Borges", fechaNac2));
    }

    /**
     * Constructor con argumentos
     * @param autores lista de autores
     */
    public ListaAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    /**
     * Agrega un autor al data source
     * @param unAutor nuevo autor
     */
    public void agregarAutor(Autor unAutor){
        Autor autoraux = new Autor();
        
        autoraux.setId(unAutor.getId());
        autoraux.setNombre(unAutor.getNombre());
        autoraux.setApellido(unAutor.getApellido());
        autores.add(autoraux);
    }
    
    /**
     * Modifica un autor del data source
     * @param unAutor autor a modificar
     */
    public void modificarAutor(Autor unAutor){
        
        for(int i=0; i<getAutores().size(); i++){
            if ( getAutores().get(i).getId()== (unAutor.getId())) {
            
                    getAutores().set(i, unAutor);
            }
        }
    }
    
    /**
     * Elimina un autor del data source
     * @param unAutor autor a eliminar
     */
    public void eliminarAutor (Autor unAutor){
    
        for(int i=0; i<getAutores().size(); i++){
            if ( getAutores().get(i).getId()==(unAutor.getId())) {
                   getAutores().remove(i);
            }
        }    
    
    }
    
    /**
     * Obtiene un autor especifico segun la id
     * @param id id del autor
     * @return retorna un objeto Autor
     */
    public Autor obtenerAutor(Integer id){
        if(id == null){
            throw new IllegalArgumentException("no id provided");
        }
        for(Autor autor : autores){
            if(id.equals(autor.getId())){
                return autor;
            }
        }
        return null;
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
