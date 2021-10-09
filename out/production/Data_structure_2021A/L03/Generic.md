# Overloading

```java

class Main {
    static boolean IsEq(int n1, int n2) {
        return n1 == n2;
    }


    static boolean IsEq(String n1, String n2) {
        return n1 == n2;
    }


    static boolean IsEq(boolean n1, boolean n2) {
        return n1 == n2;
    }

    public static void main(String[] args) {

        System.out.println(IsEq(2, 2));
        System.out.println(IsEq("bob", "bob"));
        System.out.println(IsEq(true, true));

    }
}

```

# Generic

```java



class Main {
    static <T> void IsEq(T n1, T n2) {
        System.out.println("n1 = " + n1 + " , n2 = " + n2);
    }

    public static void main(String[] args) {
        IsEq(2, 2);
        IsEq("bob", "bob");
        IsEq(true, true);

    }
}


```

output:

```
n1 = 2 , n2 = 2
n1 = bob , n2 = bob
n1 = True , n2 = True
```

# Generics - withe few types - implicit call

```java


class Main {
    static <T, S> void IsEq(T n1, S n2) {
        System.out.println("n1 = " + n1 + " , n2 = " + n2);
    }

    public static void main(String[] args) {
        //IS CALLED AS: static void IsEq<int,String>(int n1, string n2)
        IsEq(2, "bob");

        //IS CALLED AS: static void IsEq<String,boolean>(string n1, bool n2)
        IsEq("bob", false);

    }
}


```

output:

```
n1 = 2 , n2 = bob
n1 = bob , n2 = False
```

# Generic - with rules

```java


class Person {
}

class Student extends Person {
}

class Cat {
}


class Main {

    /*
        T must be or class "Person" or a sub-class of "Person"
    */
    static <T> void Test(Person n1) {

    }

    public static void main(String[] args) {
        Test(new Person());
        Test(new Student());
        //Test(new Cat());  --> COMPILATION ERROR

    }
}


```

# Generic class

```java

class Sms<T> {
    public String PhoneAddressee;
    public T Msg;

    public void SendSms() {
        System.out.println("Sending to " + PhoneAddressee + ", msg: " + Msg);
    }
}


class Main {
    public static void main(String[] args) {

        Sms<Integer> sms1 = new Sms<>();
        sms1.Msg = 3;
        sms1.PhoneAddressee = "0553335566";
        sms1.SendSms();

        Sms<String> sms2 = new Sms<>();
        sms2.Msg = "HAVE A PERFECT DAY";
        sms2.PhoneAddressee = "0551115566";
        sms2.SendSms();

    }
}


```

output:

```
Sending to 0553335566, msg: 3
Sending to 0551115566, msg: HAVE A PERFECT DAY
```

# Generic class - implicit call

```csharp

    class Sms<T>
    {
        public string PhoneAddressee;
        public T Msg;


        public Sms(T msg)
        {
            Msg=msg;
        }
        
        public void SendSms()
        {
            System.Console.WriteLine($"Sending to {PhoneAddressee}, msg: {Msg}");
        }
    }


    class MyFirstGenericClass
    {
        public static void main(String[] args)
        {

            Sms<int> sms1 = new Sms(3);
            sms1.PhoneAddressee = "0553335566";
            sms1.SendSms();

            Sms<string> sms2 = new Sms("HAVE A PERFECT DAY");
            sms2.PhoneAddressee = "0551115566";
            sms2.SendSms();

        }
    }


```

output:

```
Sending to 0553335566, msg: 3
Sending to 0551115566, msg: HAVE A PERFECT DAY
```

# Generic class - explicit call

```csharp
namespace _02_generics
{
    class Sms<T>
    {
        public string PhoneAddressee { get; set; }
        public T Msg { get; set; }


        public Sms(T msg)
        {
            Msg=msg;
        }
        
        public void SendSms()
        {
            System.Console.WriteLine($"Sending to {PhoneAddressee}, msg: {Msg}");
        }
    }


    class Program
    {
        static void Main(string[] args)
        {

            Sms<int> sms1 = new Sms<int>(3);
            sms1.PhoneAddressee = "0553335566";
            sms1.SendSms();

            Sms<string> sms2 = new Sms<string>("HAVE A PERFECT DAY");
            sms2.PhoneAddressee = "0551115566";
            sms2.SendSms();

        }
    }
}

```

output:

```
Sending to 0553335566, msg: 3
Sending to 0551115566, msg: HAVE A PERFECT DAY
```
