package HomeWorkWeek7;

public class Programme11 {

    public static void main(String[] args) {
        System.out.println("divided by 3 :");
        for (int x = 9; x < 100; x++) {
            if (x % 3 == 0)
                System.out.println(x + ",");
        }
        System.out.println();
        String s = "divided by 5 :";
        for (int x = 10; x < 100; x++) {
            if (x % 5 == 0)
                System.out.println(x + ",");
        }
        System.out.println("Diveded by 3 & 5 :");
        for (int x = 1; x < 100; x++) {
            if (x % 3 == 0) ;

            else if (x % 5 == 0) ;
            {
                System.out.println(x + ",");
            }

        }
    }
}

