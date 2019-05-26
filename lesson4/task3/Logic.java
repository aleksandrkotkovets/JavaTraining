package task3;

public class Logic {

    public static void compareNumbers() {
        int number, a, b, c, d;
        number = 3456;

        d = number % 10;
        c = (number / 10) % 10;
        b = (number / 100) % 10;
        a = (number / 1000) % 10;

        System.out.printf("%d %d %d %d", a, b, c, d);

        if (Logic.equals(a,b,c,d)==1) {
            System.out.println("\nNumbers form an increasing sequence.");
        } else if (Logic.equals(a,b,c,d)==2) {
            System.out.println("\nNumbers form a decreasing sequence.");
        }

    }

    public static int equals(int a, int b, int c, int d) {

        if (a < b && b < c && c < d) {
            return 1;
        } else if (a > b && b > c && c > d) {
            return 2;
        } else {
            return 0;
        }

    }
}
