package U5T7_StaticMethods1;

public class RaceUtility {
    private RaceUtility(){}

    public static double milesToKm(double miles){
        return miles*1.6;
    }

    public static double kmToMiles(double km){
        return km*0.62;
    }

    public static String makeProper(String str){
        String[] arr = str.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
            .append(arr[i].substring(1)).append(" ");
        }          
        return sb.toString().trim();
    }
}
