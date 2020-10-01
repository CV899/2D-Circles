
package testcircle2d;

/**
 * Author: Christian Vincent
 * Date: 10-31-18
 * Description: This class computes whether a point is inside
 * a circle, a circle is in a circle, and/or whether two
 * circles intersect.
 */

public class Circle2D {
    private double x, y;
    private double radius;
    
    //Constructors
    public Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }
    
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    //returns the value of x
    public double getX() {
        return x;
    }
    
    //sets x to a specified value
    public void setX(double x) {
       this.x = x; 
    }
    
    //returns the value of y
    public double getY() {
        return y;
    }
    
    //sets y to a specified value
    public void setY(double y) {
        this.y = y;
    }
    
    //returns the radius
    public double getRadius() {
        return radius;
    }
    
    //sets the radius to a specified value
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    //returns the perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    //returns the area
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    //determines whether a specified point is within this circle
    public boolean contains(double x, double y) {
        return (Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2) 
                < Math.pow(radius, 2));
    }
    
    //determines and returns whether a specified circle is within this circle
    public boolean contains(Circle2D circle) {
        if(circle.radius == radius && circle.x == x && circle.y == y) 
        {
            return true;
        }
        else
        {
            return circle.radius < radius;
        }
        
    }
    
    //determines and returns whether a specified circle overlaps this circle
    public boolean overlaps(Circle2D circle) {
        return radius <= distance(x, y, circle.x, circle.y) + circle.radius;
    }
    
    //determines and returns the distance between two points (for overlap method)
    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    
    
}
