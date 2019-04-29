/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Libro;

/**
 *
 * @author Rocio
 */
public interface ILibroDao {
    public void guardarLibro(Libro libro);
    public void modificarLibro(Libro libro);
    public void borrarLibro(Libro libro);
    public void mostrarLista();
    public void ordenarListaLibros(boolean ascendente);
    public void mostrarListaSegunNombre(char letra);
}
