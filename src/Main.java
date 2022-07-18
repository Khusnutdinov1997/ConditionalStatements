public class Main {

// задание 1
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS==0){
            System.out.println("Установите версию приложения для IOS по ссылке.");
        }


// Задание 2
        long clientDeviceYear = 2011;
    if (clientDeviceYear <= 2015 && clientOS == 1 ) {
    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
    } else if (clientDeviceYear > 2015 && clientOS == 1){
        System.out.println("Установите версию приложения для Android по ссылке.");
    }
    if (clientDeviceYear <= 2015 && clientOS==0) {
     System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
 }  else if (clientDeviceYear > 2015 && clientOS ==0){
            System.out.println("Установите версию приложения для IOS по ссылке.");
 }

 // Задание 3
      int year = 2024;
    if (year % 4 ==0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным!");
    } else {
        System.out.println (year + " год не является високосным!");
    }

// Задание 4
        int deliveryDstance = 95;
    int day = 1;
    if (deliveryDstance <= 20){
        System.out.println("Потребуется дней " + day);
    } else if (deliveryDstance >= 20 && deliveryDstance <= 60) {
        day++;
        System.out.println("Потребуется дней " + day);
    } else if (deliveryDstance >= 60 && deliveryDstance <= 100){
        day+=2;
        System.out.println("Потребуется дней " + day);
    }
    // Задание 5
        int monthNumber=5;
        switch(monthNumber){
            case 1:
                System.out.println("Январь принадлежит к сезону зима.");
                break;
            case 2:
                System.out.println("Февраль принадлежит к сезону зима.");
                break;
            case 3:
                System.out.println("Март принадлежит к сезону весна.");
                break;
            case 4:
                System.out.println("Апрель принадлежит к сезону весна.");
                break;
            case 5:
                System.out.println("Май принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println("Июнь принадлежит к сезону лето.");
                break;
            case 7:
                System.out.println("Июль принадлежит к сезону лето.");
                break;
            case 8:
                System.out.println("Август принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println("Сентябрь принадлежит к сезону осень.");
                break;
            case 10:
                System.out.println("Октябрь принадлежит к сезону осень.");
                break;
            case 11:
                System.out.println("Ноябрь принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println("Декабрь принадлежит к сезону зима.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
    }






