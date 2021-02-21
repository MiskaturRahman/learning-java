public class TestModifiers {
    public static int a = 0;
    public static final int aa = 10;

    private static int b = 0;
    private static final int bb = 100;

    public TestModifiers() {
        a = 1;
        b = -1;
    }

    public void show() {
        System.out.println("a: " + a);
        System.out.println("aa: " + aa);
        // showAll(); can call a static method in non-static

    }

    public static void showAll() {
        // show();Cannot make a static reference to the non-static method show() from
        // the type TestModifiers
        System.out.println("b: " + b);
        System.out.println("bb: " + bb);
    }
}
