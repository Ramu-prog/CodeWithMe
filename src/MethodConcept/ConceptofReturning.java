package MethodConcept;

public class ConceptofReturning {

    public static void main(String[] args) {
         int result =add(2,4,6);
        System.out.println("sum of three value :"+result);
    }
    public static int add(int a, int b, int c ){
        int sum;
        sum=a+b+c;
        return sum;


    }

}
