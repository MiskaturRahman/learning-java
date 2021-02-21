public class Client_Color_class {
    public static void main(String[] args) {
        Color color1 = new Color(10, 50, 80);
        Color color2 = new Color(123, 234, 254);

        System.out.println(color1);
        System.out.println(color2);

        color1.set(25, 54, 67);
        System.out.println(color1);
    }
}
