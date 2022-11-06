import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(new Scanner(System.in).next());
        Fraction fraction2 = new Fraction(new Scanner(System.in).next());
        System.out.println("Fraction №1 = " + fraction);
        System.out.println("Fraction №2 = " + fraction2);
        System.out.println("The sum of fraction №1 (" + fraction + ") and fraction №2 (" + fraction2 + ") = " + fraction.sum(fraction2));
        System.out.println("The multiplication  of fraction №1 (" + fraction + ") and fraction №2 (" + fraction2 + ") = " + fraction.mult(fraction2));
    }
}