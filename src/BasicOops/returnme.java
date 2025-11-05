package BasicOops;

public class returnme {

    public static void main(String[] args) {
           int s=add(4,6);
        System.out.println(s);
    }


    public static int add( int a ,int b){

        int sum;
        sum=a+b;
        return sum;
    }

}
