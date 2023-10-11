package person;

public class Person {

    public void afisareInfoPersoanaAge(int age) {
        System.out.println("Age: " + age);
    }

    public void afisareInfoPersoana(String varsta) {
        System.out.println("Age: " + varsta);
    }

    public void afisareInfoPersoanaAgeAndName(int age, String nume) {
        System.out.println("Age: " + age);
        System.out.println("Nume: " + nume);
    }

    public void afisareInfoPersoana(String nume, int age) {
        System.out.println("Age: " + age);
        System.out.println("Nume: " + nume);
    }

    public void afisareInfoPersoana(int age, String nume, String gender) {
        System.out.println("Age: " + age);
        System.out.println("Nume: " + nume);
        System.out.println("Gender: " + gender);
    }


    public void getAge() {

        int age = getAge2();
        
        if(2==2) {
            return;
        }

        System.out.println("sdasd");
    }


    public int getAge2() {

        if(2==2) {
            return 2;
        }


        return 5;
    }



}
