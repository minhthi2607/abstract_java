package bai2;

import java.util.Random;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];

        shape[0] = new Circle(5);
        shape[1] = new Rectangle(4,6);

        Random random = new Random();

        for (Shape s : shape) {
            double percent =  1 + random.nextInt(100);

            System.out.println("Before resize area: " + s.getArea());

            if(s instanceof Resizeable){
                ((Resizeable) s).resize(percent);
            }

            System.out.println("Resize percent = " + percent + "%");
            System.out.println("After resize area: " + s.getArea());
            System.out.println("----------------------");
        }



    }
}
