package getChars;

public class SBgetChars {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        char[] dst=new char[5];
        sb.getChars(0,3,dst,0);
        System.out.println(dst);
    }
}
