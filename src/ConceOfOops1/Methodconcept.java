package ConceOfOops1;

public class Methodconcept {

    public static void main(String[] args) {
        System.out.println("Im main method");
        System.out.println("-----------");
       firstemthod();//Method calling statement
        ///secondMethod();


    }
    public static void firstemthod(){
        System.out.println("Im Firstmethod");

        // thirdMethod();
       // firstemthod();
        secondMethod();
        thirdMethod();
        fourMethod();


    }

    public static void secondMethod(){
        System.out.println("Im Second method");


    }
    public static void thirdMethod(){
        System.out.println("Im Third method");

    }
    public static void fourMethod(){
        System.out.println("Im Four method");


    }

}

/* Main() method is that method where excution will statrt & we can write the logic inside the main method.
Creating the multiple method along main method
All method is resided in the th class
 main method calling other method
 non-main method calling other method
 calling other method multiple times
* */
