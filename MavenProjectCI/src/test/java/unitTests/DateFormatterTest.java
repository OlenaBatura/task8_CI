package unitTests;

import org.testng.annotations.Test;
import steps.unit.DateFormatterSteps;

/**
 * Created by Olena_Batura,
 * Date: 04.12.2016,
 * Time: 10:55.
 */
public class DateFormatterTest {

    @Test
    public void testChangeDateMethod() {
        DateFormatterSteps.verifyIfDateFormatCanBeChanged();
    }

}
