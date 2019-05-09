/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.form.bean;

import aplicacion.dao.imp.LibroDaoImp;
import aplicacion.daoo.ILibroDao;
import aplicacion.modelo.dominio.Libro;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Joel
 */
@ManagedBean
@ViewScoped
public class LibroBean {

    //Bean Administrado
    
    private ILibroDao libroDao;
    /**
     * Creates a new instance of LibroBean
     */
    public LibroBean() {
        libroDao = new LibroDaoImp();
    }
    
    public void agregarLibro(Libro unLibro){
        libroDao.crear(unLibro);
    }
    
    public void modificarLibro(Libro unLibro){
        libroDao.modificar(unLibro);
    }
    
    public void eliminarLibro (Libro unLibro){
        libroDao.eliminar(unLibro);
    }
    
    public List<Libro> obtenerLibro (){
        return libroDao.obtener();
    }
    
    
    //Getter & Setter

    public ILibroDao getLibroDao() {
        return libroDao;
    }

    public void setLibroDao(ILibroDao libroDao) {
        this.libroDao = libroDao;
    }
    
    
}
