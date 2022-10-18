package HomeWorkWeek7;

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        oddeven();

    }
    public static void oddeven(){
        met1();
    }

    public static  void met1(){
        Scanner sc = new Scanner(System.in);
        int x;
        String output;
        System.out.println("Enter any number");
        x = sc.nextInt();
        if (x%6==0){
            System.out.println("Enter number is Even");
        }else {
            System.out.println("Enter number is odd");


        }

    }



}
