package HomeWorkWeek7;

public class Programme1 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("odd Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);

            }
        }
        System.out.println("Even Numbers:");
        for (int i= 0; i<a.length; i++){
            if (a[i]%2==0){
                System.out.println(a[i]);
            }

        }
    }

}
