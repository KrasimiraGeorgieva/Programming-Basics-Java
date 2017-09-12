import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        String asterisks = new String(new char[n]).replace("\0", "*");
        System.out.println(asterisks);

        for (int i = 1; i <= n - 2; i++) {
            System.out.printf("*");
            System.out.printf(new String(new char[n - 2]).replace("\0", " "));
            System.out.println("*");
        }
        System.out.println(asterisks);
    }
}
