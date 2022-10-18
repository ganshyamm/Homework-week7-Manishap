package HomeWorkWeek7;

import com.sun.org.apache.xml.internal.utils.QName;

import javax.naming.Name;
import java.util.Scanner;
import java.util.jar.Attributes;

public class Programme5 {
    public static void main(String[] args) {
        int Salary, HRA, DA, TA, PF, GROSSSALARY;

        Scanner slip = new Scanner(System.in);

        System.out.println("Salary Slip: ");
        Salary = slip.nextInt();

        System.out.println("Employee id");
        int n = slip.nextInt();

        System.out.println("Employee name");
        String name = slip.next();

        System.out.println("Enter Basic Salary");
        Salary = slip.nextInt();

        HRA = Salary * 10 / 100;
        System.out.println("HRA " + HRA);

        TA = Salary * 8 / 100;
        System.out.println("TA" + TA);

        DA = Salary * 9 / 100;
        System.out.println("DA" + DA);

        PF = Salary * 20 / 100;
        System.out.println("PF" + PF);
        GROSSSALARY = Salary + HRA + TA + DA - PF;
        System.out.println("GROSSSALARY:    " + GROSSSALARY);
    }

    {
        System.out.println("_______________________________________");
        System.out.println("|         Salary slip                 |");
        System.out.println("|                                     |");
        System.out.println("|_____________________________________|");
        System.out.println("| Employee Id       :" + 2564 + "     |");
        System.out.println("| Employee Name    :                  |");
        System.out.println("|-------------------------------------|");
        System.out.println("| Basic Salary     :" + 25000.0 +"    |");
        System.out.println("|HRA 10%    :      " + 2500.0 + "     |");
        System.out.println("|TA  8%     :      " + 2250.0 + "     |");
        System.out.println("|DA  9%     :      " + 2000.0 + "     |");
        System.out.println("|PF-20&     :      " + 5000.0 + "     |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Gross Salary:      "+ 26750.0+"      |");
        System.out.println("|=====================================|");

    }
}