import java.util.Scanner;

//Program to printing multiplication table
public class PrintMulti {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter no to print Multiplication table : ");
        int num=scanner.nextInt();
        int j=1;
        do{
                System.out.println(j + " " + (j+j) + " " + (j+j+j));
                j++;
            }while(j<=num);
        }
    }
