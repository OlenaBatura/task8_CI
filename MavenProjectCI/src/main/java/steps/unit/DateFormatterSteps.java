package steps.unit;

import org.testng.Assert;
import utils.DateFormatter;

/**
 * Created by Olena_Batura,
 * Date: 04.12.2016,
 * Time: 1:53.
 */
public class DateFormatterSteps {
    private final static String date = "04-12-2016";
    private final static String formatedDate = "12/04/2016";
    private final static String initialDateFormat = "dd-mm-yyyy";
    private final static String newDateFormat = "mm/dd/yyyy";
    private final static String errorMessage = String.format("%s date is not convert from %s format to %s", date, initialDateFormat, newDateFormat);

    public static void verifyIfDateFormatCanBeChanged() {
        Assert.assertEquals(formatedDate, DateFormatter.changeDateFormat(date, initialDateFormat, newDateFormat), errorMessage);
    }

}
