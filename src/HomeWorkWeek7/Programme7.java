package HomeWorkWeek7;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class Programme7 {
    static int salesId, salesAmount, basicSalary;
    static double commision;
    static String sellerName;

    public static void main(String[] args) { info();

    }

    public static void info() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter salesId:");
        salesId = sc.nextInt();
        System.out.println("Enter sellerName:");
        sellerName = sc.next();
        System.out.println("Enter salesAmount:");
        salesAmount = sc.nextInt();
        System.out.println("Enter basicSalary:");
        basicSalary = sc.nextInt();

        if (salesAmount >= 50000) {
            commision = (salesAmount * 35) / 100;
            System.out.println("seller commision is : +commision");
        } else if (salesAmount >= 30000) {
            commision = (salesAmount * 20 / 100);
            System.out.println("seller commision is: +commision");
        } else if (salesAmount >= 20000) {
            commision = (salesAmount * 10 / 100);
            System.out.println("seller commision is: +commision");

        } else if (salesAmount >= 10000) {
            commision = (salesAmount * 5 / 100);
            System.out.println("seller commision is: +commision");
        } else if (salesAmount >= 10000) {
            commision = (salesAmount * 2 / 100);
            System.out.println("seller commision is: +commision");

        }

    }

}
