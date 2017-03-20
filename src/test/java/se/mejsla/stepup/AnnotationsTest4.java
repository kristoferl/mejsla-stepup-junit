package se.mejsla.stepup;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import se.mejsla.stepup.junit4.FastTests4;

import static org.junit.Assert.assertEquals;


public class AnnotationsTest4 {

    @Before // @After
    public void before() {
        // Executed before each test
    }

    @BeforeClass // @AfterClass
    public static void beforeClass() {
        // Executed before all tests
    }

    @Test
    public void myFirstTest4() {
        assertEquals("oh no!",2, 1 + 1);
    }

    @Test
    @Category(FastTests4.class)
    public void myFirstCategoryTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void myNotSoFastTest() throws InterruptedException {
        Thread.sleep(100);
    }

    @Test
    @Ignore
    public void notRunning() {}
}


