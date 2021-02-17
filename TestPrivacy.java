public class TestPrivacy {
    private int x;
    String s;
    Date d1;

    public TestPrivacy() {
        x = 10;
        s = new String("Hi");
        d1 = new Date();
    }

    public int getX() {
        return x;
    }

    public String returnS() {
        return s;
    }

    public Date getDate() {
        return new Date(d1.getDay(), d1.getMonth(), d1.getYear());
    }

    public String toString() {
        return s + "," + x + "," + d1;
    }

    public static void main(String[] args) {
        TestPrivacy testPrivacy = new TestPrivacy();
        System.out.println(testPrivacy);

        int xx = testPrivacy.getX();
        xx += 10;
        String s2 = testPrivacy.returnS();
        // s2[1] = 'B';
        Date d2 = testPrivacy.getDate();
        // d2.setMonth(10);

        System.out.println(testPrivacy);
    }
}
