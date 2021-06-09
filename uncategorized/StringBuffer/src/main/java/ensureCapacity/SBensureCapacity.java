package ensureCapacity;

public class SBensureCapacity {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("0123456789");

        int length = sb.length();
        System.out.println("Length= " + length);
        int capacity = sb.capacity();
        System.out.println("Capacity= " + capacity);


        sb.ensureCapacity(30);
        //because new capacity>oldCapacity -->the finalCapacity=(oldCapacity*2)+2

        length = sb.length();
        System.out.println("Length= " + length);
        capacity = sb.capacity();
        System.out.println("Capacity= " + capacity);


    }
}