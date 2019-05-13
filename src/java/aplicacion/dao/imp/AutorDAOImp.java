/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IAutorDao;
import aplicacion.modelo.dominio.Autor;
import aplicacion.modelo.util.ListaAutores;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author tom-4
 */
public class AutorDAOImp implements Serializable,IAutorDao{
    
    /**
     * Referencia al data source
     */
    private ListaAutores listaAutores;

    /**
     * Constructor por defecto
     */
    public AutorDAOImp() {
        //Se inicializan las referencias
        listaAutores = new ListaAutores();
    }
    
    
    /**
     * Agrega un autor al data source
     * @param unAutor nuevo autor
     */
    @Override
    public void crear(Autor unAutor) {
        listaAutores.agregarAutor(unAutor);
    }

    /**
     * Modifica un autor en el data source
     * @param unAutor autor a modificar
     */
    @Override
    public void modificar(Autor unAutor) {
        listaAutores.modificarAutor(unAutor);
    }

    /**
     * Elimina un autor en el data source
     * @param unAutor autor a eliminar
     */
    @Override
    public void eliminar(Autor unAutor) {
        listaAutores.eliminarAutor(unAutor);
    }

    /**
     * Obtiene los autores disponibles en el data source
     * @return Devuelve una lista de autores
     */
    @Override
    public List<Autor> obtener() {
        return listaAutores.getAutores();
    }

    /**
     * Obtiene un autor del Data Source por su codigo id
     * @param id id del autor
     * @return devuelve un autor
     */
    @Override
    public Autor obtenerAutor(Integer id) {
        return listaAutores.obtenerAutor(id);
    }
    
    
}
