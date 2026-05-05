import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class ProgressEntryTest {

    @Test
    void testProgressEntryCreation() {
        Exercise ex = new Exercise("Press", 3);
        ProgressEntry<Exercise, Integer> entry = new ProgressEntry<>(ex, 50);

        assertEquals(ex, entry.getEntity());
        assertEquals(50, entry.getValue());
    }

    @Test
    void testFindBestResult() {
        assertEquals(100, Main.findBestResult(Arrays.asList(10, 100, 50)));
        assertEquals("Orange", Main.findBestResult(Arrays.asList("Apple", "Orange", "Banana")));
    }
}