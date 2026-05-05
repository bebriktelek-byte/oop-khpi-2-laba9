import java.time.LocalDate;

public class Workout {
    private final LocalDate date;
    private final String type;

    public Workout(LocalDate date, String type) {
        this.date = date;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Workout{date=" + date + ", type='" + type + "'}";
    }
}