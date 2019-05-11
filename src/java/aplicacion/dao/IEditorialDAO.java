/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Editorial;
import java.util.List;

/**
 *
 * @author Rocio
 */
public interface IEditorialDAO {
    public void agregarEditorial(Editorial editorial);
    public void borrarEditorial(Editorial editorial);
    public Editorial obtenerEditorial(int codigo);
    public List<Editorial> obtenerEditoriales();
}
