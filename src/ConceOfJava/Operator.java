package ConceOfJava;
public class Operator {
    public static void main(String[] args) {

        // 1. Arithmetic Operators ➕➖✖️➗
        // Used for math operations.

        int a = 10, b = 3;
        System.out.println(a + b); // 13 (Addition)
        System.out.println(a - b); // 7 (Subtraction)
        System.out.println(a * b); // 30 (Multiplication)
        System.out.println(a / b); // 3 (Division - quotient)
        System.out.println(a % b); // 1 (Modulo - remainder)

//2. Relational (Comparison) Operators ⚖️
        //Used to compare values → returns true or false.System.out.println(a == b); // false

        System.out.println(a != b); // true
        System.out.println(a > b);  // true
        System.out.println(a < b);  // false
        System.out.println(a >= b); // true
        System.out.println(a <= b); // false

//3. Logical Operators 🧠
        // Work with boolean values.

        boolean x = true, y = false;
        System.out.println(x && y); // false (AND)
        System.out.println(x || y); // true  (OR)
        System.out.println(!x);     // false (NOT)

//4. Assignment Operators 📌
        //Used to assign values.

        int c = 5;
        c += 3; // same as c = c + 3 → 8
        c -= 2; // same as c = c - 2 → 6
        c *= 4; // 24
        c /= 6; // 4
        c %= 3; // 1

//5. Unary Operators ☝️
        // Work on a single operand.

        int d = 5;
        System.out.println(+d);  // 5
        System.out.println(-d);  // -5
        System.out.println(++d); // 6 (pre-increment)
        System.out.println(d++); // 6 (post-increment → then d becomes 7)
        System.out.println(--d); // 6 (pre-decrement)
        System.out.println(d--); // 6 (post-decrement → then d becomes 5)

//6. Ternary Operator ❓:
        //Shortcut for if-else.

        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result); // Adult

//7. Bitwise Operators ⚡

        //  Work on binary representation.
        int p = 5, q = 3;
        System.out.println(p & q);  // 1 (AND)
        System.out.println(p | q);  // 7 (OR)
        System.out.println(p ^ q);  // 6 (XOR)
        System.out.println(~p);     // -6 (NOT)
        System.out.println(p << 1); // 10 (Left shift)
        System.out.println(p >> 1); // 2 (Right shift)
    }
}