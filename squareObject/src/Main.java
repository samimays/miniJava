import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello there! Would you like to create a " +
                "square or a rectangle?");
        System.out.println("Please answer square or rectangle");
        String shape = input.nextLine().toLowerCase();

        double s1 = 1;
        double s2 = 2;


        if(shape.equalsIgnoreCase("square")){
            System.out.println("What would you like the length of the sides to be?");
            s1 = input.nextDouble();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            System.out.println("What would you like the length to be?");
            s1 = input.nextDouble();
            System.out.println("What would you like the width to be?");
            s2 = input.nextDouble();
        } else {
            System.out.println("Didn't work");
        }

        System.out.println(s1);


    }
}
