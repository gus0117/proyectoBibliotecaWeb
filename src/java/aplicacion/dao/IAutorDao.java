/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Autor;
import java.util.List;

/**
 *
 * @author tom-4
 */
public interface IAutorDao {
    
    public void crear(Autor unAutor);
    public void modificar(Autor unAutor);
    public void eliminar(Autor unAutor);
    public List<Autor>obtener();
    
}
