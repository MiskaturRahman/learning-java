class Circle {
    public static final double PI = 3.14159;
    private int radius = 0;

    public void setRadius(int r) {
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void area() {
        double a = radius * radius * PI;
        System.out.println("area: " + a);

    }
}