public class Color {
    private int red;
    private int green;
    private int blue;

    public Color() {
        set(0, 0, 0);
    }

    public Color(int red, int green, int blue) {
        set(red, green, blue);
    }

    public void setBlue(int blue) {
        this.blue = (blue >= 0 && blue <= 255) ? blue : 0;
    }

    public void setRed(int red) {
        this.red = (red >= 0 && red <= 255) ? red : 0;
    }

    public void setGreen(int green) {
        this.green = (green >= 0 && green <= 255) ? green : 0;
    }

    public void set(int red, int green, int blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

    public int getBlue() {
        return this.blue;
    }

    public int getRed() {
        return this.red;
    }

    public int getGreen() {
        return this.green;
    }

    public String toString() {
        return "RGB Color is: (" + this.red + ", " + this.green + "," + this.blue + ")";
    }
}
