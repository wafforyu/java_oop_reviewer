//remember; abstract classes cannot be instantiated, they can only be inherited.
abstract class Shape {

    //These are the attributes.
    private String unitOfMeasurement, color;
    protected double area;
    
    Shape(String unit, String color){
    //This is the constructor, it runs everytime an object instance is created 
    //thus we can use it to initialize values.

        this.unitOfMeasurement = unit;
        this.color = color;    
        //"this." refers to the variable of the object being created... 
        //..the variables initialized prior to object creation that are global to this class.
    }

    //method overloading, this will execute if the user does not enter
    //the required parameters on the first method.
    //NOTE: it has to have the same name as the other method.
    Shape(){
        this.unitOfMeasurement = "millimeters";
        this.color = "Black";
    }

    //this is an abstract method, just forces a subclass to create the same method 
    //...with different functionality.
    abstract double getArea();
    //the reason why this method is abstract and empty is because the Shape class
    //cannot possible calculate an area for the shape "Shape".
    //an area can only be calculated for shapes like Circles, and etc.

    //this is a getter method. A getter method usually just gets an attribute value for you.
    String getUnit(){
        return unitOfMeasurement;
    }

    String getColor(){
        return color;
    }
    
    //a setter method will allow you to change the existing attribute value.
    void setUnit(String newUnit){
        this.unitOfMeasurement = newUnit;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

}
