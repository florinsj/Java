package Java_Exercises;

public class E3_PasswordValidation {


    public static void main(String[] args) {
        E3_PasswordValidation objTest1 = new E3_PasswordValidation();
        System.out.println(objTest1.validatePassword("Florin"));
        System.out.println(objTest1.validatePassword("Florin?"));
        System.out.println(objTest1.validatePassword("Florin?1"));


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
