package MethodConcept;

public class Concept_ofCalling {

    public static void main(String[] args) {
        System.out.println("IM Main method ");
        //MethodCalling Statement
        methodM1();
        methodM5();
        //Here main method is calling other method
        methodM3();
        methodM3();
        methodM3();
        methodM3();
        methodM3();

    }

    public static void methodM1(){
        System.out.println("IM method one");
        methodM2();
    }
    public static void methodM2(){
        System.out.println("IM method two and I called by method one");
    }
    public static void methodM3(){
        System.out.println("IM method three and calling by main method multiple times");
        methodM4();
    }

    public static void methodM4(){
        System.out.println("IM method four");
    }
    public static void methodM5(){
        System.out.println("IM method five");


    }


}
