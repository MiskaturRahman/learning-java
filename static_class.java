
public class static_class {

    private static String name = "";

    public final double PI = 3.14;

    public static_class() {
        name = "Afiq";
    }

    public static void greetings() // Static member function => Shared
    {

        System.out.println(name);
    }

    public void greetings2(String name) // Memeber function
    {
        this.name = name;
        System.out.println("HI " + name);
    }

    public boolean equals(static_class w4) {
        return name == w4.name;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        static_class.greetings();

        static_class obj1 = new static_class();
        static_class obj2 = new static_class();

        System.out.println(obj1);
        System.out.println(obj2);

        if (obj1.equals(obj2))
            System.out.println("Equals");
        else
            System.out.println("Not Equals");

        int x = 10, y = 20;

        swap(x, y);
        System.out.println(x + " , " + y);

    }

}