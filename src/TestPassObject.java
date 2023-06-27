public class TestPassObject {
    public static void main(String[] args) {
       Circle c1 = new Circle();
       Circle c2 = new Circle(4.0);

        System.out.println("C1 radius: " + c1.getRadius());
        System.out.println("C2 radius: " + c2.getRadius());
        System.out.println("Number of Objects created: " + Circle.getNumberOfObjects());

        System.out.println("Edit radius of C1");
        c1.setRadius(4.0);
        System.out.println("C1 radius: " + c1.getRadius());

        System.out.println("Do c1 and c2 have the same raius? " + (c1.getRadius() == c2.getRadius()));
        System.out.println("Testing the printCircle method: ");
        printCircle(c1);
        Circle.printCircle(c2);
    }
    public static void printCircle(Circle c){
        System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
    }
}