public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Ошибка в определении Вашей ОС");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        int iOs = 0;
        int android = 1;
        int checkYear = 2015;
        if (clientOS == iOs && clientDeviceYear < checkYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == android && clientDeviceYear < checkYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == iOs && clientDeviceYear >= checkYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android && clientDeviceYear >= checkYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка в определении Вашей ОС");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int minTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + minTime);
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + minTime * 2);
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + minTime * 3);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("Это зимний месяц");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Это весенний месяц");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Это летний месяц");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}