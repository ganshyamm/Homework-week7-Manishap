package HomeWorkWeek7;

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        String x = letter.nextLine();

        switch (x.toUpperCase()){
            case "A" :
                System.out.println("City is Atlanta");
                break;
            case "B" :
                System.out.println("City is Birmingham");
                break;
            case "C" :
                System.out.println("City is Cardiff");
                break;
            case "D" :
                System.out.println("City is Devon");
                break;
            case "E" :
                System.out.println("City is Edinburgh");
                break;
            case "F" :
                System.out.println("City is Florida");
                break;

            default:
                System.out.println("Error: Invalid entry");




        }


    }
}

