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

public class SpinWords {
    public static void main(String[] args) {
        SpinWords testObj = new SpinWords();
        System.out.println(testObj.spinWords("Hey fellow warriors"));
        System.out.println(testObj.spinWords("This is a test"));
        System.out.println(testObj.spinWords("Welcome"));
    }

    public String spinWords(String sentence) {
        //TODO: Code stuff here
        String result = "";
        String[] words = sentence.split("\\s");
        for (int i = 0; i < words.length; i++) {
            String str = "";

            //............................/
            if (words[i].length() >= 5) {

                for (int j = words[i].length() - 1; j >= 0; j--) {
                    str += words[i].charAt(j);
                }
            } else str = words[i];
            //............................/

            if (i != 0) {
                result += " " + str;
            } else {
                result += str;
            }

        }
        return result;
    }

}
