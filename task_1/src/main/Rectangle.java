package main;

public class Rectangle implements Figure{

    float sideA;
    float sideB;

    public Rectangle( float sideA, float sideB) {
        if (sideA < 0) {
            System.out.printf("SideA is below 0, side == 0\n");
            this.sideA = 0;
        } else {
            this.sideA = sideA;
        }
        if (sideB < 0) {
            System.out.printf("SideB is below 0, side == 0\n");
            this.sideB = 0;
        } else {
            this.sideB = sideB;
        }
    }

    @Override
    public float AreaCount() {
        return sideA * sideB;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area  = " + rectangle.AreaCount());
    }
}

