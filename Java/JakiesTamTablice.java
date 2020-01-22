import java.util.Scanner;




public class JakiesTamTablice {

    public static void main(String[] args){

        int[] tab1 = {5,5,5};
        int[][] tab2 = {{1,2,3}, {1,2,0}, {1,0,2}};

        for(int i = 0; i < 3; i++)
        {
            tab2[1][i] = tab1[i];
        }
        System.out.println("DA");
        for(int i = 0; i < tab2.length; i++)
        {
            for(int j = 0; j <  tab2[i].length; j++){
                System.out.print(tab2[i][j] + " ");
            }
            System.out.println();
        }

    }


}
