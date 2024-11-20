public class Dice{
    private int roll;
    private int amntRoll;
    private int sides;
    public Dice(int sides){
        roll = 0;
        this.sides = sides;
        amntRoll = 0;
    }

    public void roll(){
        roll = (int) ((Math.random()*sides-1)+1);
        amntRoll++;
    }

    public int getSides(){
        return sides;
    }

    public int getRollValue(){
        return roll;
    }

    public int getRollCount(){
        return amntRoll;
    }

    public void setSides(int sides){
        this.sides = sides;
    }
}