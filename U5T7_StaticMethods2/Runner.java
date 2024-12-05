public class Runner {
    public static void main(String[] args) {
        System.out.println("this code is in my main method");
        double sum = div(6, 10);
        System.out.println(sum);
    }

    private static double div(int x, int y) {
        return (double)x / y;
    }
 }
