//Program to sort array in Ascending order
import java.util.Scanner;
public class SortAryAscend {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print(" How many value you want in array : ");
        int val=scanner.nextInt();
        int num[]=new int[val];
        System.out.println(" Enter No for array : ");
        for(int i=0;i<val;i++){
            num[i]=scanner.nextInt();
        }
        sortAsc(num);
    }
    public static void sortAsc(int num[]){
        int temp,num2;
        for(int i=0;i<num.length;i++){
           for(int j=i+1;j<num.length;j++){
               if(num[i]>num[j]){
                   temp=num[i];
                   num[i]=num[j];
                   num[j]=temp;
               }
           }
        }
        System.out.println(" Array after sorting in Ascending order :");
        for(int k=0;k<num.length;k++){
            System.out.print(num[k] + " ");
        }
    }
}
