package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Olena_Batura,
 * Date: 04.12.2016,
 * Time: 16:16.
 */
public class DateConvertor {
    public static String convertDateToString(Date date) {
        return date.toString();
    }

    public static String convertDateToString(LocalDate date) {
        return date.toString();
    }

    public static Date convertStringToDate(String stringDate, String dateFormat) {
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        Date date = null;
        try {
            date = format.parse(stringDate);
        } catch (ParseException e) {
            System.out.format("String %s is not a date", stringDate);
        }
        return date;
    }

    public static void main(String[] args) {

    }
}
