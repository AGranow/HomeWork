package shape;

import dao.Shape;

public class Line extends Shape {
    int length;

    public Line(char symbol, int length) {
        super(symbol);
        this.length = length;
    }

    @Override
    public void draw() {
        for (int i = 0; i < this.length; i++) {
            System.out.print(getSymbol());
        }

    }
}
