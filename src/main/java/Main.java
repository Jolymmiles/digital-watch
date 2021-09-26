import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = n / 60, s = n - (60 * h);
        System.out.println(h + ":" + s);

    }
}
