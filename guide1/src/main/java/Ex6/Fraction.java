package Ex6;

public class Fraction {

    private int dividend;
    private int divisor;

    public Fraction(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public Fraction add(Fraction f){
        return simplify((this.dividend * f.getDivisor()) + (f.getDividend() * this.divisor),this.divisor * f.getDivisor());
    }

    public Fraction sub(Fraction f){
        return simplify((this.dividend * f.getDivisor()) - (f.getDividend() * this.divisor),this.divisor * f.getDivisor());
    }

    public Fraction add(int number){
        return add(new Fraction(number, 1));
    }

    public Fraction mul(Fraction f){
        return simplify(this.dividend * f.getDividend(), this.divisor * f.getDivisor());
    }

    public Fraction div(Fraction f){
        return simplify(this.dividend * f.getDivisor(), this.divisor * f.getDividend());
    }

    public float asFloat(){
        return (float) this.dividend / this.divisor;
    }

    public boolean equals(Fraction f){
        return (this.dividend * f.getDivisor() == this.divisor * f.getDividend());
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public int getDividend() {
        return dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    private Fraction simplify(int dividend, int divisor){
        return new Fraction(dividend / gcd(dividend,divisor), divisor / gcd(dividend,divisor));
    }
}
