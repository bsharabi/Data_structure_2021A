package L02;
class Student
{
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}
public class AccessingAnArray {
    public static void main (String[] args)
    {
        // declares an Array of integers.
        int[] arr;

        // allocating memory for 5 integers.
        arr = new int[5];

        // initialize the first elements of the array
        arr[0] = 10;

        // initialize the second elements of the array
        arr[1] = 20;

        //so on...
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i +
                    " : "+ arr[i]);


        //------------------------------------------------------------------------

        Student arrS[];

        arrS = new Student[5];

        arrS[0] = new Student(1,"Bob");
        arrS[1] = new Student(2,"Alice");
        arrS[2] = new Student(3,"Shir");
        arrS[3] = new Student(4,"Maayan");
        arrS[4] = new Student(5,"Nofar");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : " +
                    arrS[i].roll_no +" "+ arrS[i].name);

    }
}
