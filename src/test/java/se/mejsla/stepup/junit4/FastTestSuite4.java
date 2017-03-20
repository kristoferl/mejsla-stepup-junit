package se.mejsla.stepup.junit4;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import se.mejsla.stepup.AnnotationsTest4;

@RunWith(Categories.class)
@Categories.IncludeCategory(FastTests4.class)
@Suite.SuiteClasses( { AnnotationsTest4.class})
public class FastTestSuite4 {
}

