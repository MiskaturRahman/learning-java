public class Date {
    private int month;
    private int day;
    private int year;
    int var;

    public Date() {
        day = 1;
        month = 1;
        year = 2000;
    }

    public Date(int day, int month, int year) {

        if ((day >= 1) && (day <= 31))
            this.day = day;
        else
            System.out.println("Invalid Date");

        if ((month >= 1) && (month <= 12))
            this.month = month;
        else
            System.out.println("Invalid Month");

        if ((year >= 1111) && (year <= 9999))
            this.year = year;
        else
            System.out.println("Invalid Year");
    }

    public void printDate() {
        System.out.println(day + " - " + month + " - " + year);
    }

    public String toString() {
        String str = day + "-" + month + "-" + year;
        return str;
    }
}