import java.util.Scanner;

public class LargeststringPrint {
    static void main() {
        Scanner input=new Scanner(System.in);
        String[] arr={"aaaa","apple","banana","mango"};
        String largest=arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(largest.compareTo(arr[i])<0){

                largest=arr[i];


            }




        }
        System.out.println("The largest String is : "+largest);
        System.out.println("The largest String is : "+largest);















    }
}
