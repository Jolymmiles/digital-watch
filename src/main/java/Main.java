import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int hours = (number % 1440) / 60;
        int minutes = number % 60;
        System.out.printf("%d:%d", hours, minutes);

        sc.close();
    }
}
