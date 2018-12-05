//Program to input any five digit then sun of each digit
import java.util.Scanner;
public class SumOfFiveDigit {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num[]=new int[5];
        int sum=0;
        System.out.println(" Enter No for array : ");
        int i=0;
        while(i<5){
            num[i]=scanner.nextInt();
            sum+=num[i];
            i++;
        }
        System.out.print(" Sum of Array is : " + sum);

    }

    }

