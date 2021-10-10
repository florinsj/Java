package Java_Codewars;

//Complete the function that accepts a string parameter, and reverses each word in the string.
// All spaces in the string should be retained.
//
//        Examples
//        "This is an example!" ==> "sihT si na !elpmaxe"
//        "double  spaces"      ==> "elbuod  secaps"

public class C3_ReverseWords {
    public static void main(String[] args) {
        reverseWords("Hello world1");
        reverseWords("Hello    world2");
    }

    public static String reverseWords(final String original) {

        String[] words = original.split("\\s");
        System.out.println(words.length + " elemente");
//        for (String w : words) {
//            System.out.print(w.toString() + "_");
//        }
        System.out.println();
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        String str = String.join(".", words);
        str = str.replace(".", " ");
        System.out.println("Str=[" + str + "]");
        return String.join(" ", words);
    }

}
