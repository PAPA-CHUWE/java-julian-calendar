import java.time.LocalDate;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yr;
        int mnth;
        int dae;
        System.out.println("Enter year :");
        yr = sc.nextInt();
        System.out.println("Enter month :");
        mnth = sc.nextInt();
        System.out.println("Enter day :");
        dae = sc.nextInt();

        while (mnth!=13) {
            
            LocalDate today = LocalDate.of(yr, mnth, dae);
            System.out.println("\n\t\t" + today.getMonth() + "\t\t");
            System.out.println("Su\tMo\tTu\tWe\tTh\tFr\tSa");

            if (today.getDayOfWeek().toString().equals("SUNDAY"))
                System.out.print("");
            if (today.getDayOfWeek().toString().equals("MONDAY"))
                System.out.print("\t");
            if (today.getDayOfWeek().toString().equals("TUESDAY"))
                System.out.print("\t\t");
            if (today.getDayOfWeek().toString().equals("WEDNESDAY"))
                System.out.print("\t\t\t");
            if (today.getDayOfWeek().toString().equals("THURSDAY"))
                System.out.print("\t\t\t\t");
            if (today.getDayOfWeek().toString().equals("FRIDAY"))
                System.out.print("\t\t\t\t\t");
            if (today.getDayOfWeek().toString().equals("SATURDAY"))
                System.out.print("\t\t\t\t\t\t");

            mnth += 1;
            dae=1;
            String month = today.getMonth().toString();
            while (month.equals(today.getMonth().toString())) {
                if (today.getDayOfWeek().toString().equals("SATURDAY"))
                    System.out.println(today.getDayOfMonth() + "\t");
                else
                    System.out.print(today.getDayOfMonth() + "\t");
                today = today.plusDays(1);

            }
        }
    }
}
