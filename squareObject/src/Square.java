public class Square {
    double length = 1.0;
    String color;

    Square(){}

    Square(double newLength){
        length = newLength;
    }
    double getArea(){
        return length*length;
    }
    void color(String c1){
        color = c1;
    }
    String getColor(){
        return color;
    }
}
