import java.util.Scanner;
class Palindrome {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int z=a;
int rev=0;
while (a!=0){
int b=a%10;
rev =rev*10+b;
a=a/10;
}
if (z==rev){
System.out.println("The given number is a Palindrome");
}
else{
System.out.println("The given number is not a Palindrome");
}
}
}

