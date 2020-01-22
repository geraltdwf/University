import java.util.Scanner;


public class tabliczki {

    public static void main(String[] args){

        Scanner liczba1 = new Scanner(System.in);
        int tab[][] = returnTab();
        for(int i=0; i < tab.length;i++){

            for(int j = 0; j < tab[i].length; j++){

                System.out.print(tab[i][j] + " ");
            }
            System.out.println();

        }

        int m = liczba1.nextInt();
        changeTab(m, tab);

        for(int i=0; i < tab.length;i++){

            for(int j = 0; j < tab[i].length; j++){

                System.out.print(tab[i][j] + " ");
            }
            System.out.println();

        }
    }

    static  int[][] returnTab(){

        int[][]tab = {{1,2,3},{1,2,0},{1,0,2}};
        return tab;
    }

    static int[][] changeTab(int m, int tabliczka[][])
    {
        tabliczka[1][2] = m;
        return tabliczka;
    }

}




