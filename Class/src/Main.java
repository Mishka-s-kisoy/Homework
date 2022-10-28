import java.util.*;
import java.util.Scanner;
import java.lang.Override;
abstract class Figure {
    public abstract double area();
    public abstract double perimeter();
    public abstract void draw();
}
class Oval extends Figure{
    int r;
    public Oval(int r) {this.r = r;}
    @Override
    public double area() {
        return 3.14159265 * (double)this.r * this.r;
    }
    @Override
    public double perimeter() {
        return 3.14159265 * (double)this.r * 2;
    }

    public void read() {
        this.r = new Scanner(System.in).nextInt();
    }
    @Override
    public void draw() {
        for (int i = 0; i < 2 * this.r + 1; i++) {
            for (int j = 0; j < 2 * this.r + 1; j++) {
                if (((i - this.r) * (i - this.r)) + ((j - this.r) * (j - this.r)) <= r * this.r) {
                    System.out.print("#");
                }
                else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
class HollowOval extends Oval {
    Boolean check(int x, int y) {
        Boolean flag1 = (x - r) * (x - r) + (y - r) * (y - r) <= r * r;
        Boolean flag2 = (x - 1 - r) * (x - 1 - r) + (y - r) * (y - r) <= r * r;
        Boolean flag3 = (x - r) * (x - r) + (y - 1 - r) * (y - 1 - r) <= r * r;
        Boolean flag4 = (x + 1 - r) * (x + 1 - r) + (y - r) * (y - r) <= r * r;
        Boolean flag5 = (x - r) * (x - r) + (y + 1 - r) * (y + 1 - r) <= r * r;
        return flag1 && !(flag2 && flag3 && flag4 && flag5);
    }
    HollowOval(int r) {super(r);}
    @Override
    public void draw() {
        for (int i = 0;i < 2 * r + 1;i++) {
            for (int j = 0;j < 2 * r + 1;j++) {
                if (check(i, j)) {
                    System.out.print("#");
                }
                else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
class Triangle extends Figure {
    int h;
    public Triangle(int h) {this.h = h;}

    Boolean check(List<Integer> check1, int a) {
        Boolean res = false;
        for (int i = 0; i < check1.size(); i++) {
            if (check1.get(i) == a) {
                return true;
            }
        }
        return res;
    }
    @Override
    public void draw() {
        List<Integer> h_h = new ArrayList<Integer>();
        int current = 1;
        h_h.add((2 * this.h) / 2 - 1);
        for (int i = 0; i < h; i++) {
            int b = 1;
                for (int j = 0; j < h * 2 - 1; j++) {
                    if (check(h_h, j) && b <= current && (h_h.get(h_h.size() - 1) == j || h_h.get(0) == j)) {
                        System.out.print("#");
                        b++;
                        h_h.add(0, h_h.get(0) - 1);
                        h_h.add(h_h.get(h_h.size() - 1) + 1);
                    }
                    else if (check(h_h, j) && b <= current) {
                        System.out.print("#");
                        b++;
                    }
                    else {
                        System.out.print(".");
                    }
                }
            System.out.println();;
            current += 2;
        }
        System.out.println();
    }
    @Override
    public double area() {
        return (double)h;
    }
    @Override
    public double perimeter() {
        return (double)h;
    }
    void read() {
        h = new Scanner(System.in).nextInt();
    }
}
class HollowTriangle extends Triangle {
    HollowTriangle(int h) {super(h);}
    @Override
    public void draw() {
        List<Integer> h_h = new ArrayList<Integer>();
        int current = 1;
        h_h.add((2 * h) / 2 - 1);
        for (int i = 0; i < h; i++) {
            int b = 1;
            for (int j = 0; j < h * 2 - 1; j++) {
                if ((b <= current && (h_h.get(h_h.size() - 1) == j || h_h.get(0) == j)) || (i == h - 1)) {
                    System.out.print("#");
                if (b == current) {
                    int c = h_h.get(0), d = h_h.get(h_h.size() - 1);
                    h_h.clear();
                    h_h.add(c - 1);
                    h_h.add(d + 1);
                }
                b++;
                }
                else {
                    System.out.print(".");
                }
            }
            System.out.println();
            current = 2;
        }
        System.out.println();
    }
}
class Rectangle extends Figure {
    int w;
    int h;
    public Rectangle(int w, int h) {this.w = w; this.h = h;}
    @Override
    public double area() {
        return (double)w * h;
    }
    @Override
    public double perimeter() {
        return (double)(w + h) * 2;
        }
    void read() {
        w = new Scanner(System.in).nextInt();
        h = new Scanner(System.in).nextInt();;
    }
    @Override
    public void draw() {
    for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
            System.out.print("#");
        }
        System.out.println();
    }
    System.out.println();
    }
}
class HollowRectangle extends Rectangle {
    HollowRectangle(int w, int h) {super(w, h);}
    @Override
    public void draw() {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
                    System.out.print("#");
                }
                else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

public class Main{
    public static void main(String[] args) {
        // Запустите меня, пожалуйста
        // Запустите меня, пожалуйста
        // Запустите меня, пожалуйста
        System.out.println("                   Доброго времени суток, Иван Сергеевич!");
        System.out.println();
        System.out.println();
        System.out.println("                              11111111111111111111");
        System.out.println("                              11111111111111111111");
        System.out.println("      Вас приветствует        111 @@@ 1111 @@@ 111");
        System.out.println("   умная программа пэнтшур    111 @@@ 1111 @@@ 111");
        System.out.println("                              11111111111111111111");
        System.out.println("                     1111        0000       0000");
        System.out.println("                       111111      00000000000");
        System.out.println("                         11111111111111111111111111");
        System.out.println("                                       ");
        System.out.println("Я могу помочь Вам с построением геометрических фигур, таких как:");
        System.out.println("1) Прямоугольник (для этого введите, пожалуйста, в консоль команду 'Rectangle',");
        System.out.println("                  а затем задайте длину и ширину);");
        System.out.println("2) Пустой прямоугольник (для этого введите, пожалуйста, в консоль команду 'HollowRectangle',");
        System.out.println("                         а затем задайте длину и ширину);");
        System.out.println("3) Равносторонний треугольник (для этого введите, пожалуйста, в консоль команду 'Triangle',");
        System.out.println("                               а затем длину равных сторон (один раз));");
        System.out.println("4) Пустой равносторонний треугольник (для этого введите, пожалуйста, в консоль команду 'HollowTriangle',");
        System.out.println("                                      а затем длину равных сторон (один раз));");
        System.out.println("5) Овал (для этого введите, пожалуйста, в консоль команду 'Oval',");
        System.out.println("         а затем меньший радиус);");
        System.out.println("6) Пустой овал (для этого введите, пожалуйста, в консоль команду 'HollowOval',");
        System.out.println("                а затем меньший радиус).");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! НО !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Прежде чем начать вырисовку, введите, пожалуйста, в консоль количество запросов");
        System.out.println("Если Вы хотите увеличить количество запросов, то введите в консоль 'Inputs + ' число (насколько хотите увеличить)");
        System.out.println("Если Вы хотите уменьшить количество запросов, то введите в консоль 'Inputs - ' число (насколько хотите уменьшить)");
        System.out.println("Если Вы хотите прекратить выполнение программы, то введите в консоль 'Quit'");

        Scanner in = new Scanner(System.in);
        int size = 1;
        size = in.nextInt();
        for (int i = 0; i < size; i++){
            String type = in.next();
            if (Objects.equals(type, "Oval")){
                Oval b = new Oval(in.nextInt());
                b.draw();
            }
            else if (Objects.equals(type, "Triangle")){
                Triangle b = new Triangle(in.nextInt());
                b.draw();
            }
            else if (Objects.equals(type, "Rectangle")){
                Rectangle b = new Rectangle(in.nextInt(), in.nextInt());
                b.draw();
            }
            else if (Objects.equals(type, "HollowOval")){
                HollowOval b = new HollowOval(in.nextInt());
                b.draw();
            }
            else if (Objects.equals(type, "HollowTriangle")){
                HollowTriangle b = new HollowTriangle(in.nextInt());
                b.draw();
            }
            else if (Objects.equals(type, "HollowRectangle")){
                HollowRectangle b = new HollowRectangle(in.nextInt(), in.nextInt());
                b.draw();
            }
            else if (Objects.equals(type, "Inputs")){
                String sign = in.next();
                if (sign == "+") {
                    size += in.nextInt();
                }
                else if (sign == "-") {
                    size -= in.nextInt();
                }
            }
            else if (Objects.equals(type, "Quit")){
                size = -10;
            }
        }
        System.out.println();
        System.out.println("Спасибо, что возпользовались услугами нашего приложения. Надеемся, что мы смогли Вам помочь.");
    }
}
