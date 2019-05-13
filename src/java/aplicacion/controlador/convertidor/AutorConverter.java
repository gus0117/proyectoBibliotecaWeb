/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.convertidor;

import aplicacion.controlador.beans.AutorBean;
import aplicacion.modelo.dominio.Autor;
import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("autorConverter")
public class AutorConverter implements Converter{

    public AutorConverter() {
    }
    
    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        System.out.println("string : " + string);
        ValueExpression vex = fc.getApplication().getExpressionFactory()
        .createValueExpression(fc.getELContext(), 
                "#{autorBean}", AutorBean.class);
        AutorBean autores = (AutorBean)vex.getValue(fc.getELContext());
        return autores.obtenerAutor(Integer.valueOf(string));
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return ((Autor)o).getId().toString();
    }
    
}
