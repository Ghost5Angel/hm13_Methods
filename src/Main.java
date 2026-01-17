import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 1023;
        String leapYear = determineLeapYearStatus(year);
        System.out.println(leapYear);

        System.out.println("Задание 2");
        int clientOS = 1;
        int currentYear = 2014;
        String resVersion = searchVersion(clientOS, currentYear);
        System.out.println(resVersion);

        System.out.println("Задание 3");
        int deliveryDistance = 55;
        int deliveryTime = serchDeliveryTime(deliveryDistance);
        System.out.println(deliveryTime);
    }
    //Задание 1 название изменено
    public static String determineLeapYearStatus(int year) {
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return year + " год является високосным";
        } else {
            return year + " год не является високосным";
        }
    }
    //Задание 2
    public static String searchVersion(int clientOS, int clientDeviceYear) {
        int nowYear = LocalDate.now().getYear();;
        if (clientOS == 0 && clientDeviceYear < nowYear) {
            return("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= nowYear) {
            return("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < nowYear) {
            return("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= nowYear) {
            return("Установите версию приложения для Android по ссылке");
        } else {
            return("Что-то пошло не так");
        }
    }
    //Задание 3 переделано
    public static int serchDeliveryTime(int distance) {
        int days = 1;
        if (distance > 100) {
            return 0;
        }
        if (distance > 20) {
            days++;
        }
        if (distance > 60) {
            days++;
        }
        return days;
    }
}