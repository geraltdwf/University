import java.awt.*;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class z34 {
    public static void main(String[] args){

        HumanList humanList = new HumanList(5);
        humanList.displayList();
        Scanner object = new Scanner(System.in);
        String name = object.nextLine();
        String name_2 = object.nextLine();
        Integer wiek_xd = object.nextInt();
        Human hujman = new Human(name, name_2, wiek_xd);
        humanList.addToList(hujman);
        Scanner object_2 = new Scanner(System.in);
        String remove_name = object_2.nextLine();
        humanList.removeFromList(remove_name);
        humanList.youngDis();
    }


}
class Human{

    private String nazwisko;
    String imie;
    Integer wiek;
    public Human(){

    }
    public Human(String nazwisko, String imie,Integer wiek){
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.wiek = wiek;
    }

    public Integer getWiek() {
        return wiek;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public String getImie(){
        return  imie;
    }

}

class HumanList {

    List<Human> lista = new ArrayList<>();

    String[] imie = {"KAMIL", "TOMASZ", "MIKOLAJ", "MICHAL", "PANPAWEL", "ROMAN"};
    String[] nazwisko = {"BORZYCH", "TEREFER", "MIRAKOWICZ", "MIRAKOWSKI", "PAZDZIOCH"};


    public HumanList(int x) {
        Random rand = new Random();
        for (int i = 0; i < x; i++) {
            this.lista.add(new Human(nazwisko[rand.nextInt(nazwisko.length)],imie[rand.nextInt(imie.length)],  rand.nextInt(70)));
        }

    }


    public void displayList() {
        System.out.println("Lista ludzi:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.format("| %-8s | %-8s | %d", lista.get(i).getNazwisko(), lista.get(i).getImie(), lista.get(i).getWiek());
            System.out.println();
        }
    }

    public void removeFromList(String nazwisko) {
        boolean validate = false;
        for (int i = 0; i < lista.size(); i++) {
            if (nazwisko.equals(lista.get(i).getNazwisko())) {
                System.out.println("Usuwam: " + lista.get(i).getNazwisko());
                lista.remove(i);
                validate = true;
                break;
            }
        }
        if (validate == false) {
            System.out.println("nie ma takiej osoby");
        }
    }

    public void addToList(Human human) {
        boolean Validate = true;

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(human.getNazwisko() + " == " + lista.get(i).getNazwisko());
            if (human.getNazwisko().equals(lista.get(i).getNazwisko())) {
                Validate = false;
                System.out.println("xd");
                break;

            }
        }
        if (Validate == true) {
            System.out.println("DODANE");
            lista.add(human);
        } else {
            System.out.println(("Osoba o takim nazwisko juz jest"));
        }
    }


    public void youngDis() {
        int age = lista.get(0).getWiek();
        int young_index = 0;
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).getWiek() < age) {
                age = lista.get(i).getWiek();
                young_index = i;
            }
        }

        System.out.println("Najmlodsza oosba ma lat: " + lista.get(young_index).getWiek());
    }
}


//%b	dowolny	interpretuje argument jako wartość logiczną
//%s	dowolny	interpretuje argument jako łańcuch znaków
//%d	liczba całkowita	interpretuje argument jako liczbę całkowitą
//%o	liczba całkowita	interpretuje argument jako liczbę całkowitą zapisaną w systemie ósemkowym
//%x	liczba całkowita	interpretuje argument jako liczbę całkowitą zapisaną w systemie szesnastkowym
//%f	liczba zmiennoprzecinkowa	interpretuje argument jako liczbę zmiennoprzecinkową
//%%	-	nie potrzebuje argumentu, jest to sposób na umieszczenie znaku % wewnątrz sformatowanego łańcucha znaków
//%n	-	nie potrzebuje argumentu, jest to sposób na umieszczenie znaku nowej linii wewnątrz sformatowanego łańcucha znaków

//        - element będzie wyrównany do lewej strony,
//        + liczba zawsze będzie zawierała znak (nawet jeśli jest dodatnia),
//        0 liczba będzie uzupełniona 0 do żądanej szerokości,
//        ( liczby ujemne nie będą prezentowane ze znakiem, będą otoczone (),
//        , użyj separatora do grupowania liczb. Ten separator zależny jest od lokalizacji.
//double someNumber = 12345.12;
//System.out.format(Locale.US, "%,.2f%n", someNumber);
 //       System.out.format(Locale.GERMAN, "%,.2f%n", someNumber);
 //       System.out.format(Locale.forLanguageTag("PL"), "%,.2f%n", someNumber);
    //    12,345.12
 //       12.345,12
  //      12 345,12