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
    public String getfTempString(){
        String fTempS= Double.toString(this.fTemp);
        return fTempS;
    }
    public void setfTempFromString(String fTempS)throws NumberFormatException{
        this.fTemp=Double.parseDouble(fTempS);
        //System.out.println(fTemp);
    }
    public void setcTempFromString(String cTempS)throws NumberFormatException{
        this.cTemp=Double.parseDouble(cTempS);
        //System.out.println(fTemp);
    }
    public void convertFToC(){
//        double fiveNinths=5D/9D;
//        System.out.println(fiveNinths);
        this.cTemp=(this.fTemp-32)*(5D/9D);
        System.out.println(cTemp);
    }
    public void convertCToF(){
//        double fiveNinths=5D/9D;
//        System.out.println(fiveNinths);
        this.fTemp=(this.cTemp*(5D/9D))+32;
        System.out.println(fTemp);
    }
    
}
