class MyEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

}

public class accessModifier {
    public static void main(String[] args) {
        MyEmployee Misk = new MyEmployee();
        // Misk.id = 45;
        // Misk.name = "Miskatur"; --> Throws an error due to private access modifier
        Misk.setName("Miskatur");
        System.out.println(Misk.getName());
        Misk.setId(234);
        System.out.println(Misk.getId());
    }
}