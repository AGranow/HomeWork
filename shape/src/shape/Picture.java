package shape;

import dao.Shape;

public class Picture extends Shape {
    Shape[] shapes;

    public Picture( Shape[] shapes) {
        super();
        this.shapes = shapes;
    }



    @Override
    public void draw() {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
        System.out.println();
    }
}
