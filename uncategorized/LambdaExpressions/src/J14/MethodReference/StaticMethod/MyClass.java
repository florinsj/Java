package J14.MethodReference.StaticMethod;

//static method reference
public class MyClass {
    public static int doFind(String s1, String s2) {
        return s1.lastIndexOf(s2);
    }

    public static void main(String[] args) {

        Finder finder = MyClass::doFind;
        //here we make a reference between find (method from Finder) and doFind() (static method from MyClass)
        //the parameters of methods must match
        System.out.println(finder.find("ABCDA", "ABC"));
    }
}
