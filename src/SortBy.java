import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBy {

    public static void priceASC(ListOfOfferts list) {
        Collections.sort(list.getListOfOfferts(), Offert.Comparators.PRICE);
    }

    public static void priceDESC(ListOfOfferts list) {
        priceASC(list);
        Collections.reverse(list.getListOfOfferts());
    }

    public static void yearASC(ListOfOfferts list) {
        Collections.sort(list.getListOfOfferts(), Offert.Comparators.YEAR);
    }

    public static void yearDESC(ListOfOfferts list) {
        yearASC(list);
        Collections.reverse(list.getListOfOfferts());
    }

    public static void dateASC(ListOfOfferts list) {
        Collections.sort(list.getListOfOfferts(), Offert.Comparators.DATE);
    }

    public static void dateDESC(ListOfOfferts list) {
        dateASC(list);
        Collections.reverse(list.getListOfOfferts());
    }

    public static void titleASC(ListOfOfferts list) {
        Collections.sort(list.getListOfOfferts(), Offert.Comparators.TITLE);
    }

    public static void titleDESC(ListOfOfferts list) {
        titleASC(list);
        Collections.reverse(list.getListOfOfferts());
    }

}
