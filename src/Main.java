import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {

        Car opel = new Car("Opel", 2010, 300000, 5000.99);
        Car bmw = new Car("BMW", 2020, 1000, 250000.00);
        Car toyota = new Car("Toyota", 2015, 50000, 15000.99);
        Car mini = new Car("Mini", 2015, 32000, 5300.50);

        ListOfOfferts list = new ListOfOfferts();

        Offert offert1 = new Offert(opel, "Piekne auto", LocalDate.of(2021, 05, 25));
        Offert offert2 = new Offert(bmw, "HIT!!!", LocalDate.of(2022, 03, 10));
        Offert offert3 = new Offert(toyota, "Dziadek jezdzil do kosciola", LocalDate.of(2020, 12, 10));
        Offert offert4 = new Offert(mini, "Nieklepane", LocalDate.of(2022, 04, 10));
        list.addNewOffert(offert1);
        list.addNewOffert(offert2);
        list.addNewOffert(offert3);
        list.addNewOffert(offert4);

        ListOfOfferts.printList(list);
        System.out.println("\nFiltrowanie po cenie:");
        ListOfOfferts filteredList = FilterBy.price(2000.00, 5500.00, list);
        ListOfOfferts.printList(filteredList);

        System.out.println("\nFiltrowanie po tytule:");
        filteredList = FilterBy.title("Nieklepane", list);
        ListOfOfferts.printList(filteredList);

        System.out.println("\nFiltrowanie po dacie:");
        filteredList = FilterBy.date(LocalDate.of(2021,05,25),LocalDate.of(2022,03,15), list);
        ListOfOfferts.printList(filteredList);

        System.out.println("\nFiltrowanie po roczniku:");
        filteredList = FilterBy.year(2014, 2015, list);
        ListOfOfferts.printList(filteredList);

        System.out.println("\nFiltrowanie po przebiegu:");
        filteredList = FilterBy.mileage(5000, 55000, list);
        ListOfOfferts.printList(filteredList);

        System.out.println("\nSortowanie rosnaco cena samochodu:");
        SortBy.priceASC(list);
        ListOfOfferts.printList(list);

        System.out.println("\nSortowanie malejaco cena samochodu:");
        SortBy.priceDESC(list);
        ListOfOfferts.printList(list);

        System.out.println("\nSortowanie rosnaco rocznik samochodu:");
        SortBy.yearASC(list);
        ListOfOfferts.printList(list);

        System.out.println("\nSortowanie malejaco rocznik samochodu:");
        SortBy.yearDESC(list);
        ListOfOfferts.printList(list);

        System.out.println("\nSortowanie rosnaco data dodania ogloszenia:");
        SortBy.dateASC(list);
        ListOfOfferts.printList(list);

        System.out.println("\nSortowanie malejaco data dodania ogloszenia:");
        SortBy.dateDESC(list);
        ListOfOfferts.printList(list);

        System.out.println("\nSortowanie rosnaco tytul ogloszenia:");
        SortBy.titleASC(list);
        ListOfOfferts.printList(list);

        System.out.println("\nSortowanie malejaco tytul ogloszenia:");
        SortBy.titleDESC(list);
        ListOfOfferts.printList(list);

    }


}
