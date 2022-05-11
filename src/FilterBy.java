import com.sun.source.tree.BreakTree;

import java.time.LocalDate;
import java.util.List;

public class FilterBy {

    public static ListOfOfferts price(Double carPriceMin, Double carPriceMax, ListOfOfferts list) {
        ListOfOfferts newList = new ListOfOfferts();
        for (Offert offert: list.getListOfOfferts()){
            if (carPriceMin <= offert.getCar().getCarPrice() && carPriceMax >= offert.getCar().getCarPrice()){
                newList.addNewOffert(offert);
            }
        }
        return newList;
    }

    public static ListOfOfferts title(String word, ListOfOfferts list) {
        ListOfOfferts newList = new ListOfOfferts();
        for (Offert offert: list.getListOfOfferts()){
            if (word.equals(offert.getTitle())){
                newList.addNewOffert(offert);
            }
        }
        return newList;
    }

    public static ListOfOfferts date(LocalDate dateMin, LocalDate dateMax, ListOfOfferts list) {
        ListOfOfferts newList = new ListOfOfferts();
        for (Offert offert: list.getListOfOfferts()){
            if (dateMin.compareTo(offert.getOffertDate()) <= 0 && dateMax.compareTo(offert.getOffertDate()) >= 0){
                newList.addNewOffert(offert);
            }
        }
        return newList;
    }

    public static ListOfOfferts year(int yearMin, int yearMax, ListOfOfferts list) {
        ListOfOfferts newList = new ListOfOfferts();
        for (Offert offert: list.getListOfOfferts()){
            if (yearMin <= offert.getCar().getCarProductionYear() && yearMax >= offert.getCar().getCarProductionYear()) {
                newList.addNewOffert(offert);
            }
        }
        return newList;
    }

    public static ListOfOfferts mileage(int mileageMin, int mileageMax, ListOfOfferts list) {
        ListOfOfferts newList = new ListOfOfferts();
        for (Offert offert: list.getListOfOfferts()){
                if (mileageMin <= offert.getCar().getCarMileage() && mileageMax>= offert.getCar().getCarMileage()){
                    newList.addNewOffert(offert);
                }
            }
        return newList;
    }

}
