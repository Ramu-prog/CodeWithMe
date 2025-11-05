package MethodConcept;

public class ConceptofParameter {
    //parameterize concepts
    public static void main(String[] args) {
        System.out.println("Parameter Concept of Method ");
        methodM1(" I am Learning  parameterize method"); //Argument
        sum(2,4,6);
    }
    public static void methodM1(String ConceofMethod){ //Parameter
        System.out.println("Hey Java"+ConceofMethod);
    }
    public static void sum(int a,int b, int c){
        int sum;
        sum=a+b+c;
        System.out.println("Sum of Three Value=" +sum);
    }



}
