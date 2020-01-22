import java.util.Scanner;


public class GdybySilnia {
    public static void main(String[] args){

        int value;
        Scanner liczba1 = new Scanner(System.in);
        for(int i = 0; i < 10; i++)
        {

            value = liczba1.nextInt();
            System.out.println(silnia(value));
        }

    }
    public static int silnia(int i){

        if(i == 1)
        {
            return 1;
        }
        else{
            return i * silnia(i-1);
        }

    }

}
