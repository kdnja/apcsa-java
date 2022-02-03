import java.util.Calendar;

public class LastModified {
    public static String dateAndTime() {
        Calendar cal = Calendar.getInstance();
        String dateTimeStr = cal.getTime().toString();

        return dateTimeStr;
    }
}
