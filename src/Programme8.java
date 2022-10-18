import java.util.Objects;
import java.util.Scanner;

public class Programme8 {

    public static void main(String[] args) {
        Scanner city = new Scanner(System.in);
        System.out.println("write first letter of city from(A to F only)");
        String a = city.nextLine();
        if (Objects.equals(a.toUpperCase(),"A")){
            System.out.println("City is Alsterdam");

        } else if (Objects.equals(a.toUpperCase(),"B")) {
            System.out.println("City is Birmingham");

        } else if (Objects.equals(a.toUpperCase(),"C")) {
            System.out.println("City is Cardiff ");

        } else if (Objects.equals(a.toUpperCase(),"D")) {
            System.out.println("City is Devon");

        } else if (Objects.equals(a.toUpperCase(),"E")) {
            System.out.println("City is Edinburgh");

        } else if (Objects.equals(a.toUpperCase(), "F")) {
            System.out.println("City of Florida");
        }else {
            System.out.println("Error: Invalid Entry");
        }
    }
}
