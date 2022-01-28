// Square overlap
// Write an algorithm witch determine if two squares overlap
// As given data we get left high corner point and right low corner point of each square

package Java_Algoritms;

public class A7_SquareOverlap {

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static boolean overlap(Point l1, Point r1, Point l2, Point r2) {

        // check if a square is on left or right side of the other square
        if ((l1.x > r2.x) || (l2.x > r1.x)) {
            System.out.println("Square do not overlap!");
            return false;
        }
        // check if a square is above or below  of the other square
        if ((r1.y > l2.y) || (r2.y > l1.y)) {
            System.out.println("Square do not overlap!");
            return false;
        }
        System.out.println("Square overlap!");
        return true;
    }

    public static void main(String[] args) {
        Point l1 = new Point(5, 5);
        Point r1 = new Point(10, 0);

        Point l2 = new Point(7, 10);
        Point r2 = new Point(15, 3);

        Point l3 = new Point(2, 5);
        Point r3 = new Point(4, 1);
        System.out.println("Square 1 vs Square 2 ");
        overlap(l1, r1, l2, r2);
        System.out.println("Square 1 vs Square 3 ");
        overlap(l1, r1, l3, r3);
        System.out.println("Square 2 vs Square 3 ");
        overlap(l2, r2, l3, r3);

    }
}
