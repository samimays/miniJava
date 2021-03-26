public class Rectangle extends Square {
    double length = 1.0;
    double width = 1.0;

    Rectangle(double newLength){
        width = newLength;
        length = 2*width;
    }

    double getArea(){
        return length*width;
    }
}
