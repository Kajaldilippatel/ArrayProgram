//program to test equality of two array
public class EqualityArray {
    public static void main(String[] args) {
        int num1[] = {10, 20,30, 40, 50};
        int num2[] = {10, 20,40, 50,60};
        int flag = 0;
        if (num1.length == num2.length) {
            for (int i = 0; i < num1.length; i++) {
                    if (num1[i] != num2[i]) {
                        flag = 1;
                    }
            }
            }else{
            flag=1;
               // System.out.print(" Array not Equal...... ");
            }
            if (flag == 0) {
                System.out.print(" Array Are Equal ");
            }
           else{System.out.print(" Array not Equal ");}
        }
    }
