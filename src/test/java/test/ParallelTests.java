package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ParallelTests {

    @DisplayName("TestPass")
    @Test
    public void shouldPass() {
        Assertions.assertTrue(true);
    }

    @DisplayName("TestFail")
    @Test
    public void shouldFail() {
        Assertions.assertFalse(true);
    }

}
