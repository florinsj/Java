package Java_Codewars;

//Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (like the name of this kata).
//
//        Strings passed in will consist of only letters and spaces.
//        Spaces will be included only when more than one word is present.
//        Examples:
//
//        spinWords("Hey fellow warriors") => "Hey wollef sroirraw"
//        spinWords("This is a test") => "This is a test"
//        spinWords("This is another test") => "This is rehtona test"
public class C1_SpinWords2 {
    public static void main(String[] args) {
        C1_SpinWords2 testObj = new C1_SpinWords2();
        System.out.println(testObj.spinWords2("Hey fellow warriors "));
        System.out.println(testObj.spinWords2("This is a test "));
        System.out.println(testObj.spinWords2("Welcome"));
    }

    public String spinWords2(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }
}
