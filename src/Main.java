public class Main {
    public static void main(String[] args) {
        double[] array = Xbonacci.xbonacci(new double[]{0.1,0.1}, 10);

        for (double v : array) {
            System.out.print(v + ",");
        }
    }
}
