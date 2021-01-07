package J16;

//instance method reference
public class StringConverter {

    public int convertToInt(String v1) {
        return Integer.valueOf(v1);
    }

    public static void main(String[] args) {
        StringConverter stringConverter = new StringConverter();

        Deserializer deserializer = stringConverter::convertToInt;

        //here convertToInt() (from StringConverter) has same signature with deserializer()(from Deserializer)
        //so we can referenct convertToInt() to deserializer()

    }
}
