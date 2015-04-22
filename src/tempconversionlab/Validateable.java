/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconversionlab;

/**
 *
 * @author Mark
 */
public interface Validateable {
    public abstract void setValidator(Validator component);
	
	public abstract Validator getValidator();
	
	public abstract void setErrorMsg(String msg);
	
	public abstract String getErrorMsg();
}
