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
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tom-4
 */
@ManagedBean
@RequestScoped
public class AutorBean {

    
    private IAutorDao  autordao;
    
    public AutorBean() {
        
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
    
    public void agregarAutor(Autor unAutor){
        autordao.crear(unAutor);
    }
    public void modificarAutor(Autor unAutor){
        autordao.modificar(unAutor);
    }
    public void eliminarAutor(Autor unAutor){
        autordao.eliminar(unAutor);
    }
    
    public List<Autor> obtenerAutor(){
       return autordao.obtener();
    }
}
