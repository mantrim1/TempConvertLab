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
public interface Validator {
   
	public abstract boolean isValid();
	
	
	public void setTestValue(String value);
}
