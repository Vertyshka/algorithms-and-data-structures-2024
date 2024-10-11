package mirea.lab9.task8;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, String color, boolean filled, double radius) {
        super(name, color, filled);
        this.radius = Math.abs(radius) > 0 ? Math.abs(radius) : 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            radius = getPositive("radius");
        }
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getPerimeter() {
        return  2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color='" + color + '\'' + ", filled=" + filled
                + ", Area=" + getArea() + ", Perimeter=" + getPerimeter() + '}';
    }

}