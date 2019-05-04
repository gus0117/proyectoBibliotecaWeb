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
 * @author glrio
 */
public class AutorDaoImp implements IAutorDao, Serializable{

    private ListaAutores listaAutores;

    public AutorDaoImp() {
        listaAutores = new ListaAutores();
    }
    
    @Override
    public void guardarAutor(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarAutor(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarAutor(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Autor> obtenerListaAutores() {
        return listaAutores.getAutores();
    }

    @Override
    public Autor obtenerAutor(Integer id) {
        return listaAutores.getAutor(id);
    }
    
}
