package U5T2_Constructors;

public class Main {
    public static void main(String[] args) {
      Circle circ = new Circle(10);
      circ.radius = 5;
      System.out.println(circ.circInfo());
      System.out.println("The diameter is " + circ.diameter());
      System.out.println("The perimeter is " + circ.perimeter());
    }
  }
  
