package append;

public class SBappend {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("World!");
        System.out.println(sb);
        sb.append(" Have a nice day!");
        System.out.println(sb);
    }
}
