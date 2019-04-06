public class Samochod {


    int maksymalnaPredkosc = 100;
    int minimalnaPredkosc = 0;

    double masa = 4000.90;

    boolean wlaczony = false;
    String stan = "zly";
    String nazwaAuta = "Astra";

    double maxBak = 45.0;
    double obecnyBAK = 20.5;
    double mpg = 26.4;

    int liczbaOsobWAucie = 1;
    int maksymalnaOsobWAucie = 5;

    public Samochod() {

    }


    //  public Samochod(int uzytkowaMaksymalnaPredkosc, double uzytkowaMasa, boolean uzytkowaWlaczony) {
    //    maksymalnaPredkosc = uzytkowaMaksymalnaPredkosc;
    //     masa = uzytkowaMasa;
    //      wlaczony = uzytkowaWlaczony;
    //  }

    public void printVariables() {
        System.out.println("To jest maksymalna predkosc " + maksymalnaPredkosc);
        System.out.println(minimalnaPredkosc);
        System.out.println(masa);
        System.out.println(wlaczony);
        System.out.println(stan);
        System.out.println(liczbaOsobWAucie);
        System.out.println(nazwaAuta);
        System.out.println(maxBak - obecnyBAK);

    }

    public void zmianaPredkosci() {
        minimalnaPredkosc = 100;
        maksymalnaPredkosc = maksymalnaPredkosc + 1;
    }

    public void dodaj() {
        liczbaOsobWAucie = liczbaOsobWAucie + 1;
        if (liczbaOsobWAucie < maksymalnaOsobWAucie) {

            System.out.println("Ktoś wszedł " + liczbaOsobWAucie);
       } else {
            System.out.println("Auto jest pełne " + liczbaOsobWAucie);
        }
    }

   // public void odejmij() {
    //    liczbaOsobWAucie = liczbaOsobWAucie - 1;

    public void wlaczAuto() {
         if  (!wlaczony) {
              wlaczony = true;
        } else {
            System.out.println("Auto jest wlaczone " + wlaczony);
            }
        }

    public double dystans() {
        return obecnyBAK * mpg;
    }

    public double zasieg() {
        return maxBak * mpg;
    }

    public static void main(String[] args) {


        //    Samochod autoNaUrodziny = new Samochod();
//
        //      System.out.println("Prezent urodzinowy wer1");

        //     autoNaUrodziny.dodaj();
        //      autoNaUrodziny.zmianaPredkosci();
        //      autoNaUrodziny.printVariables();

        //     System.out.println("Kilometry możliwe do przejechania " + autoNaUrodziny.dystans());
        //     System.out.println("Do zrobienia " + autoNaUrodziny.zasieg());

        Samochod autoKamila = new Samochod();
        autoKamila.dodaj();
        autoKamila.dodaj();
        autoKamila.dodaj();
        autoKamila.dodaj();
        autoKamila.dodaj();
        autoKamila.wlaczAuto();
        autoKamila.printVariables();



    }
}