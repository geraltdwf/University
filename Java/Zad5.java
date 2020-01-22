import java.util.Scanner;



public class Zad5 {


    public static void main(String[] args){

        Scanner liczba = new Scanner(System.in);
        //wczytanie z klawiatury
        int i = 0;
        int suma = 0;
        int[] tab2 = new int[5];
        while(i < 5)
        {
            int input = liczba.nextInt();
            if(input > 0 )
            {
                tab2[i] = input;
                suma+=tab2[i];
                i++;
            }
        }
        tabDisplay(tab2);
        System.out.println("Suma wszystkich elementow: " + suma);


    }
    public static  void tabDisplay(int []tab)
    {
        for(int i = 0; i < tab.length; i++)
        {
            System.out.print(tab[i] + "  ");
        }


    }


}
