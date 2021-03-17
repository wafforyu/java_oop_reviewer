public class Square extends Shape{

    private double length, width;

    Square(String unitOfMeasurement, String color, double length, double width){
        super(unitOfMeasurement,color);
        this.length = length;
        this.width = width;
    }

    Square(){
        this.length = 1;
        this.width = 1;
    }

    double getArea() {
        this.area = length*width;
        return this.area;
    }
}
