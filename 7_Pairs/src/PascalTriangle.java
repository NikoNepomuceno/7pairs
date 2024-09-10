import java.util.Scanner;

public class PascalTriangle {
    public static int factorial(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }

    public static int pascalValue(int row, int col) {
        return factorial(row) / (factorial(col) * factorial(row - col));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalValue(i, j) + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}