public class DateDriver {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(23, 1, 2021);

        date1.printDate();
        date2.printDate();
        System.out.println(date1);
        System.out.println(date2);

    }
}
