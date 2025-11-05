package FlowControl;

public class IFElseifElse {

    public static void main(String[] args) {
        int a=10,b=8,c=7,d=6,e=5;
        if(a < b){
            System.out.println(" a is less then b");

        } else if (b<c) {
            System.out.println(" b is less then c");
        }
        else if (c<d) {
            System.out.println(" c is less then d");
        }
        else if (d<e) {
            System.out.println("d is less then to e");

        } else {
            System.out.println(" e is the least");
        }
    }


}
