//Program to Find common element between two array
public class CommonInArray {
    public static void main(String[] args){
        String ary1[]={"Hello","World","kajal","patel","Cool"};
        String ary2[]={"Java","hello","London","kajal","Hello","Cool"};
        String temp;
        System.out.print(" Common elements  in  two array is : ");
        for(int i=0;i<ary1.length;i++){
            for (int j= 0; j < ary2.length; j++) {
                if (ary1[i] == ary2[j]) {
                    temp = ary1[i];
                    System.out.print(temp + " ");
                }
            }
        }
    }
}
