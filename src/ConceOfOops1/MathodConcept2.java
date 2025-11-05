package ConceOfOops1;

public class MathodConcept2 {
    //Concept of Parameter
    public static void main(String[] args) {
        System.out.println("add method is calling in main method");
      add(5,4);
      add(3,7);
      System.out.println("_______");
      substraction(9,6);
    }
    public static void substraction(int c , int d) {
        int subs;
        subs = c - d;
        System.out.println("The substraction of " + c + " and " + d + " is: " + subs);
    }
    public static  void add(int a ,int b){
        int sum;
        sum= a+b;
        System.out.println("The sum of "+a+" and "+b+" is: "+sum);
    }



}

/*Concept Recap:

Parameters (int a, int b) = input values to a method.

Arguments (5, 4) = actual values you pass when calling the method.

You can call a method multiple times with different arguments.*/