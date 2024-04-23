import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        while (true) {
            System.out.println("Введите год:");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней:");
            int days = scanner.nextInt();

            if (daysYear(year) == days) {
                score++;
                System.out.println("Правильно!");
            } else {
                System.out.println("Неправильно! В этом году " + daysYear(year) + " дней!");
                break;
            }
        }
        System.out.println("Набрано очков: " + score);
    }

    public static int daysYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 366;
        } else {
            return 365;
        }
    }
}
