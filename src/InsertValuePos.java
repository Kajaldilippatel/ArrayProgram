//Program to insert element in specific position
import java.util.Scanner;
public class InsertValuePos {
    public static void main(String[] args) {
        int ary[]={10,20,30,40,50};
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter Number you want to insert : ");
    int num=scanner.nextInt();
    System.out.print(" Enter Position Where u want to  insert number : ");
    int pos=scanner.nextInt();
    pos--;
    for(int i=0;i<ary.length;i++){
        if(i==pos){
            ary[i]=num;
        }
    }
    int j=0;
    while(j<ary.length){
        System.out.print(ary[j] + " ");
        j++;
    }
    }
    }

