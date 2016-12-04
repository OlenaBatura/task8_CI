package unitTests;

import org.testng.annotations.Test;
import steps.unit.DateConvertorSteps;

/**
 * Created by Olena_Batura,
 * Date: 04.12.2016,
 * Time: 16:31.
 */
public class DateConvertorTest {
    @Test
    public void testConvertStringToDate() {
        DateConvertorSteps.verifyIfStringCanBeCreatedFromDate();
    }
}
