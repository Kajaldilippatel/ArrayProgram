//program to input five digit and find sum of first and last digit
import java.util.Scanner;
public class SumFirstLastDigit {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num[]=new int[5];
        int oddsum=0,evensum=0,odd=0,even=0;
        System.out.println(" Enter No for array : ");
        for(int i=0;i<5;i++) {
            num[i] = scanner.nextInt();
        }
        sumFirstLast(num);
}
public static void sumFirstLast(int num[]){
        int i=0,sum=0;
        int k=num.length-1;
        sum+=num[0]+num[k];
        System.out.print(" Sum of First and last Digit is :" + sum);
}
}
