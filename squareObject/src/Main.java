import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello there, let's create a square!");
        System.out.println("What would you like the length to be?");
        double s1 = input.nextDouble();

        Square square = new Square(s1);
        square.getArea();

        System.out.println("Now let's build a rectangle");
        System.out.println("What would you like the width to be?");
        double s2 = input.nextDouble();
        Rectangle rectangle = new Rectangle(s2);
        rectangle.getArea();


    }
}
