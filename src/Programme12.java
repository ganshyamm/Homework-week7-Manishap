import java.util.Scanner;

public class Programme12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");//input value is alphabet,symbol, or number
        char ch = sc.next().charAt(0);

        if ((ch >=  'a' && ch <= 'z') || (ch >='A' && ch <= 'Z')) {
            System.out.println(ch + "is A ALPHABET :");
        }else if (ch >='0'  &&  ch <='9'){
            System.out.println(ch+ "is A NUMBER :");
        }else {
            System.out.println(ch+ "is A SYMBOL :");
        }

    }

}
