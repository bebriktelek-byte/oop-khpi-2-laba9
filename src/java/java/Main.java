import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

    /**

     Generic-метод для поиска лучшего (максимального) результата.
     Использует ограничение типа (bounded type parameter).*/
    public static <T extends Comparable<T>> T findBestResult(List<T> results) {
        if (results == null || results.isEmpty()) {
            return null;}
        T best = results.get(0);
        for (T current : results) {
            if (current.compareTo(best) > 0) {
                best = current;}}
        return best;}

    public static void main(String[] args) {
        Exercise squat = new Exercise("Приседания", 4);
        Workout cardio = new Workout(LocalDate.now(), "Бег");

        ProgressEntry<Exercise, Double> strengthProgress =
                new ProgressEntry<>(squat, 120.5);

        ProgressEntry<Workout, Integer> cardioProgress =
                new ProgressEntry<>(cardio, 45);

        System.out.println("--- Записи прогресса ---");
        System.out.println(strengthProgress);
        System.out.println(cardioProgress);

        System.out.println("\n--- Анализ результатов ---");

        List<Double> weights = Arrays.asList(110.0, 125.5, 115.0);
        System.out.println("Максимальный вес: " + findBestResult(weights) + " кг");

        List<String> exercisesNames = Arrays.asList("Yoga", "Zumba", "Aerobics");
        System.out.println("Последнее по алфавиту: " + findBestResult(exercisesNames));
    }
}