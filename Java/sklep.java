import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class sklep {
    public static void main(String[] Args){

    }
}
class shop{


}
class product{

    String produkt;
    Integer cena;
    Integer ilosc;
    public product(){}
    public product(String produkt, Integer cena, Integer ilosc){
         this.produkt = produkt;
         this.cena = cena;
         this.ilosc = ilosc;
    }
    public String getProdukt()
    {
        return produkt;
    }
    public Integer getCena(){
        return cena;
    }
    public Integer getIlosc(){
        return cena;
    }

}
class magazyn{

    List<product> lista_produktow = new ArrayList<>();
    public magazyn(){

    }
    public magazyn(){
        this.lista_produktow(new product())
    }


}
