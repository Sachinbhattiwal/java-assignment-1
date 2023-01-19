import java.time.LocalDate;

class Main {
    public static String convertDateToString(String date) {
        LocalDate givenDate = LocalDate.parse(date);
        String dateToString = givenDate.toString();
        return (dateToString);
    }

    public static void main(String args[]) {
        String date = "2020-07-27";
        System.out.print(convertDateToString(date));
    }
}