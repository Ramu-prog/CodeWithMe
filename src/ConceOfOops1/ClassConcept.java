package ConceOfOops1;

public class ClassConcept {
    String compnay ;
    String model;
    String colour;
    int price;
    double miliage;
    int wheel;

    public void carStart(){
        System.out.println(model+"Car Started");
    }
    public void carStop(){

        System.out.println(model+"Car Stoped");
    }
    public void carDetails(){
        System.out.println("Company of the car is "+ compnay);
        System.out.println("Model of the car is:" +model);
        System.out.println("Color of the car is :"+colour);
        System.out.println("Price of the car is:"+price);
        System.out.println("Mileage of the car is:"+miliage);
        System.out.println("Wheel of the car is:"+wheel);

        System.out.println("____________________");


    }

}
