/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.ILibroDao;
import aplicacion.modelo.dominio.Libro;
import aplicacion.modelo.util.ListaLibro;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Joel
 */
public class LibroDaoImp implements Serializable , ILibroDao{

    /**
     * Referencia al data source
     */
    private ListaLibro listaLibro;

    /**
     * Constructor por defecto
     */
    public LibroDaoImp() {
        //Se inicializan las referencias
        listaLibro = new ListaLibro();
    }
    
    /**
     * Agrega un libro al data source
     * @param unLibro nuevo libro
     */
    @Override
    public void crear(Libro unLibro) {
        listaLibro.agregarLibro(unLibro);
    }

    /**
     * Modifica un libro del data source
     * @param unLibro libro a modificar
     */
    @Override
    public void modificar(Libro unLibro) {
        listaLibro.modificar(unLibro);
    }

    /**
     * Elimina un libro del data source
     * @param unLibro libro a modificar
     */
    @Override
    public void eliminar(Libro unLibro) {
        listaLibro.eliminar(unLibro);
    }

    /**
     * Obtien la lista de libros disponibles en el data source
     * @return Devuelve una lista de libros
     */
    @Override
    public List<Libro> obtener() {
       return listaLibro.getLibros();
    } 
}
