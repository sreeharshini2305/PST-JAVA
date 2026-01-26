public class SumOfLastDigits {
    public static void main(String[] args) {
        int a = 123;
        int b = 456;

        int lastDigit1 = a % 10;
        int lastDigit2 = b % 10;

        int sum = lastDigit1 + lastDigit2;

        System.out.println("Sum of last digits: " + sum);
    }
}
