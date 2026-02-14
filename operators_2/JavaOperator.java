package Learning_Java.operators_2;

public class JavaOperator {
    public static void main(String[] args) {

        // =========================
        // 1️⃣ Arithmetic Operators
        // =========================
        int a = 10;
        int b = 5;

        System.out.println("=== Arithmetic Operators ===");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));


        // =========================
        // 2️⃣ Relational Operators
        // =========================
        System.out.println("\n=== Relational Operators ===");
        System.out.println("Equal to (a == b): " + (a == b));
        System.out.println("Not equal to (a != b): " + (a != b));
        System.out.println("Greater than (a > b): " + (a > b));
        System.out.println("Less than (a < b): " + (a < b));
        System.out.println("Greater or equal (a >= b): " + (a >= b));
        System.out.println("Less or equal (a <= b): " + (a <= b));


        // =========================
        // 3️⃣ Logical Operators
        // =========================
        boolean x = true;
        boolean y = false;

        System.out.println("\n=== Logical Operators ===");
        System.out.println("Logical AND (x && y): " + (x && y));
        System.out.println("Logical OR (x || y): " + (x || y));
        System.out.println("Logical NOT (!x): " + (!x));


        // =========================
        // 4️⃣ Assignment Operators
        // =========================
        int c = 10;

        System.out.println("\n=== Assignment Operators ===");
        c += 5;
        System.out.println("After c += 5 → " + c);

        c = 10; // reset
        c -= 3;
        System.out.println("After c -= 3 → " + c);

        c = 10; // reset
        c *= 2;
        System.out.println("After c *= 2 → " + c);

        c = 10; // reset
        c /= 2;
        System.out.println("After c /= 2 → " + c);


        // =========================
        // 5️⃣ Unary Operators
        // =========================
        int d = 5;

        System.out.println("\n=== Unary Operators ===");
        System.out.println("Initial d: " + d);
        System.out.println("Post-increment (d++): " + (d++));
        System.out.println("After d++ → " + d);
        System.out.println("Pre-increment (++d): " + (++d));


        // =========================
        // 6️⃣ Ternary Operator
        // =========================
        int age = 18;

        System.out.println("\n=== Ternary Operator ===");
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age: " + age);
        System.out.println("Result: " + result);
    }
}