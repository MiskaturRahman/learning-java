public class DateDriver {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(20, 01, 2021);

        // Prints numbers
        date1.printDate();
        date2.printDate();

        // Prints string representation
        System.out.println(date1);
        System.out.println(date2);

        // boolean value if dates are same
        if (date1.equals(date2))
            System.out.println("Same Date!");
        else
            System.out.println("Not same Date!");

        // creating a new date without constructor
        date2.set(10, 10, 2021);
    }
}
