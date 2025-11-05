package TransferSatement;

public class Breakstatement {
    void m1() {
        int i = 1;
        for (i = 1; i <= 10; i++) {
            if (i == 5) {
                break;         //// exits the loop right here
            }
            System.out.println("using break statement" + i);//1 ,2,3,4,

        }
       System.out.println("using break statement" + i);//4

    }
    void m2(){
        int i=1;
        for (i=1;i<=10;i++){
            if(i==5) {
                return; //// exits the loop right here
            }
            System.out.println("using break statement"+i);
        }
      System.out.println("using break statement"+i);
    }

    public static void main(String[] args) {
        Breakstatement bs=new Breakstatement();
        bs.m1();
       bs.m2();


    }
}
//Used to stop the loop immediately — like hitting the emergency brake.