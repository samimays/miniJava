import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello there, let's create a square!");
        System.out.println("What would you like the length to be?");
        double s1 = input.nextDouble();
        Square square = new Square(s1);

        System.out.println("What color should the square be?");
        String color1 = input.next();
        square.color(color1);

        System.out.println("The area of the square is " + square.getArea() +
                " and the color is " + square.getColor());

        System.out.println("\nNow let's build a rectangle");
        System.out.println("What would you like the width to be?");
        double s2 = input.nextDouble();
        Rectangle rectangle = new Rectangle(s2);

        System.out.println("What color should the square be?");
        String color2 = input.next();
        rectangle.color(color2);

        System.out.println("The area of the rectangle is " + rectangle.getArea() +
                " and the color is " + rectangle.getColor());

        System.out.println("Please press q to quit");
        String db = input.next();

        System.out.println("\nHave a great day!");
    }
}
