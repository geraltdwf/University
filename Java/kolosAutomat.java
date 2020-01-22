import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Automatxd {

    public static void main(String[] args){
        Scanner liczba = new Scanner(System.in);
        int x = liczba.nextInt();
        int kosz;
        Automat automat = new Automat(x);
        System.out.println("SKLEPIK");
        System.out.println("Wrzuc hajs");
        kosz = liczba.nextInt();
        automat.setKoszyk(kosz);
        while(true)
        {


            System.out.println("[1] MENU");
            System.out.println("[2] stan siano");
            System.out.println("[3] KUP");
            System.out.println("[4] Exit");
            int wybor = liczba.nextInt();
            switch(wybor)
            {

                case 1:  automat.displayMenu(); break;
                case 2:  System.out.println(automat.getKoszyk()); break;
                case 3:  automat.kupno(); break;
                case 4:  System.exit(0);
                default: System.out.println("Nic nie ma"); break;
            }


        }


    }


}
class Napoj{

    String rodzaj;
    float cena;

    public Napoj(String rodzaj, float cena)
    {
        this.cena = cena;
        this.rodzaj = rodzaj;
    }

    public float getCena() {
        return cena;
    }

    public String getRodzaj() {
        return rodzaj;
    }

}
class Automat{

       List<Napoj> menu = new ArrayList<>();
       Scanner liczba2 = new Scanner(System.in);
    Scanner myObj = new Scanner(System.in);
       float koszyk = 0;
       public Automat(int x){
           Napoj[] napoje = new Napoj[x];
           float y;
           String nazwa;
           for(int i = 0; i < napoje.length; i++)
           {
               System.out.println("CENA");
               y = liczba2.nextFloat();
               System.out.println("NAZWA");
               String name = myObj.nextLine();
               napoje[i] = new Napoj(name, y);
               addToList(napoje[i]);
           }

       }
       public void kupno()
       {
           for(int i = 0; i < menu.size(); i++)
           {
               System.out.println(i+1 +") " + "Napoj: " + menu.get(i).rodzaj + " ,cenka: " + menu.get(i).cena);
           }
           System.out.println("CO CHCESZ: ");
           int wybor = liczba2.nextInt();
           if(menu.get(wybor-1).getCena() > getKoszyk())
           {
               System.out.println("nie stac cie");
           }
           else
           {
           setKoszyk2(menu.get(wybor-1).getCena());
           System.out.println("Zakupiono: " + menu.get(wybor-1).rodzaj);
           System.out.println("Zostalo Ci: "+ getKoszyk());
           }




       }
       public float getKoszyk()
       {
           return koszyk;
       }
       public void setKoszyk(float value){
           koszyk += value;
       }
       public void setKoszyk2(float value){
           koszyk -= value;
       }
       public void displayMenu()
       {
           System.out.println("KUP");
           for(int i = 0; i < menu.size(); i++)
           {
               System.out.println(i+") " + "Napoj: " + menu.get(i).rodzaj + " ,cenka: " + menu.get(i).cena);
           }
       }
       public void addToList(Napoj napoj)
       {
        menu.add(napoj);
       }




}
