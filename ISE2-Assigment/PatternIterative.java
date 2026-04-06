public class PatternIterative {

    public static void printPattern(int n) {

        int mid = n / 2;

        for (int i = 0; i < n; i++) {

            int stars;

            // Upper + middle part
            if (i <= mid) {
                stars = 2 * i + 1;
            } 
            // Lower part
            else {
                stars = 2 * (n - i - 1) + 1;
            }

            int spaces = (2 * mid + 1 - stars) / 2;

            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(3);
        System.out.println();

        printPattern(4);
        System.out.println();

        printPattern(5);
        System.out.println();

        printPattern(6);
    }
}