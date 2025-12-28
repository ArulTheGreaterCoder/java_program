class Circle{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    } 
    public double getRadius(){
        return radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return Math.PI*2*radius;
    }
}
public class Circles{
    public static void main(String[] args){
        Circle circle = new Circle(5);
        System.out.println("Radius of circle is "+circle.getRadius());
        System.out.println("Area of circle is "+circle.area());
        System.out.println("Circumference of circle is "+circle.circumference());
    }
}