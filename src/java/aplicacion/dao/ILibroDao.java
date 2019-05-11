/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Libro;
import java.util.List;

/**
 *
 * @author Joel
 */
public interface ILibroDao {
    
    public void crear(Libro unLibro);
    public void modificar (Libro unLibro);
    public void eliminar (Libro unLibro);
    public List<Libro> obtener();
}
