import java.util.Scanner;
//Check number is prime or not
public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter no to Check its Prime or not : ");
        int num=scanner.nextInt();
        int temp=2,sum=0,flag=0;
        while (temp<num) {
            if(num%temp==0){
                flag=1;
            }
            temp++;
          }
        if(flag==0){
            System.out.println(" Prime number");
        }else{
            System.out.println("  Not Prime number");
        }
    }
}
