package ConceOfJava;
public class Variable {
    int x= 5;
    static int y=10;
    public static void main(String[] args) {
        int c=15;
        //Accessing the variable>Instance variable>Class variable>Local variable
        Variable object= new Variable();
        System.out.println(object.x);

        //Class variable
        System.out.println(y);

        //Local variable
        System.out.println(c);

    }









    //Variable is container which contains the data.
    //There are 3 type of variable
    //1.Instance variable >That define as a member of a class.>memory allocate whenever object is crated> it store in heave area.
    //2.Class variable >That define as a static member of a class.>Memory allocate whenever class is loaded.>it store in method area.
    //3.Local variable  >That define inside the method>Memory allocated whenever method is called>Iyt store in Stack area.

    //-----Concept---
    //int a; --Declaration statement
    //a=5; --Initialization statement(first time variable has value)
    //a=10; --Assignment statement(2nd times value of variable got change )
    //int a =10; deceleration and initialization




}
