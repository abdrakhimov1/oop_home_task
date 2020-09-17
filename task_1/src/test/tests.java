package test;
import main.Circle;
import main.Square;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



class testSquare {

    private double tol = 0.0000001;

    @Test
    public void calculateAreaSquare() {
        float testSide = 5;
        Square square = new Square(testSide);
        assertEquals(25.0, square.AreaCount(), tol);
    }

    public static void main(String[] args ){
        testSquare testSquare = new testSquare();
        testSquare.calculateAreaSquare();
    }
}