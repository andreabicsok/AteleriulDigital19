package lab2.challenge2;

public class Premiu {
    private String nume;
    private int an;

    public Premiu(String nume, int an){
        this.nume = nume;
        this.an = an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public int getAn() {
        return an;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
}
