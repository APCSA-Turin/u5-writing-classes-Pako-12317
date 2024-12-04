package U5T7_StaticMethods1;

public class Temperature {
    private double lowT;
    private double highT;
    private String scale;

    public Temperature(double low, double high, String scale){
        lowT=low;
        highT=high;
        if (scale.equals("C")){
            this.scale = scale;
        }else{
            this.scale = "F";
        }
    }

    public static double convertCtoF(double temp){
        return (temp*(9/5)+32);
    }

    public static double convertFtoC(double temp){
        return (temp-32)*(5/9);
    }

    public void changeToC(){
        if (scale.equals("F")){
        convertFtoC(highT);
        convertFtoC(lowT);
        this.scale = "C";
        }
    }

    public void changeToF(){
        if (scale.equals("C")){
            convertCtoF(highT);
            convertCtoF(lowT);
            this.scale = "F";
        }
    }

    public String tempInfo(){
        return "High Temperature: "+highT+" "+scale+"\nLow Temperature: "+lowT+" "+scale;
    }
}
