package J17;

//constructor references
public class MyClass {
    public static void main(String[] args) {

        // lambda expression version
        Factory factory1 = chars -> new String(chars);

        //method reference version

        Factory factory2 = String::new;
    }
}
