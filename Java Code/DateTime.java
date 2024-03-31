package basicjava;
import java.util.*;

public class DateTime {
    public static void main(String args[])
    {
        int day,month,year,second,minute,hour;
        GregorianCalendar date= new GregorianCalendar();
        
        day=date.get(Calendar.DAY_OF_MONTH);
        month=date.get(Calendar.MONTH);
        year=date.get(Calendar.YEAR);
        
        second=date.get(Calendar.SECOND);
        minute=date.get(Calendar.MINUTE);
        hour=date.get(Calendar.HOUR);
        
        System.out.println("Current Date: "+day+"/"+(month+1)+"/"+year);
        System.out.println("Current Time: "+hour+":"+minute+":"+second);
    }
}
