public class Fraction {
    private int numerator = 0;
    private int denominator = 1;
    Fraction(int numerator, int denominator, boolean check) {
        if (check) System.out.println("1: I am constructor with numerator " + numerator + " denominator " + denominator);
        if (denominator == 0) {
            System.out.println("Divide by zero!!!");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }
    Fraction(int numerator, int denominator) {
        this(numerator, denominator, true);
    }

    Fraction(int numerator) { // numerator/1 7/1
        this.numerator = numerator;
        System.out.println("2: I am constructor with numerator " + numerator);
    }

    Fraction() {
        System.out.println("3: I am an empty constructor");
    }

    Fraction(String uiiii) {
        String[] fraction = uiiii.split("/");
        if (fraction.length == 2) {
            numerator = Integer.parseInt(fraction[0]);
            denominator = Integer.parseInt(fraction[1]);
        }
        else{
            fraction = uiiii.split("\\.");
            if (fraction.length == 2) {
                numerator = Integer.parseInt(fraction[1]);
                denominator = 10;
                for (int i = 0; i < fraction[1].length(); i++) {
                    denominator *= 10;
                }
                denominator /= 10;
            }
            else {
                fraction = uiiii.split(",");
                numerator = Integer.parseInt(fraction[1]);
                denominator = 10;
                for (int i = 0; i < fraction[1].length(); i++) {
                    denominator *= 10;
                }
                denominator /= 10;
            }
        }
        normalize();
        System.out.println("4: I am constructor with real fraction " + numerator + "/" + denominator);
    }


    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    double toDecimal() {
        return (double) numerator / denominator;
    }

    private int getGcd() {
        int a = numerator;
        int b = denominator;
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    void normalize() { // НОД - Наибольший Общий Делитель и НОК - Наименьшее Общее Кратное
        int gcd = getGcd();
        numerator /= gcd;
        denominator /= gcd;
    }
    public Fraction sum(Fraction fraction){
        int numerator = this.numerator;
        int denominator = this.denominator;
        int fracnumerator = fraction.numerator;
        int fracdenominator = fraction.denominator;
        if (denominator != fracdenominator){
            numerator *= fracdenominator;
            fracnumerator *= denominator;
            denominator *= fracdenominator;
        }
        Fraction fract = new Fraction(numerator + fracnumerator, denominator, false);
        return fract;
    }
    public Fraction mult(Fraction fraction){
        Fraction fract = new Fraction(numerator * fraction.numerator, denominator * fraction.denominator, false);
        return fract;
    }
}
