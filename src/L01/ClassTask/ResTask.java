package L01.ClassTask;

import java.util.Random;
import java.util.Scanner;

public class ResTask {

    public static void main(String[] args) {
        byte lenarr, num2;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();//מספר רנדומלי לתוך משתנה R
//        int x = r.nextInt(9);
//        int y =  r.nextInt(5);
        int x = 4;
        int y = 3;
        lenarr = (byte) x;
        int[] arr = new int[lenarr];
        num2 = (byte) y;
        for (int i = 0; i < lenarr; i++) {
            arr[i] += i * num2;
        }
        System.out.println("Num of mul " + num2);
        System.out.println("Num of elements " + lenarr);
        for (int i = 0; i < lenarr; i++) {
            System.out.printf("%d ",arr[i]);
        }
        System.out.println();



    }
}
