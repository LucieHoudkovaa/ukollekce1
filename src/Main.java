import java.net.Inet4Address;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String jmenoPrijmeni = "Jan Janecek"; //Jméno a příjmení prodejce
        LocalDate datumNarozeni = LocalDate.of(1991, 5,20); //Datum narození prodejce.
        int pocetSmluv = 100; //Počet dosud sjednaných smluv.
        double celkoveProdaneMrkve = 10.5;//Celkové množství prodané mrkve v tunách.
        String mesto = "Praha"; //Název města, kde prodejce sídlí.
        String spz = "8AT4155"; //Registrační značka vozidla („SPZ“).
        double spotrebaVozidla = 7.8;//Spotřeba firemního vozidla v litrech na 100 km.
        String ipAdresa = "192.168.10.40";// IP adresa verze 4 firemního počítače.
        //Více o formátu IP adresy verze 4 viz například IP adresa verze 4;
        System.out.println(celkoveProdaneMrkve/pocetSmluv);
        System.out.println("testcommit");
    }
}