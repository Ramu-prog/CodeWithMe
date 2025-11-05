package ArrayConcept;

public class Learnarray {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println("Length of array");
        System.out.println(a.length);
        System.out.println("printing the value using the loop");
        for (int i=0;i<=2;i++){
            System.out.println(a[i]);
        }

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
            System.out.println("It not hardcoded");

        }

    }

}
