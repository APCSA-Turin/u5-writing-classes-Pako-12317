public class Box {
    private double length;
    private double width;
    private double height;
    
    public Box(double length, double width, double height) {
        // implement me as described in part (a)
        this.length = length;
        this.height = height;
        this.width = width;
    }
    
    // creates a cube: a box with all dimensions equal to side
    public Box(double side) {
        // implement me as described in part (b)
        this(side, side, side);
    }
    
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
    public double volume() {
        // implement me as described in part (c)
        return length*height*width;
    }
    
    public Box greaterVolume(Box otherBox) {
        // implement me as described in part (d)
        if(otherBox.volume() < this.volume()){
            return this;
        }else if(this.volume() < otherBox.volume()){
            return otherBox;
        }else{
            return null;
        }
    }

    public String boxInfo() {
        // implement me as described in part (e)
        return InfoString.boxInfoString(this);
    }
}
