/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.dao.IAutorDao;
import aplicacion.dao.imp.AutorDAOImp;
import aplicacion.modelo.dominio.Autor;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author tom-4
 */
@ManagedBean
@ViewScoped
public class AutorBean {

    /**
     * Referencia a la logica de negocio
     */
    private IAutorDao  autordao;
    
    /**
     * Constructor
     */
    public AutorBean() {
        //Se inicializan las referencias
        autordao = new AutorDAOImp();
    }

    /**
     * @return the autordao
     */
    public IAutorDao getAutordao() {
        return autordao;
    }

    /**
     * @param autordao the autordao to set
     */
    public void setAutordao(IAutorDao autordao) {
        this.autordao = autordao;
    }
    
    /**
     * Agrega un nuevo autor
     * @param unAutor nuevo autor
     */
    public void agregarAutor(Autor unAutor){
        autordao.crear(unAutor);
    }
    
    /**
     * Modifica un autor
     * @param unAutor autor modificado
     */
    public void modificarAutor(Autor unAutor){
        autordao.modificar(unAutor);
    }
    
    /**
     * Elimina un autor
     * @param unAutor autor a eliminar
     */
    public void eliminarAutor(Autor unAutor){
        autordao.eliminar(unAutor);
    }
    
    /**
     * Obtiene una lista de autores
     * @return Lista de autores
     */
    public List<Autor> obtenerAutores(){
       return autordao.obtener();
    }
}
