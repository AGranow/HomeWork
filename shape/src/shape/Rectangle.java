package shape;

import dao.Shape;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(char symbol, int width, int height) {
        super(symbol);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        for (int i = 0; i < this.height; i++) {
            System.out.println();
            for (int j = 0; j < this.width; j++) {
                if (i == 0 || j == 0  || i == this.height-1 || j== this.width-1) {
                    System.out.print(getSymbol());
                }else {
                    System.out.print(" ");
                }
            }
        }
    }
}




