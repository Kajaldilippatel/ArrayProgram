//Program to sort numeric array and a string array
public class SortNumStr {
    public static void main(String[] args) {
        int num[] = {20, 10, 40, 50, 30,35,25,15};
        String str[]={"kajal","patel","java","hello","world"};
        int temp;
        for(int i=0;i<num.length;i++){
        for (int j= i+1; j < num.length; j++) {
            if (num[i] > num[j]) {
                temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
        }
        System.out.println(" Atfer Sorting no are : ");
        int k=0;
        do{
            System.out.print(num[k]+ " ");
            k++;
        }while(k<num.length);
        //Sort String
        String temp1;
        for(int i=0;i<str.length;i++){
            for (int j= i+1; j < str.length; j++) {
                if (str[i].compareTo(str[j])>0) {
                    temp1 = str[i];
                    str[i] = str[j];
                    str[j] = temp1;
                }
            }
        }
        System.out.println();
        System.out.println(" After sorting String Array is : ");
        int k1=0;
        do{
            System.out.print(str[k1]+ " ");
            k1++;
        }while(k1<str.length);
    }
}
