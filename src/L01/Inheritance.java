package L01;

import static java.lang.System.out;

public class Inheritance {
    public static void main(String[] args) {
        out.println("-------------------------------------");
        A a = new A();
        B b = new B();
        C c = new C();
        out.println("-------------------------------------");
        A a1 = new A();
        A b1 = new B();
        A c1 = new C();
        out.println("-------------------------------------");
        A a2 = new A();
        B b2 = new B();
        B c2 = new C();
        A[] arr = {a, b, c, a1, b1, c1, a2, b2, c2};
    }
}

class A {
    //----------------------------Constructor--------------------------
    public A() {
        System.out.println("Hello A");
    }
}

class B extends A {
    //----------------------------Constructor--------------------------
    public B() {
        System.out.println("Hello B");
    }
}

class C extends B {
    //----------------------------Constructor--------------------------
    public C() {
        System.out.println("Hello C");
    }
}