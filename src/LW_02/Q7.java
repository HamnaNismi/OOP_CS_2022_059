package LW_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        System.out.println(sdf1.format(today));
    }
}
