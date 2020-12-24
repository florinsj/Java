public class NumarRoman {
    private CifraRomana[] numarRoman;

    //constructor fara parametrii
    public NumarRoman() {
        numarRoman = new CifraRomana[0];
    }

    //o functie care stabileste numarul roman tinut in obiectul curent
    public void setNumarRoman(String string) {

        numarRoman = new CifraRomana[string.length()];
        for (int i = 0; i < string.length(); i++) {
            numarRoman[i] = CifraRomana.valueOf(string.substring(i, i + 1));
            //numarRoman o sa sa fie un array de valori Enum
            // pt string="XIX" o sa avem numarRoman=[X,I,X]
        }
    }

    //constructor cu un parametru de tip String
    public NumarRoman(String string) {
        setNumarRoman(string);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("");
        for (CifraRomana cifraRomana : numarRoman)
            sb.append(cifraRomana);
        return sb.toString();
    }

    //obtine valoare numerica pentru numarul roman
    public int valoare() {
        int valoare = 0;
        CifraRomana cifraRomana;
        CifraRomana tempCifraRomana = CifraRomana.I;
        for (int i = numarRoman.length - 1; i >= 0; i--) {
            cifraRomana = numarRoman[i];
            if (cifraRomana.compareTo(tempCifraRomana) < 0) {
                valoare -= cifraRomana.getValoare();
            } else {
                valoare += cifraRomana.getValoare();
                tempCifraRomana = cifraRomana;
            }
        }
        return valoare;
    }

    public static void main(String[] args) {
        NumarRoman numarRoman1 = new NumarRoman("XIX");
        System.out.println("XIX= " + numarRoman1.valoare());
        NumarRoman numarRoman2 = new NumarRoman("XXV");
        System.out.println("XXV= " + numarRoman2.valoare());

    }
}

