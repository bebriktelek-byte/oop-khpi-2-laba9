/**

 Узагальненный класс для хранения результатов измерений.
 @param <TEntity> Тип сущности (Exercise, Workout и т.д.)
 @param <TValue> Тип значения (должен наследоваться от Number)*/
public class ProgressEntry<TEntity, TValue extends Number> {
    private final TEntity entity;
    private final TValue value;

    public ProgressEntry(TEntity entity, TValue value) {
        this.entity = entity;
        this.value = value;
    }

    public TEntity getEntity() { return entity; }
    public TValue getValue() { return value; }

    @Override
    public String toString() {
        return "ProgressEntry{" +
                "entity=" + entity +
                ", value=" + value +
                '}';
    }
}