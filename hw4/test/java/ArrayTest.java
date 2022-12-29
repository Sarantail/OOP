package hw4.test.java;

import org.junit.jupiter.api.Test;
import services.ArrayServices;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {
    @Test
    public void sumWhenTypeIsInteger() {
        ArrayServices<Integer> service = new ArrayServices<>();

        assertEquals(service.sum(1, 2), 2);
    }

    @Test
    public void sumWhenBothNumberIsNull() {
        ArrayServices<Integer> service = new ArrayServices<>();

        assertEquals(service.sum(null, null), 0);
    }
}
