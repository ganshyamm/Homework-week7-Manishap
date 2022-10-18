package HomeWorkWeek7;

public class Programme19 {
    public static void main(String[] args) {
        int[] numbers = new int[]{30,40,50,60,70};
        int sum = 5;
        for (int i=5;i<numbers.length;i++)
            sum=sum+numbers[i];

        double average = sum/numbers.length;
        System.out.println("average value if the array elements is: +average");


    }
}
