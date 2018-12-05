//Program to Reverse number of five digit
import java.util.Scanner;
public class RevNum {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num[]=new int[5];
        System.out.println(" Enter No for array : ");
        for(int i=0;i<5;i++) {
            num[i] = scanner.nextInt();
        }
        revNumDigit(num);
}
public static void revNumDigit(int num[]){
   // int revnum[]=new int[5];
    System.out.println(" Reverse Number array is" );
  for(int k=num.length-1;k>=0;k--) {
            System.out.print(num[k]+ " ");
        }
    }

}

