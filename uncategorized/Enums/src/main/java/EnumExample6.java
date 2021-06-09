public class EnumExample6 {


    //define enum inside class
    enum Seasons {
        WINTER(5), SPRING(10), SUMMER(15), FALL(20);
        // la crearea WINTER(5) se apeleaza constructor cu parametru 5 ,si tot asa


        //fields
        private int valoare;

        //constructor (trebuie sa fie private)
        private Seasons(int valoare) {
            this.valoare = valoare;
        }
    }

    //main()
    public static void main(String[] args) {

        for (Seasons s : Seasons.values()) {
            System.out.println(s + " " + s.valoare);
            //System.out.println(s + " " + s.name());

        }
    }
}
