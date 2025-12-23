package bai3;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square(5);

       for (Shape shape : shapes) {
           if(shape instanceof Colorable){
               ((Colorable) shape).howToColor();
           }
       }


    }
}
