import java.util.Scanner;

class Accessing_the_elements {
public static void main(String[] args) {
int[] arr = {10, 20, 30, 40, 50};
Scanner sc = new Scanner(System.in);

System.out.print("Enter index: ");
int index = sc.nextInt();

if (index >= 0 && index < arr.length) {
System.out.println("Element: " + arr[index]);
} else {
System.out.println("Invalid index!");
}
}
}
