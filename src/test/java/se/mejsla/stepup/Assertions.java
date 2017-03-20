package se.mejsla.stepup;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

class Assertions {

    final String FIRST_NAME = "John";
    final String LAST_NAME = "Doe";

    @Test
    void standardAssertions() {
        assertEquals(2, 2);
        assertEquals(4, 4,
                "The optional assertion message is now the last parameter.");
        assertTrue(2 == 2, () -> "Assertion messages can be lazily evaluated -- "
                + "to avoid constructing complex messages unnecessarily.");
    }

    @Test
    void groupedAssertions() {
        // In a grouped assertion all assertions are executed, and any
        // failures will be reported together.
        assertAll("address",
                () -> assertEquals("John", FIRST_NAME),
                () -> assertEquals("Doe", LAST_NAME)
        );
    }

/*
    @Test(expected=NullPointerException.class)
    public void shouldReturnException() {
        User user = getUserById(123);
        user.getMonthlyFeeBasedOn(null);
    }
*/

    @Test
    void exceptionTesting() {
        Throwable exception = assertThrows(IllegalArgumentException.class, thingThatThrowsException());
        assertEquals("a message", exception.getMessage());
    }

    private Executable thingThatThrowsException() {
        return () -> {
            throw new IllegalArgumentException("a message");
        };
    }

    @Test
    void timeoutNotExceeded() {
        // The following assertion succeeds.
        assertTimeout(ofMinutes(2), () -> {
            // Perform task that takes less than 2 minutes.
        });
    }

    @Test
    void timeoutExceeded() {
        // The following assertion fails with an error message similar to:
        // execution exceeded timeout of 10 ms by 91 ms
        assertTimeout(ofMillis(10), () -> {
            // Simulate task that takes more than 10 ms.
            Thread.sleep(100);
        });
    }

    @Test
    void timeoutExceededWithPreemptiveTermination() {
        // The following assertion fails with an error message similar to:
        // execution timed out after 10 ms
        assertTimeoutPreemptively(ofMillis(10), () -> {
            // Simulate task that takes more than 10 ms.
            Thread.sleep(100);
        });
    }

    @Test
    void testOnlyOnDeveloperWorkstation() {
        assumeTrue("DEV".equals(System.getenv("ENV")),
                () -> "Aborting test: not on developer workstation");
        assertTrue(false);
    }

    @Test
    void testInAllEnvironments() {
        assumingThat("CI".equals(System.getenv("ENV")),
                () -> {
                    // perform these assertions only on the CI server
                    assertEquals(2, 2);
                });

        // perform these assertions in all environments
        assertEquals("a string", "a string");
    }

}
