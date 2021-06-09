public class EnumExample7 {

    //define enum inside class
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }

    //main()
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        switch (day) {
            case SUNDAY:
                System.out.println("SUNDAY");
                break;
            case MONDAY:
                System.out.println("Monday");
                break;
            default:
                System.out.println("other day");
        }
    }
}

