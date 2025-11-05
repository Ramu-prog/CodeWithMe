package ConceOfJava;

public class Literals {

   // A literal is just a fixed value that you directly put in the code (not calculated, not from a variable).

 /*   Type	Example	Notes
    >Integer Literal	10, -25, 0	By default → int. Add L for long → 100L.
    >Floating-point Literal	3.14, -0.5, 2.5f	By default → double. Add f/F for float, d/D for double.
    >Character Literal	'A', '1', '#'	Single character inside single quotes.
    >String Literal	"Hello", "Java123"	Sequence of characters inside double quotes.
    >Boolean Literal	true, false	Only two possible values.
    >Null Literal	null	Special literal for objects with no reference
  */

    public static void main(String[] args) {
            int decimal = 10;       // Integer literal
            int binary = 0b1010;    // Binary literal (10)
            int octal = 012;        // Octal literal (10)
            int hex = 0xA;          // Hexadecimal literal (10)

            float pi = 3.14f;       // Floating-point literal
            double e = 2.71828;     // Double literal

            char grade = 'A';       // Character literal
            String name = "Java";   // String literal

            boolean isFun = true;   // Boolean literal
            String nothing = null;  // Null literal

            System.out.println(decimal + " " + binary + " " + octal + " " + hex);
            System.out.println(pi + " " + e);
            System.out.println(grade + " " + name);
            System.out.println(isFun + " " + nothing);
        }
    }


