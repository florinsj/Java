public class EnumExample1 {

    //define enum inside class
    enum Season {
        WINTER, SPRING, SUMMER, FALL;
    }

    //main()
    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s);
        }
    }
}
