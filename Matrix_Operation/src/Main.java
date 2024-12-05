//1030510309  AHMET FARUK ERDEM
//1.ÖĞRETİM 1.GRUP
public class MyMatrix {
    Double[][] a = { { 4.00, 3.00 }, { 2.00, 1.00 } };
    Double[][] b = { { -0.500, 1.500 }, { 1.000, -2.0000 } };
public class Main {
    public static void main(String[] args) {
        MyMatrix matrix = new MyMatrix();
        Double[][] result = multiply(matrix.a, matrix.b);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
    }
    //matrix multiplication
        public static Double[][] multiply(Double[][] a, Double[][] b) {
            int aRows = a.length;
            int aColumns = a[0].length;
            int bRows = b.length;
            int bColumns = b[0].length;
            if (aColumns != bRows) {
                throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
            }
            Double[][] c = new Double[aRows][bColumns];
            for (int i = 0; i < aRows; i++) {
                for (int j = 0; j < bColumns; j++) {
                    c[i][j] = 0.00000;
                }
            }
            for (int i = 0; i < aRows; i++) { // a row
                for (int j = 0; j < bColumns; j++) { // b column
                    for (int k = 0; k < aColumns; k++) { // a column
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return c;
        }
    // matrix-vector multiplication
    public static double[] multiply(double[][] a, double[] u) {

    }
    public static String toString(double[][] a){

    }

}