package Java_Codewars;

// Implement a function that accepts 3 integer values a, b, c.
// The function should return true if a triangle can be built with the sides
// of given length and false in any other case.
// (In this case, all triangles must have surface greater than 0 to be accepted).
public class C2_TriangleTester {
    public static void main(String[] args) {
        System.out.println(isTriangle(3, 2, 1));
        System.out.println(isTriangle(1, 2, 7));

    }

    public static boolean isTriangle(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (c + b > a)) return true;
        else return false;
    }
}
