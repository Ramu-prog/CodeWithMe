package BasicOops_ConceptofObject;

public class Car {
    //Class is a template used for creating Objects
    String compnay;
    String model;
    String color;
    double millage;
    int price;

    public Car(String compnay, String model, String color, double millage, int price){
        this.compnay=compnay;
        this.model=model;
        this.color=color;
        this.millage=millage;
        this.price=price;
    }
// If parameter is matching with class name>Class Variable and parameter both is different
   // public void initializedata(){
    //}
    public void startCar(){
        System.out.println(model+"Car is started");
    }
    public void carDetails(){
        System.out.println("Car company name is: "+compnay);
        System.out.println("Car details is given: "+model);
        System.out.println("Color of the car is: "+color);
        System.out.println("Millage of the car is: "+millage);
        System.out.println("Price of the car is: "+price);

    }
   public void stopCar(){
       System.out.println(model+"Car is stopped");
       System.out.println("______________");


   }

}
