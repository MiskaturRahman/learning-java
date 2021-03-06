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
        set(day, month, year);
    }

    public void set(int day, int month, int year) {
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

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void printDate() {
        System.out.println(day + " - " + month + " - " + year);
    }

    public String toString() {
        String str = day + "-" + month + "-" + year;
        return str;
    }

    public boolean equals(Date dd) {
        return day == dd.day && month == dd.month && year == dd.year;
    }
}