public class FindDup {
    public static void main(String[] args){
        int num[]={10,20,30,20,80,90,40,10,50,60,50};
        int temp;
        System.out.print(" Duplicate value in array is : ");
        for(int i=0;i<num.length;i++){
            for (int j= i+1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    temp = num[i];
                    System.out.print(temp + " ");
                }
            }
        }
    }
}
