package ConceOfOops1;

public class VariableConcept {
    int i=10;
    //Global variable> A variable declared inside the class

    public static void main(String[] args) {
        int y=10;
        System.out.println(y);
        System.out.println();
    }
    public static void variableacces1(){
        int x=20;
        //Local variable> A variable declared inside the method
        System.out.println(x);
        // System.out.println(i);
    }

    public static void accessvariable2(){
       // System.out.println(i);

    }

}

// Variable store the data
// Method store the logic
// Real world entities is represented in programing is call Object.