//Program to count words and space in string
import java.util.Scanner;
public class CountWordSpace {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter String : ");
        String str=scanner.nextLine();
        wordSpace(str);
    }
    public static void wordSpace(String str){
        int space=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                space++;
            }
        }
        System.out.println(" Number of Words in String is : "+ (space+1));
        System.out.println(" Number Of space in String is : " + space);
    }
}
