import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Numeric Value Number");
        int num1 = scanner.nextInt();

        System.out.println("Enter the 2nd Numeric Value Number");
        int num2 = scanner.nextInt();

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd(num1, num2));

        scanner.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
