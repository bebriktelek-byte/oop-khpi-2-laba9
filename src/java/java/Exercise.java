public class Exercise {
    private final String name;
    private final int sets;

    public Exercise(String name, int sets) {
        this.name = name;
        this.sets = sets;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "Exercise{name='" + name + "', sets=" + sets + "}";
    }
}