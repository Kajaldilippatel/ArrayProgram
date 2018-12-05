//program to count total number A in string
import java.util.Scanner;
public class CountAStr {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter String to find No of A its contain : ");
        String str=scanner.next();
        counta(str);
    }
    public static void counta(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='A'){
                count++;
            }
        }
        System.out.println(" Number Of A in String is : " + count);
    }
}
