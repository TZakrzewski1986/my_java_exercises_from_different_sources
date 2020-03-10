package StandardTests_ex0;

import org.junit.jupiter.api.*;

public class StandardsTests {

    @BeforeAll
    static void initALL() {
    }

    @BeforeEach
    void init() {
    }

    @Test
    void failingTest() {
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownALL() {
    }
}
