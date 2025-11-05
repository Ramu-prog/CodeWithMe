package BasicOops_ConceptofObject;

public class Car_Calling {

  public static void main(String[] args) {

        Car objectref1 = new Car("Teach1","Audi1", "Red", 12.00,100000);

        Car objectref2 = new Car("Teach2","Audi2","Green",15.45,12000);

        Car objectref3 = new Car("Teach3","Audi3","White",17.00,15000);



        objectref1.startCar();
        objectref1.carDetails();
        objectref1.stopCar();

        objectref2.startCar();
        objectref2.carDetails();
        objectref2.stopCar();

        objectref3.startCar();
        objectref3.carDetails();
        objectref3.stopCar();

    }
}
