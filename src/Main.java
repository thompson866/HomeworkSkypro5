public class Main {
    public static void main(String[] args) {


        //Задача 1//
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");

        }

        //Задача 2//
        int clientOs = 1;
        int clientDeviceYear = 2015;
        if (clientOs == 0)
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите приложение");
            }
        else if (clientOs == 1)
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите приложение");
            }



        //Задача 3//


        int years = 2023;
        if ((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0)) {
            System.out.println(years + " год является високосным");
        } else {
            System.out.println(years + " год не является високосным");
        }

        //Задача 3//
        int deliveryDistance = 25;

        int days = 1;
        if (deliveryDistance<20) {
            System.out.println(days + " дней потребуется на доставку");
        } else if (deliveryDistance < 60) {
            System.out.println((days + 1) + " дней потребуется на доставку");
        } else if (deliveryDistance < 100) {
            System.out.println((days + 2) + " дней потребуется на доставку");            
        } else  {
            System.out.println("Доставки нет");
        }
        //Задача 5//

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
        System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
        }



    }
}