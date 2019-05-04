/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Autor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author glrio
 */
public class ListaAutores {
    List<Autor> autores;

    public ListaAutores() {
        autores = new ArrayList();
        
        autores.add(new Autor(1, "Gabriel", "Garcia Marquez"));
        autores.add(new Autor(2, "Alan", "Poe"));
        autores.add(new Autor(3, "Howard", "Lovecraft"));
        autores.add(new Autor(4, "Carl", "Sagan"));
    }
    public Autor obtenerAutorPorString(String string){
        Autor a = new Autor();
        for(Autor au: autores){
            if(au.toString().equals(string)){
                a = au;
            }
        }
        return a;
    }
    public Autor getAutor(Integer id){
        if(id == null){
            throw new IllegalArgumentException("no id provided");
        }
        for(Autor autor : autores){
            if(id.equals(autor.getId())){
                return autor;
            }
        }
        return null;
    }
    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    
}
