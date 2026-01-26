interface DigitSum {
Boolean check(int digit);
}
public class EvenOddSum {
public static void main(String[] args) {

int num = 12345;
int EvenSum=0,OddSum=0;

DigitSum isEven = digit->digit%2==0;
while (num>0){
int digit = num%10;
if (isEven.check(digit)) {
EvenSum += digit;
}

else {
OddSum += digit;
}
num=num/10;
}
System.out.println("Sum of Even Digit: "+EvenSum);
System.out.println("Sum of Odd Digit: "+OddSum);
}
}
 
