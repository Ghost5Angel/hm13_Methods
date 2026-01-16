import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 1023;
        boolean leapYear = searchVersion(year);
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задание 2");
        int clientOS = 1;
        int currentYear = 2014;
        String resVersion = searchVersion(clientOS, currentYear);
        System.out.println(resVersion);

        System.out.println("Задание 3");
        int deliveryDistance = 55;
        int deliveryTime = serchdeliveryTime(deliveryDistance);
        System.out.println(deliveryTime);
    }
    //Задание 1
    public static boolean searchVersion(int year) {
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
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
    //Задание 3
    public static int serchdeliveryTime(int distance) {
        int days = 1;
        if (distance > 100) {
            days = 0;
        } else {
            if (distance > 20) {
                days++;
            }
            if (distance > 60) {
                days++;
            }
        }
        return (days);
    }
}