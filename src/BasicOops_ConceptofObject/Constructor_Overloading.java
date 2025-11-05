package BasicOops_ConceptofObject;

public class Constructor_Overloading {

    public Constructor_Overloading() {
        System.out.println("zero parameter");
    }

    // one parameter
    public Constructor_Overloading(int y) {
        System.out.println("One parameter");
    }

    // two int parameters
    public Constructor_Overloading(int x, int y) {
        System.out.println("Two int parameters");
    }

    // int + double parameters
    public Constructor_Overloading(int x, double d) {
        System.out.println("int and double parameters");
    }





}
