/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.validador;

import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Validador para email
 * @author glrio
 */
@FacesValidator
public class EmailValidator implements Validator{
    /**
     * Patron
     */
    private Pattern pattern;
    
    /**
     * Patron de caracteres para email
     */
    public static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    /**
     * Constructor por defecto
     */
    public EmailValidator() {
        //Se inicializan referencias
        pattern = Pattern.compile(EMAIL_PATTERN);
    }
    
    /**
     * Metodo validador
     * @param fc FacesContext
     * @param uic UIComponent
     * @param o Object
     * @throws ValidatorException 
     */
    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        if(o == null){
            return;
        }
        if(!pattern.matcher(o.toString()).matches()){
           String mensajeExcepcion = o+" no es un EMAIL valido";
           throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, mensajeExcepcion, mensajeExcepcion));
        }
    }
    
}
