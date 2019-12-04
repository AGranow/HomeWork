package controller;

import dao.Shape;
import shape.Line;
import shape.Picture;
import shape.Rectangle;

public class Application {

    public static void main(String[] args) {
        Shape line1 = new Line('@', 4);
        Shape line2 = new Line('#', 10);
        Shape line3 = new Line('$', 15);
        Shape line4 = new Line('%', 9);
        Shape rechtangle1 = new Rectangle('!', 4, 5);
        Shape rechtangle2 = new Rectangle('@', 17, 50);
        Shape rechtangle3 = new Rectangle('#', 10, 20);
        Shape rechtangle4 = new Rectangle('$', 3, 30);

        Shape[] shapes = {line1,line2,line3,line4};
        Picture picture = new Picture(shapes);
        picture.draw();

        Shape[] shapes1 = {rechtangle1,rechtangle2,rechtangle3,rechtangle4};
        Picture picture1 = new Picture(shapes1);
        picture1.draw();


        line1.draw();
        System.out.println();
        rechtangle1.draw();
    }


}
