public class Client_Color_class {
    public static void main(String[] args) {
        // From TestModifiers file
        Color color1 = new Color(10, 50, 80);
        Color color2 = new Color(123, 234, 254);

        System.out.println(color1);
        System.out.println(color2);

        color1.set(25, 54, 67);
        System.out.println(color1);

        // From Rational.java file
        Rational r1 = new Rational(1, 5);
        Rational r2 = new Rational(2, 3);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("adding " + r1 + " to " + r2);
        r1.add(r2);

        System.out.println(r1);
        System.out.println(r2);
    }
}
