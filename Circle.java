import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Circle c1 =new Circle();
        c1.radius = 5.4;
        c1.printSize();

        Circle c2 = new Circle();
        c2.radius = 8.7;
        c2.printSize();
    }
}
