package dao;

public abstract class Shape {
    char symbol;

    public Shape(char symbol) {
        this.symbol = symbol;
    }

    public Shape() {}

    public char getSymbol() {
        return symbol;
    }

    public abstract  void draw();

}
