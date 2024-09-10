public class Base5Add {

    public static void main(String[] args) {

        String base5Num1 = "1230";
        String base5Num2 = "443";

        int num1 = Integer.parseInt(base5Num1, 5);
        int num2 = Integer.parseInt(base5Num2, 5);
        int sum = num1 + num2;
        String base5Sum = Integer.toString(sum, 5);

        System.out.println("  " + base5Num1);
        System.out.println("+ " + base5Num2);
        System.out.println("------");
        System.out.println("  " + base5Sum);
    }
}