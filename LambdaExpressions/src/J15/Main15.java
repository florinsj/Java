package J15;

//parameter method reference
public class Main15 {
    public static void main(String[] args) {

        Finder finder = String::indexOf;

        //compiler try to match the referenced method against the first parameter type ,
        //with second parameter type as parameter to the referenced method
    }
}
