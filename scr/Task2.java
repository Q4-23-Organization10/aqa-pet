public class Task2 {
    public static void main(String[] args) {

        /*Формули:
        Celsius = 5/9 (F - 32)
        Kelvin = C + 273.16*/

        double X = 25;
        double Y = X * (9.0/5.0) + 32;
        double Z = X + 273.16;

        System.out.println( "************************************************************************************ ");
        System.out.println(X + " Celsius; " + Y + " Fahrenheit; " + Z + " Kelvin;");
    }
}
