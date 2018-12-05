import java.util.Scanner;

//Program to Check array contain any Specific value
public class ArraySpecificValue {
    public static void main(String[] args){
        int ary[]={10,20,30,40,50,60,70,80,90,100};
        Scanner scanner=new Scanner(System.in);
        for(int k=0;k<ary.length;k++){
            System.out.print(ary[k] + "  ");
        }
        System.out.println();
        System.out.print(" Enter Specific value To check its in array or not : ");
        int num=scanner.nextInt();
        int flag=0;
        for(int i=0;i<ary.length;i++){
            if(ary[i]==num){
                flag=1;
            }
        }
        if(flag==1){
            System.out.print(" Array Contain value ");

        }else{
            System.out.print(" Array Not Contain value ");
        }
    }
}
