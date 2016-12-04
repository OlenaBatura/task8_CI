package steps.unit;

import org.testng.Assert;
import utils.DateConvertor;

import java.time.LocalDate;

/**
 * Created by Olena_Batura,
 * Date: 04.12.2016,
 * Time: 16:30.
 */
public class DateConvertorSteps {
    private static LocalDate localDate = LocalDate.now();
    private static String stringLocalDate = localDate.toString();
    private final static String errorMessage = "String can`t be created from date!";

    public static void verifyIfStringCanBeCreatedFromDate() {
        Assert.assertEquals(DateConvertor.convertDateToString(localDate), stringLocalDate, errorMessage);
    }
}

