/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Libro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Rocio
 */
public class ListaLibros {
    private List<Libro> listaLibros;

    public ListaLibros() {
        listaLibros = new ArrayList<Libro>();
    }

    /**
     * @return the listaLibros
     */
    public List<Libro> getListaLibros() {
        return listaLibros;
    }
    /**
     * Agrega un libro a la lista
     * @param libro a agregar
     */
    public void agregarLibro(Libro libro){
        Libro auxLibro = new Libro();
        auxLibro.setAutores(libro.getAutores());
        auxLibro.setCantPaginas(libro.getCantPaginas());
        auxLibro.setCodigo(libro.getCodigo());
        auxLibro.setIsbn(libro.getIsbn());
        auxLibro.setTitulo(libro.getTitulo());
        listaLibros.add(auxLibro);
    }
    /**
     * Busca un libro y retorna su indice en la lista
     * @param libro a buscar en la lista
     * @return indice del libro
     */
    public int obtenerIndiceLibro(Libro libro){
        return listaLibros.indexOf(libro);
    }
    public int obtenerIndiceLibroPorCodigo(Libro libro){
        //Buscar por codigo
        int i = 0;
        boolean encontrado = false;
        while(i < listaLibros.size() && !encontrado){
            if(listaLibros.get(i).getCodigo() == libro.getCodigo()){
                encontrado = true;
            }
            else
            {
                i++;
            }
        }
        if(encontrado){
            return i;
        }
        else
        {
            return -1;
        }
    }
    /**
     * Modifica un elemento libro de la lista
     * @param indice indice en el ArrayList
     * @param libro libro reemplazante
     */
    public void modificarLibro(int indice, Libro libro){
        listaLibros.set(indice, libro);
        
    }
    /**
     * Modifica un elemento libro de la lista. Este metodo requiere que el codigo
     * del libro no se modifique, debido a que solicita una busqueda por codigo.
//     * @param libro libro a reemplazar (excepto el atributo codigo)
     */
    public void modificarLibro(Libro libro){
        int indice = this.obtenerIndiceLibroPorCodigo(libro);
        if(indice > -1){
            listaLibros.set(indice, libro);
        }
        else{
            System.out.println("La busqueda del libro por el codigo no dio resultado");
        }
    }
    /**
     * Se elimina un objeto libro de la lista
     * @param libro libro que se desea eliminar
     */
    public void borrarLibro(Libro libro){
        //Si es con string se usa equals
        listaLibros.removeIf(lib -> lib.getCodigo() == libro.getCodigo());
    }
    
    public Libro obtenerLibroPorIndice(int indice){
        return listaLibros.get(indice);
    }
    /**
     * @param listaLibros the listaLibros to set
     */
    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    
    /**
     * Ordena la lista de forma ascendente segun su titulo
     * @param ascendente true: ascendente, false: descendente
     */
    public void ordernarLibrosPorNombre(boolean ascendente){
        this.listaLibros.sort(Comparator.comparing(Libro::getTitulo));
        if(!ascendente){
            Collections.reverse(listaLibros);
        }
    }
    /**
     * Muestra los libros cuyo titulo empieza con un caracter pasado como paramatro
     * @param letra letra es el primer caracter del titulo del libro
     */
    public void mostrarListaSegunNombre(char letra){
        for(Libro l:listaLibros)
        {
           if(l.getTitulo().charAt(0) == letra){
               l.mostrarLibro();
           }
        }
    }
}
