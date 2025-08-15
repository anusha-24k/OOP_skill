package week6;

public class Shape {
	public void findArea(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public void findArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void findArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        Shape s = new Shape();
        s.findArea(5);
        s.findArea(6, 4);
        s.findArea(3.5);
    }
}

