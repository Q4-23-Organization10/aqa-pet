public class HW7task4 {
    public static void main(String[] args) {

        int size = 360 / 10 + 1;
        double[] sinArr = new double[size];
        //int x = 0;

        for (int i = 0, x = 0; i < sinArr.length; i++, x += 10) {
            sinArr[i] = Math.sin(x);
            }

        System.out.println("x\t| sin(x)");
        System.out.println("---------------------");
       for (int i = 0, x = 0; i < sinArr.length; i++, x += 10) {
            System.out.printf("%d\t| %.4f%n", x, sinArr[i]);
        }
    }
}
