package love.programming;

public class LoopsHomework1 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print(" One more pattern");
        System.out.println();
        int rows1 = 5;
        for (int i = 0; i < rows1; i++) {
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j = 0; j <= 10; j++) {
                // printing stars
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("one more pattern2");
        System.out.println();
        int rows2 = 5;
        for (int i = 0; i < rows2; i++) {
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j = 0; j <= 10; j++) {
                // printing stars
                System.out.print("1 ");
            }
            System.out.println();
        }
        System.out.println("one more pattern3 ");
        System.out.println();
        int rows3 = 5, k = 0;
        for (int i = 1; i <= rows3; ++i, k = 0) {
            for (int space = 1; space <= rows3 - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
        System.out.println("one more pattern4");
        System.out.println();
        int rows4 = 5, k1 = 0, count = 0, count1 = 0;

        for (int i = 1; i <= rows4; ++i) {
            for (int space = 1; space <= rows4 - i; ++space) {
                System.out.print("  ");
                ++count;
            }

            while (k != 2 * i - 1) {
                if (count <= rows4 - 1) {
                    System.out.print((i + k1) + " ");
                    ++count;
                } else {
                    ++count1;
                    System.out.print((i + k - 2 * count1) + " ");
                }
                ++k;
            }
            count1 = count = k = 0;

            System.out.println();
        }
        System.out.println("one more new pattern5");
        System.out.println();
        int n = 5;
        int i, j;
        // outer loop to handle number of rows
        //  n in this case
        for (i = 0; i < n; i++) {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (j = 2 * (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++);
            System.out.println("* ");
        }
    }
}



















