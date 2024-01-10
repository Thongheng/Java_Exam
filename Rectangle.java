public class Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,10);
        System.out.println("Rectangle Area : " + rectangle.getArea());
        System.out.println("Rectangle Perimeter : " + rectangle.getPerimeter());
        System.out.println("===================================================");
        Square square = new Square(6);
        System.out.println("Rectangle Area : " + square.getArea());
        System.out.println("Rectangle Perimeter : " + square.getPerimeter());

    }

    private double width, length;
    public Rectangle (double width, double length){
        this.width = width;
        this.length = length;

    }
    public double getArea(){
        double Area;
        return Area = length * width;
    }
    public double getPerimeter(){
        double Perimeter;
        return Perimeter = 2 * (length + width);
    }


}
class Square extends Rectangle{
    public Square (double side) {
        super(side,side);
    }
}