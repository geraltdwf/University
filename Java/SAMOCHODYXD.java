public class SAMOCHODYXD {
    public static void main(String[] args){


    }

}
abstract class Pojazd{

    Integer year;
    Integer km;
    String name;
    public void Display(){
        System.out.println(name+": " + ", year: " + year +" - " + km);
    }
    public Integer getYear(){return year;}
    public Integer getKm(){return km;}
    public String getName(){return name;}
}
class Osobowy extends Pojazd{

    private String marka;
    public void costam(){System.out.println("?");}
}
class Motor extends Pojazd{
    private String jaki_pojazd;
    public void setJaki_pojazd(String value){
        jaki_pojazd = value;
    }
}
// Object object = new Object();
//object = null;
//  if(variable) {
//   Object object = new Object();
//   }