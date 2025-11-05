package ConceOfOops1;

public class MethodConcept3 {

    public static void main(String[] args) {

      String day=  weekofTheday(4);
        System.out.println(day);
    }

    public static String weekofTheday(int number) {
        String day = "";
        if (number == 1) {
            day = "Sunday";
        } else if (number == 2) {
            day = "Monday";
        } else if (number == 3) {
            day = "Tuesday";
        } else if (number == 4) {
            day = "Wednesday";
        } else if (number == 5) {
            day = "Thursday";
        } else if (number == 6) {
            day = "Friday";
        } else if (number == 7) {
            day = "Saturday";
        }

        return day;


    }
}
