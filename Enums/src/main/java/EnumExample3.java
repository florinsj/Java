public class EnumExample3 {

    //define enum inside class
    enum Season {
        WINTER, SPRING, SUMMER, FALL;
    }

    //main()
    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s);
        }

        //use of valueOf() and ordinal() methods
        System.out.println("Value of WINTER is: " + Season.valueOf("WINTER"));
        System.out.println("Value of SUMMER is: " + Season.valueOf("SUMMER"));
        System.out.println("Index of SUMMER is: " + Season.valueOf("SUMMER").ordinal());


    }
}
