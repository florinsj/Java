package Java_Tutorial.Java3_Variables;

public class Variables8Address {
    public static void main(String[] args) {

        Variables8Address x = new Variables8Address();
        System.out.println("\n\t Type of x is " + x.getClass().getName() + "\n\t value of x is " +
                x + "\n\t address of x is  " + x.hashCode());
        byte[] y = new byte[10];
        System.out.println("\n\t Type of y is " + y.getClass().getName() +
                "\n\t value of y[0] is " + y[0] +
                "\n\t address of y is " + y.hashCode());

        // if two string are equals with equal(), they have the same hashCode
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java").intern();
        System.out.println("\n\t s1HashCode= " + s1.hashCode() +
                "\n\t s2HashCode= " + s2.hashCode() +
                "\n\t s3HashCode= " + s3.hashCode() +
                "\n\t s4HashCode= " + s4.hashCode()
        );
    }
}
