package Java_Exercises;

public class E4_EncryptPassword {


    public static void main(String[] args) {
        E4_EncryptPassword testObj = new E4_EncryptPassword();
        System.out.println(testObj.encrypt("Florin"));
        System.out.println(testObj.encrypt("Florin11?"));
    }

    String encrypt(String password) {

        if (validatePassword(password)) {

            char[] ch = new char[password.length()];

            for (int i = 0; i < password.length(); i++)
                ch[i] = (char) (password.charAt(i) + 256);

            return ch.toString();
        } else {
            return "encryption failed!!(invalid password format)";
        }
    }

    public boolean validatePassword(String s) {
        return (containsLowerCaseLetter(s) && containsUpperCaseLetter(s) &&
                containsSpecialChar(s) && containsDigits(s));
    }

    public boolean containsUpperCaseLetter(String s) {
        boolean result = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                result = true;
            }

        }
        return result;
    }

    public boolean containsLowerCaseLetter(String s) {
        boolean result = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                result = true;
            }

        }
        return result;
    }

    public boolean containsSpecialChar(String s) {
        boolean result = false;
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        for (int i = 0; i < s.length(); i++) {
            if (specialChars.contains(Character.toString(s.charAt(i)))) {
                result = true;
            }

        }
        return result;
    }

    public boolean containsDigits(String s) {
        boolean result = false;
        String digits = "0123456789";
        for (int i = 0; i < s.length(); i++) {
            if (digits.contains(Character.toString(s.charAt(i)))) {
                result = true;
            }

        }
        return result;
    }
}





