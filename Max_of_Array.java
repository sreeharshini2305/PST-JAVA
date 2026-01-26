import java.util.Scanner;
class Max_of_Array {
public static void main(String[] args){

int [] arr={2,8,10,12,67,54,24};
Scanner sc = new Scanner(System.in);

int max = 0;

for (int i=1;i<arr.length;i++) {
if (arr[i]>max) {
max=arr[i];
}
}

System.out.print("The maximum element of the given array: "+max);
}
}

