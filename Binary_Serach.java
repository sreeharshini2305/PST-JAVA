import java.util.Scanner;
class Binary_Serach {
public static void main(String[] args) {

int [] arr={10,2,56,23,90,35,7,8};
Scanner sc=new Scanner(System.in);

int key=sc.nextInt();
int low=0;
int high=arr.length - 1;
boolean found=false;

while (low<=high) {
int mid = (low+high)/2;

if (arr[mid]==key) {
System.out.print("Element is found at index "+mid);
found=true;
break;
}
else if (key<=arr[mid]) {
high = mid-1;
}
else {
low=mid+1;
}}
if (!found){
System.out.print("Element not Found");
}
}
}