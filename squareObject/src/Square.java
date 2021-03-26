public class Square {
    double length = 1.0;
    String color;

    Square(){}

    Square(double newLength){
        length = newLength;
    }

    void color(String c1){
        color = c1;
    }

    double getArea(){
        return length*length;
    }
}
