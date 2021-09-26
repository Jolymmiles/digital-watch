import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1440) {
            int h = n / 60, s = n - (60 * h);
            System.out.println(h + ":" + s);
        }else {
            int days = n - (n / 1440) * 1440;
            int h = days / 60, s = days - (60 * h);
            System.out.println(h + ":" + s);

        }


    }
}
