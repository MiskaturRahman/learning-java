class MyMainEmployee {
    private int id;
    private String name;

    // This is the constructor with value
    public MyMainEmployee() {
        id = 0;
        name = "Your-Name-Here";
    }

    // This is the constructor with value provider
    public MyMainEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public MyMainEmployee(String myName) {
        id = 1;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }

}

public class constructor {
    public static void main(String[] args) {
        MyMainEmployee Misk = new MyMainEmployee("Miskatur", 12);
        // MyMainEmployee Misk = new MyMainEmployee();
        // Misk.setName("Miskatur");
        // Misk.setId(34);
        System.out.println(Misk.getId());
        System.out.println(Misk.getName());
    }
}