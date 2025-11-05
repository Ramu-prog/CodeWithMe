package ConceOfOops1;

public class ConceptofObject {

    public static void main(String[] args) {

        ClassConcept objectref =new ClassConcept();
        objectref.compnay="Audi";
        objectref.model= "Audi6";
        objectref.colour="Red";
        objectref.price = 9000000;
        objectref.miliage=91.4;
        objectref.wheel=4;


        ClassConcept hi20= new ClassConcept();
        hi20.compnay="hyundai";
        hi20.model="Hy6";
        hi20.colour="blue";
        hi20.price=89000;
        hi20.miliage=41.89;
        hi20.wheel=4;



        objectref.carStart();
        objectref.carStop();
        objectref.carDetails();



        hi20.carStart();
        hi20.carStop();
        hi20.carDetails();


    }
}
