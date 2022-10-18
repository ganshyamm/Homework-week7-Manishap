package HomeWorkWeek7;

import java.util.Scanner;

public class Programme3 {
    public static void main(String[] args) {
        String name, result, Grade;
        int RollNo, Maths, Science, English, Total, percentage, Marks;

        Scanner report = new Scanner(System.in);
        System.out.println("please enter your name:");
        name = report.nextLine();

        System.out.println("Please enter your roll no.");
        RollNo = report.nextInt();

        System.out.println("please enter your Maths Marks:");
        Maths = report.nextInt();

        System.out.println("Please enter your Science Marks:");
        Science = report.nextInt();

        System.out.println("please enter your English Marks:");
        English = report.nextInt();

        Total = Maths + Science + English;
        if (Maths >= 0 && Maths <= 100 && Science >=0 && Science <= 100 && English >= 0 && English <= 0);
        percentage = Total / 3;

        if (Maths >= 35 && Science >=35 && English >=35 ){
            result = "pass";

        }else {
            result = "fail";

        }
        Grade = report.nextLine();
        if (percentage >= 80) {
            Grade = "A+";

        } else if (percentage >= 60) {
            Grade = "A";

        } else if (percentage >=50) {
            Grade = "B";

        } else if (percentage >= 35) {
            Grade = "c";

        }
        System.out.println("--------------------------------------");
        System.out.println("|                                    |");
        System.out.println("|            Mark Sheet              |");
        System.out.println("|_____________________________________|");
        System.out.println("|       Name    :" + name +"          |");
        System.out.println("|       RollNo  : "+ RollNo +"        |");
        System.out.println("|-------------------------------------|");
        System.out.println("|       Subject : Marks               |");
        System.out.println("|-------------------------------------|");
        System.out.println("|       Maths    :" + Maths +"        |");
        System.out.println("|       Science  :" + Science +"      |");
        System.out.println("|       English  :" + English +"      |");
        System.out.println("|-------------------------------------|");
        System.out.println("|      Total     :" + Total +"        |");
        System.out.println("|-------------------------------------|");
        System.out.println("|     percentage :" + percentage + "  |");
        System.out.println("|     Result     :" + result +"       |");
        System.out.println("|     Grade      :" + Grade +"       |");

    }

}



