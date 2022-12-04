
public class Main {
    public static void main(String[] args) {
        Generic<Integer> res = new Generic<Integer>(5, 8, 2);
        res.sort();
        System.out.println(res);
    }
}