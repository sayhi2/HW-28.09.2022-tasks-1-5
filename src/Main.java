public class Main {
    public static void main(String[] args) {
        System.out.println("HW 28.09.2022 tasks 1-5");
    }

    public static void Task1(){
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для IOS по ссылке ");
    } else {
        System.out.println("Установите версию приложения для Android по ссылке ");
    }
        //Task2;
        clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println(" Установите облегченную версию приложения для IOS по ссылке ");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке ");
            }
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке ");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке ");
            }

            //Task3
            int year = 2020;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " является високосным ");
            } else {
                System.out.println(year + " не является високосным ");
            }

            //Task4
            int delivery = 1;
            int deliveryDistance = 95;
            if (deliveryDistance > 20) {
                delivery++;
            }
            if (deliveryDistance > 60) {
                delivery++;
            }
            System.out.println(" Потребуется дней " + delivery);

              //Task5
            int monthNumber = 12;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println(" Зима ");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(" Весна ");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(" Лето ");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(" Осень ");
                    break;
                default:
                    System.out.println(" Некорректный месяц: " + monthNumber);
            }
            }
            }
        }

