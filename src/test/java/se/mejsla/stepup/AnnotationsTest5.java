package se.mejsla.stepup;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Testing some JUnit 5 annotations")
class AnnotationsTest5 {

    private static final String SLOW = "SLOW";

    @BeforeEach // @AfterEach
    void beforeEach() {
        // Executed before each test
    }

    @BeforeAll // @AfterAll
    static void beforeAll() {
        // Executed before all tests
    }

    @Test
    @DisplayName("A custom name on my test 😎")
    @Tag("fast")
    @Tag(SLOW)
    void myFirstTest5() {
        assertEquals(2, 1 + 1, "oh no!");
    }

//    @Test
//    @ExtendWith(MockitoExtension.class)
//    void myFirstTestMock(@Mock MyCustomClass myCustomClass) {
//        // Work with mock of MyCustomClass
//    }

    @Test
    @Disabled
    @DisplayName("╯°□°）╯")
    void notRunning() {}

}
