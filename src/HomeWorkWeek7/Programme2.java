package HomeWorkWeek7;

import java.util.Scanner;

public class Programme2 {
    public static void main(String[] args) {
        int year = 2018;
        boolean leap = false;
        Scanner obj = new Scanner(System.in);
        if (year % 4 == 0)//A year divided by 4 is leap year
        {
            if (year % 100 == 0)// it is centenary year if the value is divided by 100
            {
                if (year % 400 == 0) ;
                leap = true;
            }

            {

                if (leap)
                    System.out.println(year + "is a leap year");
                else
                    System.out.println(year + " is not a leap year");


            }


        }
    }
}
