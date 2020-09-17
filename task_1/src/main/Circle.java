package main;

public class Circle implements Figure{

    private float radius;

    public Circle(float radius){
        if (radius < 0){
            System.out.println("Radius is below 0, radius = 0 \n");
            this.radius = 0;
        }else {
            this.radius = radius;
        }
    }

    @Override
    public float AreaCount() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    public static void main(String[] args ){
        Circle circle = new Circle(5);
        System.out.println("Area = " + circle.AreaCount());
    }
}
