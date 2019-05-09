/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joel
 */
public class ListaLibro implements Serializable {
    
    private List<Libro> libros;

    public ListaLibro() {
        libros = new ArrayList<>();
    }
    
    /**
     * Agrega un libro a la lista
     * @param unLibro 
     */
    public void agregarLibro(Libro unLibro){
    Libro libroaux = new Libro();
    
    libroaux.setIsbm(unLibro.getIsbm());
    libroaux.setNombre(unLibro.getNombre());
    libroaux.setPaginas(unLibro.getPaginas());
    
    libros.add(libroaux);
    }
    
    /**
     * modifica un libro de la lista por su isbm
     * @param unLibro 
     */
    public void modificar (Libro unLibro){
    
        for(int i=0; i<libros.size(); i++){
            if ( libros.get(i).getIsbm().equals(unLibro.getIsbm())) {
            
                    libros.set(i, unLibro);
            }
        }
    }
    
    /**
     * elimina un libro de la lista por su ismb
     * @param unLibro 
     */
    public void eliminar (Libro unLibro){
    
        for(int i=0; i<libros.size(); i++){
            if ( libros.get(i).getIsbm().equals(unLibro.getIsbm())) {
                   libros.remove(i);
            }
        }    
    
    }
    
    /**
     * devuelve la lista para mostrar
     * @return 
     */
    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    } 
}
