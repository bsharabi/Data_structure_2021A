package L02;

public class CountArray {
    public static int countArray(int[] a){
        int cnt=0;
        while(a.length>++cnt);
        return cnt;

    }
    public static void main(String[] args) {
        // define original array
        int[] a = {10, 20, 30, 40, 50, 60,70,80,90};
        int cnt= countArray(a);
        System.out.println(cnt);
    }
}
