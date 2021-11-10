package L02;

public class complexity {


    public static void my_func(int n) {
        int k = 1;
        int i = 1;
        while (i < n) {
            for (int j = 0; j < k; j++)
                System.out.println("$");
            k++;
            i *= 2;
        }
    }
}
