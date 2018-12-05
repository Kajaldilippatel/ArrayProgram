//Program to count odd and even digit and find sum of them
import java.util.Scanner;
public class OddEvenSum {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num[]=new int[5];
        int oddsum=0,evensum=0,odd=0,even=0;
        System.out.println(" Enter No for array : ");
        for(int i=0;i<5;i++) {
            num[i] = scanner.nextInt();
            if(num[i]%2==0){
                evensum+=num[i];
                even++;
            }else{
                oddsum+=num[i];
                odd++;
            }
        }
        System.out.println(" No of odd digit is  " + odd + " and sum is " + oddsum);
        System.out.println(" No of Even digit is "+ even + " and sun is " + evensum);

    }
}
