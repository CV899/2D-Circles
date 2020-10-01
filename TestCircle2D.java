
/**
 * Author: Christian Vincent
 * Date: 10-31-18
 * Description: This program tests the Circle2D class.
 */

public class TestCircle2D {

    public static void main(String[] args) {
       Circle2D c1 = new Circle2D(2, 2, 5.5);
       System.out.println("Area is " + c1.getArea());
       System.out.println("Perimeter is " + c1.getPerimeter());
       System.out.println(c1.contains(3, 3));
       System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
       System.out.println(c1.overlaps(new Circle2D(6, 5, 2.3)));
       
       //Testing if two circles are touching each other
       Circle2D c3 = new Circle2D(0, 0, 1);
       System.out.println(c3.overlaps(new Circle2D(2, 0, 1)));
       System.out.println(c3.contains(new Circle2D(2, 0, 1)));
       
       //Testing if two circles are identical
       Circle2D c4 = new Circle2D(0, 0, 1);
       System.out.println(c4.overlaps(new Circle2D(0, 0, 1)));
       System.out.println(c4.contains(new Circle2D(0, 0, 1))); 
       
    
}
}
