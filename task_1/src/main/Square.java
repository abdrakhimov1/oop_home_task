package main;

public class Square implements Figure {

    float side;

    public Square( float side) {
        if (side < 0) {
            System.out.printf("Side is below 0, side == 0\n");
            this.side = 0;
        } else {
            this.side = side;
        }
    }

    @Override
    public float AreaCount() {
        return side * side;
    }

    public static void main(String[] args) {
        Square square = new Square(-4);
        System.out.println("Area  = " + square.AreaCount());
    }
}
