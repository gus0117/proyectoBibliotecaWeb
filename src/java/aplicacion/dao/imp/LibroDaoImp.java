/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.ILibroDao;
import aplicacion.modelo.dominio.Libro;
import aplicacion.modelo.util.ListaLibros;
import java.io.Serializable;

/**
 *
 * @author Rocio
 */
public class LibroDaoImp implements Serializable, ILibroDao {

    private ListaLibros listaLibros;

    public LibroDaoImp() {
        listaLibros = new ListaLibros();
    }
    
    @Override
    public void guardarLibro(Libro libro) {
        listaLibros.agregarLibro(libro);
    }
    @Override
    public void modificarLibro(Libro libro) {
        listaLibros.modificarLibro(libro);
    }
    @Override
    public void borrarLibro(Libro libro) {
        listaLibros.borrarLibro(libro);
    }
    @Override
    public void mostrarLista(){
        for(int i = 0; i < listaLibros.getListaLibros().size(); i++){
           listaLibros.obtenerLibroPorIndice(i).mostrarLibro();
        }
    }
    @Override
    public void ordenarListaLibros(boolean ascendente){
        listaLibros.ordernarLibrosPorNombre(ascendente);
    }
    @Override
    public void mostrarListaSegunNombre(char letra){
        listaLibros.mostrarListaSegunNombre(letra);
    }
}
