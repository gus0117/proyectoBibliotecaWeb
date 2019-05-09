/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Joel
 */
public class Libro implements Serializable{
    private String isbm;
    private String nombre;
    private int paginas;
    //faltaria un atributo autor de una clase Autor
    
    //Constructores
    public Libro() {
    }

    public Libro(String isbm, String nombre, int paginas) {
        this.isbm = isbm;
        this.nombre = nombre;
        this.paginas = paginas;
    }
 
    //Getter & Setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }  

    public String getIsbm() {
        return isbm;
    }

    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }
    
}