package automobil;

import animal.Animal;

public class AutomobilElectric extends Automobil {

    private int kw;

    public int getKw() {
        return kw;
    }

    public void setKw(int kw) {
        this.kw = kw;
    }

    public void afisareInfoAuto() {
        System.out.println("Km: " +  getKm());
        System.out.println("Denumire: " +  getDenumire());
        System.out.println("Kw: " + kw);
    }

}
