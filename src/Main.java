import animal.Tigru;
import automobil.AutomobilCombustibil;
import automobil.AutomobilElectric;
import person.Person;

public class Main {
    public static void main(String[] args) {

//        Tigru tigru = new Tigru();
//        tigru.setNume("Tigru");
//
//        System.out.println(tigru.getNume());
//

//        Tigru tigru1 = new Tigru(10, "Tigru");
//
//        tigru1.setDescriere("Animal tigru");
//
//        System.out.println(tigru1.getNume());
//        System.out.println(tigru1.getVarsta());
//        System.out.println(tigru1.getDescriere());

//
//        Tigru tigru2 = new Tigru(20, "tigru2", "tigru 2");
//        System.out.println(tigru2.getNume());
//        System.out.println(tigru2.getVarsta());
//        System.out.println(tigru2.getDescriere());


//        AutomobilElectric automobilElectric = new AutomobilElectric();
//        automobilElectric.setKm(20000);
//        automobilElectric.setKw(400);
//        automobilElectric.setDenumire("Tesla");
//
//        automobilElectric.afisareInfoAuto();
//
//
//        AutomobilElectric automobilElectric2 = new AutomobilElectric();
//        automobilElectric2.setKm(20000);
//        automobilElectric2.setKw(400);
//        automobilElectric2.setDenumire("Tesla");
//
//        automobilElectric2.afisareInfoAuto();

//        System.out.println("-----------------------");
//
//        AutomobilCombustibil automobilCombustibil = new AutomobilCombustibil();
//        automobilCombustibil.setCapacitateCombustibil(20);
//        automobilCombustibil.setDenumire("Bmw");
//        automobilCombustibil.setKm(30000);
//
//        System.out.println(automobilCombustibil.getDenumire());
//        System.out.println(automobilCombustibil.getCapacitateCombustibil());
//        System.out.println(automobilCombustibil.getKm());


        Person person = new Person();
        person.afisareInfoPersoana(20);
        person.afisareInfoPersoana(20, "Ion");
        person.afisareInfoPersoana("Ion", 20);
        person.afisareInfoPersoana(20, "Ion", "MALE");

    }
}