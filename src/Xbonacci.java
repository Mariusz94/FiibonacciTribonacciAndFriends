public class Xbonacci {

    public static double[] xbonacci(double[] signature, int n) {

        if(n<=0) return signature;

        double[] array = new double[n];

        for (int i = 0; i < signature.length; i++) {
            array[i] = signature[i];
        }

        for (int i = signature.length; i < n; i++) {
            array[i] = sumLastSignatureElement(array, signature.length, i);
        }

        return array;
    }

    public static double sumLastSignatureElement(double[] array, int signatureElement, int o) {
        double sum = 0;
        for (int i = 0; i < signatureElement; i++) {
            sum += array[o - i - 1];
        }

        return sum;
    }
}