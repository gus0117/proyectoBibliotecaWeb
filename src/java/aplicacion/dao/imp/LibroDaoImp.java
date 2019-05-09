/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.daoo.ILibroDao;
import aplicacion.modelo.dominio.Libro;
import aplicacion.modelo.util.ListaLibro;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Joel
 */
public class LibroDaoImp implements Serializable , ILibroDao{

    private ListaLibro listaLibro;

    public LibroDaoImp() {
        listaLibro = new ListaLibro();
    }
    
    @Override
    public void crear(Libro unLibro) {
        listaLibro.agregarLibro(unLibro);
    }

    @Override
    public void modificar(Libro unLibro) {
        listaLibro.modificar(unLibro);
    }

    @Override
    public void eliminar(Libro unLibro) {
        listaLibro.eliminar(unLibro);
    }

    @Override
    public List<Libro> obtener() {
       return listaLibro.getLibros();
    } 
}
