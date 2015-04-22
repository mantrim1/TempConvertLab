/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconversionlab;

import javax.swing.JTextField;

/**
 *
 * @author Mark
 */
public class TextFieldValidateable extends JTextField implements Validateable {
    private Validator validator;
	private String errorMsg;
	
	public TextFieldValidateable(int cols) {
		super(cols);
	}
	
	public void setValidator(Validator validator) {
		this.validator = validator;
	}
	
	public Validator getValidator() {
		return validator;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
    
}
