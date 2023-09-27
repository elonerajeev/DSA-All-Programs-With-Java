import java.util.Scanner;

public class R08seriesSum {
    public static int seriessum(int n) {
        if (n == 1) {
            return 1;
        }

        if (n % 2 == 0) {
            return seriessum(n - 1) - n;
        }

        else {
            return seriessum(n - 1) + n;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number for series sum:");
        int s1 = sc.nextInt();

        int ans = seriessum(s1);
        System.out.println("series of sum = " + ans);

        sc.close();

    }
}