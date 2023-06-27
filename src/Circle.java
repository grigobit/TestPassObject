/**
 * Created by grigo on 6/27/2023
 *
 * @author : grigo
 * @date : 6/27/2023
 * @projects : TestPassObject
 */
public class Circle {
    private double radius = 1;
    private static int numberOfObjects = 0;

    Circle (){
        numberOfObjects++;
    }
    Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        radius = (newRadius >= 0)? newRadius : 0;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    public static void printCircle(Circle c){
        System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
    }


}
