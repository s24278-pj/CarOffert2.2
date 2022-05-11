import java.time.LocalDate;
import java.util.Comparator;

public class Offert {
    private Car car;
    private String title;
    private LocalDate offertDate;

    public Offert(Car car, String title, LocalDate offertDate) {
        this.car = car;
        this.title = title;
        this.offertDate = offertDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getOffertDate() {
        return offertDate;
    }

    public void setOffertDate(LocalDate offertDate) {
        this.offertDate = offertDate;
    }

    public static class Comparators {

        public static Comparator<Offert> DATE = new Comparator<Offert>() {
            @Override
            public int compare(Offert o1, Offert o2) {
                return o1.offertDate.compareTo(o2.offertDate);
            }
        };

        public static Comparator<Offert> TITLE = new Comparator<Offert>() {
            @Override
            public int compare(Offert o1, Offert o2) {
                return o1.title.compareTo(o2.title);
            }
        };

        public static Comparator<Offert> PRICE = new Comparator<Offert>() {
            @Override
            public int compare(Offert o1, Offert o2) {
                return o1.car.getCarPrice().compareTo(o2.getCar().getCarPrice());
            }
        };

        public static Comparator<Offert> YEAR = new Comparator<Offert>() {
            @Override
            public int compare(Offert o1, Offert o2) {
                return o1.car.getCarProductionYear().compareTo(o2.car.getCarProductionYear());
            }
        };
    }
}
