//program to check number is Armstrong or not
import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter no to Check its Armstrong or not : ");
        int num=scanner.nextInt();
        int temp,mod,sum=0;
       temp=num;
        while (num !=0) {
            mod=num%10;
            num=num/10;
            sum=sum+(mod*mod*mod);
        }
        if(temp==sum){
            System.out.println(" Armstrong number");
        }else{
            System.out.println("  Not Armstrong number");
        }
    }
}