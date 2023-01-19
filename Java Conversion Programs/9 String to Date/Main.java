import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        String strDate = "01/01/2001";
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
        System.out.println(strDate+ "\t" + date);
    }
}