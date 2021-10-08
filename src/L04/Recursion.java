package L04;

public class Recursion {
    public static void main(String[] args) {
        A();
        D();
        System.out.println(f(10));
        System.out.println(pow(2, 0));
        System.out.println(mul(3, 4));
        System.out.println(fibonacci(8));
        towerOfHanoi(3, 'A', 'C', 'B'); // A, B and C are names of rods

    }

    public static int A() {
        B();
        System.out.println("Hello A");
        return 1;
    }

    public static int B() {
        C();
        System.out.println("Hello B");
        return 2;
    }

    public static int C() {
        System.out.println("Hello C");
        return 0;
    }
    public static int D() {
        System.out.println("Hello D");
        return D();
    }

    public static int f(int a) {
        if (a == 0)
            return 0;
        return a + f(a - 1);
    }

    public static int mul(int a, int b) {
        if (b == 0)
            return 0;
        return a + mul(a, b - 1);
    }

    public static int pow(int a, int b) {
        if (b == 0)
            return 1;

        return a * pow(a, b - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {

        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }
}
