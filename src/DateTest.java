import java.util.Scanner;

public class DateTest {
    /*
    Provide a method displayDate that displays the month, day and year separated by forward
slashes(/).
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Date myDate = new Date(9, 21,1958);

        System.out.println("Introduceti luna: ");
        int myMonth = input.nextInt();
        myDate.setMonthDate(myMonth);

        System.out.println("Introduceti ziua: ");
        int myDay = input.nextInt();
        myDate.setDayDate(myDay);

        System.out.println("Introduceti anul: ");
        int myYear = input.nextInt();
        myDate.setYearDate(myYear);

        myDate.displayDate();
    }
}
