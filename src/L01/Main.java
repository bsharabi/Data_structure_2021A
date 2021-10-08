package L01;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        String[] name = {"Barak", "Naor", "Bob", "Alice"};
        String[] lastName = {"Sharabi", "Novo", "Koren", "Dror"};

        Person stud = new Student(name[0], lastName[0], "123456789", 20.5, "Ariel");
        Student stud2 = new Student(name[1], lastName[1], "123456789", 21.5, "Ariel");
        Person emp = new Employee(name[2], lastName[2], "123456789", 22.5, "U_Ariel");
        Employee emp2 = new Employee(name[3], lastName[3], "123456789", 23.5, "U_Ariel");
        out.println("-------------------------------------");
        out.println(stud);
        out.println(stud2);
        out.println(stud2.eat());
        out.println("-------------------------------------");

        MyActions[] ar = {
                new Student(name[0], lastName[0], "123456789", 20.5, "Ariel"),
                new Student(name[1], lastName[1], "123456789", 21.5, "Ariel"),
                new Employee(name[2], lastName[2], "123456789", 22.5, "U_Ariel"),
                new Employee(name[3], lastName[3], "123456789", 23.5, "U_Ariel")
        };

        Person[] arPer = {
                new Student(name[0], lastName[0], "123456789", 20.5, "Ariel"),
                new Student(name[1], lastName[1], "123456789", 21.5, "Ariel"),
                new Employee(name[2], lastName[2], "123456789", 22.5, "U_Ariel"),
                new Employee(name[3], lastName[3], "123456789", 23.5, "U_Ariel")
        };
        out.println("-------------------------------------");
        out.println(ar[3]);
        out.println(ar[1]);
        out.println(ar[0].eat());
        out.println("-------------------------------------");

        out.println("-------------------------------------");
        out.println(arPer[3]);
        out.println(arPer[1]);
        out.println(arPer[0].eat());
        out.println("-------------------------------------");


    }
}
