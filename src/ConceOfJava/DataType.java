package ConceOfJava;
public class DataType {
    int i=10;
    boolean b=false;
    char c='c';
    double d=3.5;

    //All are instance variable
    public static void main(String[] args) {
        DataType object= new DataType();
        System.out.println(object.i);
        System.out.println(object.b);
        System.out.println(object.c);
        System.out.println(object.d);
    }



    /*
    A Data type tha determine what value variable can hold and what are the operation can be performed on the variable.
    Data Type has two categories,
    Primitive AND Nonprimitive
    Primitive data type  is predefine data type > and there are 8 primitive data types.and devided into the 4 subcategories
    1. Integer>byte>short>int>long
    2.Floating point>float> double
    3.character>char
    Boolean>boolean

    Nonprimitive type
     String is predefine java class not a data type.

    */

}
