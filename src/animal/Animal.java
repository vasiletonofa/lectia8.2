package animal;

public class Animal extends Fiinta {


    public Animal() {
        super();

    }

    public Animal(int varsta, String nume) {
        super();
        this.nume = nume;
        this.varsta = varsta;
    }

    public Animal(int varsta, String nume, String descriere) {
        super(descriere);
        this.nume = nume;
        this.varsta = varsta;
    }

    private int varsta;
    private String nume;

    private boolean carnivor;

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
