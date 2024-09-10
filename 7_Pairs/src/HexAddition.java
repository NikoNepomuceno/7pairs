public class HexAddition {

    public static void main(String[] args) {

        int num1 = Integer.parseInt("CAFE", 16);
        int num2 = Integer.parseInt("1CE", 16);

        int sum = num1 + num2;

        String HexSum = Integer.toHexString(sum).toUpperCase();

        System.out.println(" CAFE\n +1CE");
        System.out.println("-------");
        System.out.println(" " + HexSum);

    }
}