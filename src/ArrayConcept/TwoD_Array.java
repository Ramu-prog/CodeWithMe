package ArrayConcept;

public class TwoD_Array {

    public static void main(String[] args) {
//shortcut representation
        int a[][]={{0,1,2},{3,4,5} ,{6,7,8}};

      //  int a[][] = new int[3][3];

        a[0][0] =0;
        a[0][1] =1;
        a[0][2] =2;

        a[1][0] =3;
        a[1][1] =4;
        a[1][2] =5;

        a[2][0] =6;
        a[2][1] =7;
        a[2][2] =8;

        System.out.println(a [0][0]);
        System.out.println(a [0][1]);
        System.out.println(a [0][2]);

        System.out.println(a [1][0]);
        System.out.println(a [1][1]);
        System.out.println(a [1][2]);

        System.out.println(a [2][0]);
        System.out.println(a [2][1]);
        System.out.println(a [2][2]);

        System.out.println("\nUsing for-each:");

        for (int[] row : a) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println(" Traditional For loop");

        for(int i=0;i<a.length;i++){

            for (int j=0;j<a.length;j++){

                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}