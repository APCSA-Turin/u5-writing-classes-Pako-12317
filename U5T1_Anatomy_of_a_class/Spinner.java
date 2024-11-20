public class Spinner {
    private int spinValue;
    private int spinNumber;
    private int spinSum;
    private int spinnerSections;

    public Spinner(int sections){
        spinnerSections = sections;
        spinNumber = 0;
    }
    public void spin(){
        spinValue =(int) ((Math.random()*spinnerSections-1)+1);
        spinNumber++;
        spinSum+=spinValue;
    }

    public double averageSpin(){
        return (double)spinSum/spinNumber;
    }

    public int getSpinCount() {
        return spinNumber;
    }

    public int getSpinSum() {
        return spinSum;
    }

    public int getSpinValue() {
        return spinValue;
    }
}
