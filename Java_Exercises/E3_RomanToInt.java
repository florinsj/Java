// Florin Stanciu
// Learning Java

/*  Given a roman numeral, convert it to an integer.

  Roman numerals are usually written largest to smallest from left to right.
       Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000

  However, the numeral for four is not IIII. Instead, the number four is written as IV.
  Because the one is before the five we subtract it making four.
  The same principle applies to the number nine, which is written as IX.


  There are six instances where subtraction is used:

  I can be placed before V (5) and X (10) to make 4 and 9.
  X can be placed before L (50) and C (100) to make 40 and 90.
  C can be placed before D (500) and M (1000) to make 400 and 900. */
package Java_Exercises;

public class E3_RomanToInt {
    public static void main(String[] args) {
        E3_RomanToInt ob = new E3_RomanToInt();
        String str1 = "XII";
        String str2 = "MCMIV";
        System.out.println("Integer form of " + str1 + " is: " + ob.romanToInt(str1));
        System.out.println("Integer form of " + str2 + " is: " + ob.romanToInt(str2));
    }

    public int romanToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = returnValue(s.charAt(i));
            if ((i + 1) < s.length()) {
                int s2 = returnValue(s.charAt(i + 1));
                if (s1 >= s2) {
                    number += s1;
                } else {
                    number += (s2 - s1);
                    i++;
                }
            } else {
                number += s1;
            }
        }
        return number;
    }

    int returnValue(char c) {
        if (c == 'I')
            return 1;
        if (c == 'V')
            return 5;
        if (c == 'X')
            return 10;
        if (c == 'L')
            return 50;
        if (c == 'C')
            return 100;
        if (c == 'D')
            return 500;
        if (c == 'M')
            return 1000;
        return 0;

    }

}
