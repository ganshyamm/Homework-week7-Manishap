package HomeWorkWeek7;

import java.util.Scanner;

public class Programme4 {
        public static void main(String[] args) {
            System.out.println("Enter year:");
            Scanner obj = new Scanner(System.in);
            int m = obj.nextInt();
            Programme4 n = new Programme4();
            boolean s = n.isLeapYear(m);
            // System.out.println(s);
            System.out.println("Enter month");
            int month = obj.nextInt();
            int a = obj.nextInt(month);
            System.out.println(a);

            switch (month){
                case 1:
                    System.out.println("january");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
            }

            obj.close();
        }


    public static boolean isLeapYear (int year){
        if(year <= 0 || year > 9999 ){
            System.out.println("Invalid Value");
            return false;
        }
        else if((year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0)){
            System.out.println("Leap Year!");
            return true;

        }
        else{
            System.out.println("Not a leap year:");
            return false;
        }





    }
}


