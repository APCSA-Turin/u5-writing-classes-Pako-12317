package U5T7_StaticMethods1;

public class Rectangle {
    // instance variables
    private double length;
    private double width;

    // constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // STATIC "utility" method that converts feet to inches
    public static double feetToInches(double feet) {
        return feet * 12;
    }

    // instance method that returns area of Rectangle object
    public double area() {
        return length * width;
    }

    public double Perimeter(){
        return 2*(length+width);
    }

    public static double inchesToFeet(int inches){
        return (double)inches / 12;
    }
}
