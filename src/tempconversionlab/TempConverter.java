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
public class TempConverter {
    private double fTemp;
    private double cTemp;

    public TempConverter() {
    }

    public double getfTemp() {
        return fTemp;
    }

    public void setfTemp(double fTemp) {
        this.fTemp = fTemp;
    }

    public double getcTemp() {
        return cTemp;
    }

    public void setcTemp(double cTemp) {
        this.cTemp = cTemp;
    }
    public String getcTempString(){
        String cTempS= Double.toString(this.cTemp);
        return cTempS;
    }
    public void setfTempFromString(String fTempS)throws NumberFormatException{
        this.fTemp=Double.parseDouble(fTempS);
        //System.out.println(fTemp);
    }
    public void convert(){
//        double fiveNinths=5D/9D;
//        System.out.println(fiveNinths);
        this.cTemp=(this.fTemp-32)*(5D/9D);
        System.out.println(cTemp);
    }
    
}
