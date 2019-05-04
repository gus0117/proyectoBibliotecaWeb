/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

public class Autor{
    private Integer id;
    private String nombre;
    private String apellido;

    public Autor(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Autor() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        //return "Autor{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
        return nombre +" "+ apellido;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Autor && id != null)
                ? id.equals(((Autor)obj).id)
                : obj == this;
    }

    @Override
    public int hashCode() {
        return (apellido != null && nombre != null) 
                ? (this.getClass().hashCode() + (apellido+", "+nombre).hashCode()) 
                : super.hashCode();
    }
    
}
