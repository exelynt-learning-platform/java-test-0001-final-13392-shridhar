public class Test1 {
    public static void main(String[] args) {

        int n = 4;

        // upper part
        for (int row = 0; row <= n; row++) {

            for (int space = 0; space < n - row; space++)
                System.out.print(" ");

            System.out.print("*");

            if (row > 0) {
                for (int mid = 0; mid < 2 * row - 1; mid++)
                    System.out.print(" ");
                System.out.print("*");
            }

            System.out.println();
        }

        // lower part
        for (int row = n - 1; row >= 0; row--) {

            for (int space = 0; space < n - row; space++)
                System.out.print(" ");

            System.out.print("*");

            if (row > 0) {
                for (int mid = 0; mid < 2 * row - 1; mid++)
                    System.out.print(" ");
                System.out.print("*");
            }

            System.out.println();
        }
    }
}