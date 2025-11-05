package TransferSatement;

public class ContinueStatement {

    public static void main(String[] args) {

        for(int i=1;i<=10;i++){

            if (i==5) {
                continue; // skips printing 5
            }
//
            System.out.println("using Continuous statement"+i);
        }
    }
}
//Used to skip the current iteration and go to the next one — like saying “nah, skip this round”.