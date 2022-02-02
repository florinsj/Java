package Java_Tutorial.Java4_DataTypes;

public class DataTypes1 {

    /* primitive data types
    8 types of primitive data types :
    boolean,char,byte,short,int,long,float,double */

    /* non primitive data types (references types) : Classes, Interfaces, Arrays */

    /* null type - have no name ,we cannot declare a null type, just use null value */

    public static void main(String[] args) {

        boolean one = false;    // boolean type - 1 bit             {false,true}    default=false

        byte a = 10, b = 2;     // byte type    - 8 bits signed     (-128,127]      default=0
        short s = 1000;         // short type   - 16 bits signed    [-32768,32767]  default=0
        int i = 100000;         // int type     - 32 bits signed    (-2^31,2^31-1]  default=0
        long l = 2321000;       // long type    - 64 bits signed    (-2^63,2^63-1]  default=0

        float f = 343.2f;       // float type   - 32 bits single precision          default=0.0f;
        double d = 343.2;       // double type  - 64 bits double precision          default=0.0d;

        char letterA = 'A';     /* char type    - 16 bits Unicode character
                                                        ('\u0000','\uffff'] == (0,65535] */

    }
}
