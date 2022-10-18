package HomeWorkWeek7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Programme17 {
    public static void main(String[] args) {
        int[] num = {53, 43, 13, 33, 23,};
        String [] strings ={"book","table","glass","box"};
        System.out.println("numeric array :"+ Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("sorted numeric array:"+Arrays.toString(num));

        System.out.println("String array :"+ Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println("sorted string array:" + Arrays.toString(strings));


    }
}
