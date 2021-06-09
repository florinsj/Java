public enum CifraRomana {
    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

    //fields
    private int valoare;

    //private constructor
    private CifraRomana(int valoare) {
        this.valoare = valoare;
    }

    public int getValoare() {
        return valoare;
    }

    public static int valoare(String nrRoman) {
        int valoare = 0;
        CifraRomana cifra;
        CifraRomana temp = CifraRomana.I;
        for (int i = nrRoman.length() - 1; i >= 0; i--) {
            cifra = CifraRomana.valueOf(nrRoman.substring(i, i + 1));
            if (cifra.getValoare()< temp.getValoare())
                valoare -= cifra.getValoare();
            else {

                valoare += cifra.getValoare();
                temp = cifra;
            }
        }
        return valoare;


    }

    public static void main(String[] args) {
        System.out.println("XIX = "+ CifraRomana.valoare("XIX"));
        System.out.println("DXIV = "+ CifraRomana.valoare("DXIV"));
    }
}