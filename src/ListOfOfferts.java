import java.security.PublicKey;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListOfOfferts {
    private List<Offert> listOfOfferts;

    public ListOfOfferts (){
        listOfOfferts = new ArrayList<>();
    }

    public List<Offert> getListOfOfferts() {
        return listOfOfferts;
    }

    public void setListOfOfferts(List<Offert> listOfOfferts) {
        this.listOfOfferts = listOfOfferts;
    }

    public void addNewOffert(Offert offert) {
        listOfOfferts.add(offert);
    }

    public static void printList(ListOfOfferts list){
        System.out.println("===============================================================================");
        System.out.println("|Tytul\t|Data dodania\t|Marka auta\t|Rocznik auta\t|Przebieg auta\t|Cena auta|");
        System.out.println("===============================================================================");
        for (Offert item : list.listOfOfferts) {
            System.out.println("|"
                    + item.getTitle() + "\t|"
                    + item.getOffertDate() + "\t|"
                    + item.getCar().getCarBrand() + "\t|"
                    + item.getCar().getCarProductionYear() + "\t|"
                    + item.getCar().getCarMileage() + "\t|"
                    + item.getCar().getCarPrice() + "\t|");
            System.out.println("---------------------------------------------------------------------------");
        }
    }
}
