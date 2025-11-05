package BasicOops;

public class MethodParameterandArgument {
    public static void main(String[] args) {
    //Single Argument
 printname("Single parameter concept");
 //multiple Argument
 add(5 ,5);

    }

    public static void printname( String name){ //name is parameter
        System.out.println("Welcome"+ name);
        System.out.println("Single parameter ");

      }
public static void add(int a, int b){
        int sum;
        sum=a+b;
    System.out.println("Multiple argument + "+a+ " and "+b+ " is: "+ sum);

}






}
