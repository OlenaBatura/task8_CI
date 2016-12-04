package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Olena_Batura,
 * Date: 04.12.2016,
 * Time: 1:18.
 */
public class DateFormatter {

    public static String changeDateFormat(String oldDate, String oldDateFormat, String newDateFormat) {
        String newDate = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat(oldDateFormat);
        try {
            Date date = dateFormat.parse(oldDate);
            dateFormat.applyPattern(newDateFormat);
            newDate = dateFormat.format(date);
        } catch (ParseException e) {
            System.out.format("String %s is not a date", oldDate);
        }
        return newDate;
    }
}
