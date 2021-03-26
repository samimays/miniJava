public class Rectangle extends Square {
    double width = length;

    Rectangle(double newLength){
        width = newLength;
        length = Math.round(Math.random()*10);
    }

    double getArea(){
        return length*width;
    }
}
