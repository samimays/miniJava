public class Rectangle extends Square {
    double width = length;

    Rectangle(double newLength){
        width = newLength;
        length = 2*width;
    }

    double getArea(){
        return length*width;
    }
}
