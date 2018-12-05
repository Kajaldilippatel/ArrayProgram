//Program to Check counts no of vowels and digit in string and print counts and percentage
import java.util.Scanner;
public class CheckVowelsDigits {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter String to Check Vowel and Digit : ");
        String str=scanner.next();
        System.out.println(str);
        checkCountStr(str);
    }
    public static void checkCountStr(String str){
        int digit=0,vowel=0,len;
        float perdigit,pervowel,temp1,temp2;
        len=str.length();
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ||
                   str.charAt(i)=='A' ||str.charAt(i)=='E' ||str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U'){
               vowel++;
            }
        }
        for(int j=0;j<str.length();j++){
            if(str.charAt(j)>='0' && str.charAt(j)<='9'){
                digit++;
            }
        }
      temp1=(float)digit;
     temp2=(float)vowel;
       perdigit=((temp1*100)/len);
       pervowel=((temp2*100)/len);

        System.out.print("vowel : "+ vowel + "("+(String.format("%.2f",pervowel))+"%)" );
        System.out.println();
        System.out.print("  Digit : "+ digit + "("+(String.format("%.2f",perdigit))+"%)");
    }
}