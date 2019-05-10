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
    
    private ListaAutores listaAutores;

    public AutorDAOImp() {
        
        listaAutores = new ListaAutores();
    }
    
    

    @Override
    public void crear(Autor unAutor) {
        listaAutores.agregarAutor(unAutor);
    }

    @Override
    public void modificar(Autor unAutor) {
        listaAutores.modificarAutor(unAutor);
    }

    @Override
    public void eliminar(Autor unAutor) {
        listaAutores.eliminarAutor(unAutor);
    }

    @Override
    public List<Autor> obtener() {
        return listaAutores.getAutores();
    }
    
    
}
