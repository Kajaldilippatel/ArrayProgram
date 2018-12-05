import java.util.Scanner;
//Program to check number is palindrome or not
public class CheckPali {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter no to Check its Palindrome or not : ");
        int num=scanner.nextInt();
        int temp,mod,sum=0;
        temp=num;
        while (num !=0) {
            mod=num%10;
            num=num/10;
            sum=(sum*10)+mod;
        }
        if(temp==sum){
            System.out.println(" Palindrome number");
        }else{
            System.out.println("  Not Palindrome number");
        }
    }
}
