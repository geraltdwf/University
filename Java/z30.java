import java.util.Scanner;

public class z30 {

    public static void main(String[] args){

        Scanner liczba1 = new Scanner(System.in);
        int y = liczba1.nextInt();
        int[][] tab = tabCreator(y);
        int[] tab_info = new int[2];
        for(int i = 0; i < tab_info.length;i++)
        {
            tab_info[i] = liczba1.nextInt();
        }
        int p = liczba1.nextInt();
        disp(tab);
        System.out.println();
        tab_refor(tab, tab_info, p);
        disp(tab);
        calc(tab);



    }

    static int [][] tabCreator(int n)
    {
        int [][]tab = new int[n][n];
        for(int i = 0; i < n; i++ )
        {
            for(int j = 0; j < n ;j ++)
            {
                tab[i][j] = 0;
            }
        }
        return tab;
    }
    static void disp(int [][]tab){
        for(int i = 0; i < tab.length; i++ )
        {
            for(int j = 0; j < tab[i].length ;j ++)
            {
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }

    }
    static int [][]tab_refor(int [][]tab,int []tab_2, int g){

        tab[tab_2[0]][tab_2[1]] = g;
        return  tab;

    }
    static void calc(int [][]tab)
    {
        int suma_1 = 0;
        int suma_2 = 0;
        int suma_3 = 0;

        for(int i = 0; i < tab.length; i++)
        {
            suma_1 += tab[0][i];
        }
        for(int i = 0; i < tab.length; i++)
        {
            suma_2 += tab[i][0];
        }
        int k = 0;
        for(int i = 0; i < tab.length; i++)
        {
                suma_3+=tab[i][k];
                k++;

        }
        System.out.println(suma_1);
        System.out.println(suma_2);
        System.out.println(suma_3);




    }




}
