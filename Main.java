public class Main {
    public static void main(String[] args) throws Exception {

        //create object instance.
        Shape c1 = new Circle("Meters", "Blue", 2);

        //nilagay ko sa println kasi string yung nirereturn ng getter method ko.
        System.out.println(c1.getColor());
        System.out.println(c1.getUnit());

        System.out.println("=======================new attribute values=======================");
        //setter method kung gusto ko palitan yung color blue or yung units.
        c1.setColor("White");
        System.out.println(c1.getColor());

        c1.setUnit("Centimeters");
        System.out.println(c1.getUnit());

        System.out.println("=============constructor overloading/no arguments used=================");
        Shape anotherOne = new Circle();
        System.out.println(anotherOne.getColor());

        System.out.println("The area of c1: " + c1.getArea());

        Shape squarePizza = new Square("meters","yellow",12,3);
        System.out.println(squarePizza.getArea());

        Shape aCircle = new Circle("meters", "blue", 2);
        Shape aSquare = new Square("millimeters","yellow",5,5);
        Shape anotherCircle = new Circle();
        Shape anotherSquare = new Square();
        
        //ARRAY OF OBJECTS TO BE ADDED NEXT TIME

    }
}
