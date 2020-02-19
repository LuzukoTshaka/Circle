public class Circle {


    private double radius;
    private final double PI = 3.14159;

    public Circle(double GivenRadius){

        radius = GivenRadius;

    }

    public Circle() {
        radius = 0.0;
    }

    public void setradius(double GivenRadius) {

        radius = GivenRadius;

    }


    public double getradius() {
        return radius;
    }


    public double getDiameter() {

        return radius * 2;

    }

    public double getcircumference() {

        return 2 * PI * radius;

    }

    public double getArea() {

        return PI * radius * radius;

    }


    public String toString(){

        return String.format("Radius = %s \n Diameter = %s \n Circumference = %s \n Area = %s",getradius(),getDiameter(),getcircumference(),getArea());
    }
}
