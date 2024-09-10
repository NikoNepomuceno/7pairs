public class BinaryAddition {

    public static void main(String[] args) {

        int num1 = Integer.parseInt("10110", 2);
        int num2 = Integer.parseInt("1011", 2);

        int sum = num1 + num2;

        String binarySum = Integer.toBinaryString(sum);

        System.out.println(" 10110\n+ 1011");
        System.out.println("-------");
        System.out.println(binarySum);

    }
}