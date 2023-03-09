package study;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @BeforeEach
    public void setup() {
        System.out.println("setup");
    }

    @Test
    public void test1() throws Exception {
        System.out.println("test1");
    }

    @Test
    public void test2() throws Exception {
        System.out.println("test2");
    }

    @AfterEach
    public void teardown() {
        System.out.println("teardown");
    }

}
