package lenghtAndCapacity;

public class SBlenghtAndCapacity {

    //create a StringBuffer object
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("stringbuffer1");
        System.out.println(sb1);

        //create StringBuffer object with a string
        // length() and capacity() methods
        StringBuffer sb2 = new StringBuffer("stringBuffer2");
        int capacity2 = sb2.capacity();
        int length2 = sb2.length();
        System.out.println("stringBuffer2 capacity= " + capacity2);
        System.out.println("stringBuffer2 insideString length= " + length2);

        //create empty StringBuffer object
        // length() and capacity() methods on empty StingBuffer object
        StringBuffer sb3 = new StringBuffer();
        int capacity3 = sb3.capacity();
        int length3 = sb3.length();
        System.out.println("stringBuffer2 capacity= " + capacity3);
        System.out.println("stringBuffer3 insideString length== " + length3);

    }
}
