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
public class DoubleNumberLengthValidator implements Validator {
    private String tester;
    private String max;
    private String min;
    public DoubleNumberLengthValidator() {
    }

    public DoubleNumberLengthValidator(String max, String min) {
        this.max = max;
        this.min = min;
    }

    public String getTester() {
        return tester;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }
    
    
    @Override
    public boolean isValid() {
        boolean valid=false;
        try{
            double test = Double.parseDouble(tester);
            double minD = Double.parseDouble(min);
            double maxD = Double.parseDouble(max);
            if(test > minD && test < maxD) {
                valid = true;
            }
        }catch(Exception e){
            valid = false;
        }
        return valid;
    }

    @Override
    public void setTestValue(String value) {
        this.tester=value;
    }
    
}
