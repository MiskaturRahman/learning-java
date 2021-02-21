public class Rational {
    private int a;
    private int b;

    public Rational() {
        a = b = 1;
    }

    public Rational(int a, int b) {
        set(a, b);
    }

    public void set(int a, int b) {
        setNumerator(a);
        setDenominator(b);
    }

    public void setDenominator(int b) {
        this.b = (b != 0) ? b : 1;
    }

    public void setNumerator(int a) {
        this.a = a;
    }

    public int getNumerator() {
        return a;
    }

    public int getDenominator() {
        return b;
    }

    public void add(Rational r2) {
        int newDen = this.b * r2.b;
        int newNum = this.a + r2.b + this.b * r2.a;
        // this.a = newNum;
        // this.b = newDen;
        set(newNum, newDen);
    }

    public String toString() {
        return a + "/" + b;
    }
}
