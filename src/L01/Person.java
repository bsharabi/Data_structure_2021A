package L01;

abstract public class Person implements MyActions {

    private String name;
    private String lastName;
    private final String id;
    private double age;

    //-------------------Setter %% Getter---------------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public double getAge() {
        return age;
    }

    //---------------------------------------------------------------------
    //----------------------------Constructor--------------------------
    public Person(String name, String lastName, String id, double age) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    //---------------------------------------------------------------------
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
class Student extends Person implements MyActions {
    private String universityName;

    public Student(String name, String lastName, String id, double age, String universityName) {
        super(name, lastName, id, age);
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String eat() {
        return ("I'm eating now " + getName());
    }

    @Override
    public String drinkUp() {
        return ("I'm drinking now " + getName());
    }

    @Override
    public String practice() {
        return ("I'm practicing now " + getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "universityName='" + universityName + '\'' +
                '}'+"\n" + super.toString();
    }
}
class Employee extends Person implements MyActions {

    private String workplaceName;

    public String getWorkplaceName() {
        return workplaceName;
    }

    public void setWorkplaceName(String workplaceName) {
        this.workplaceName = workplaceName;
    }

    public Employee(String name, String lastName, String id, double age, String workplaceName) {
        super(name, lastName, id, age);
        this.workplaceName = workplaceName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "workplaceName='" + workplaceName + '\'' +
                '}'+super.toString();
    }

    @Override
    public String eat() {
        return ("I'm eating now " + getName());
    }

    @Override
    public String drinkUp() {
        return ("I'm drinking now " + getName());
    }

    @Override
    public String practice() {
        return ("I'm practicing now " + getName());
    }
}