class new_Employee {
    int id;
    int salary;
    String name;

    public void Details() {
        System.out.println("My id is: " + id);
        System.out.println("My name is: " + name);

    }

    public int Salary() {
        return salary;
    }
}

public class simple_java_class {
    public static void main(String[] args) {
        System.out.println("This is a simple class");

        new_Employee Miskatur = new new_Employee();// Instantiating
        new_Employee Bro = new new_Employee();// Instantiating

        // Setting Attributes
        Miskatur.id = 1;
        Miskatur.name = "Misk";

        Bro.id = 2;
        Bro.name = "Brother";
        Bro.salary = 20;

        // Printing the Attributes
        Miskatur.Details();
        Bro.Details();

        int salary = Bro.Salary();
        System.out.println(salary);
    }
}
