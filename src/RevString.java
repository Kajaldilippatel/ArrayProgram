//Program to reverse String
import java.util.Scanner;
public class RevString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter String to reverse : ");
        String str=scanner.next();
        String revstr=" ";
        int i=str.length();
        i--;
        do{
            revstr+=str.charAt(i);
            i--;
        }while(i>=0);
        System.out.print(" Reverse String is : "+ revstr);
    }
}
