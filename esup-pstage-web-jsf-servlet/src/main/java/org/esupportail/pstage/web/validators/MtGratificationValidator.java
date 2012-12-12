package org.esupportail.pstage.web.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.esupportail.pstage.utils.Utils;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 */
public class MtGratificationValidator implements Validator {

	/**
	 * @see javax.faces.validator.Validator#validate(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.Object)
	 */
	public void validate(FacesContext fc, UIComponent uic, Object o)
	throws ValidatorException {
		String value = (String) o;
		value=value.trim();
				
		if (!Utils.validateMtGratification(value)) {
			throw new ValidatorException(new FacesMessage());
		}
		
	}

}
