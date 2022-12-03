package com.skypro.homework_3;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1() {
        System.out.println("Задача 1");

        int a = 3141; // В задании написано только об объявлении переменных, без их инициализации!
        byte b = 31;
        short c = 314;
        long d = 31415L;
        float e = 3.14f;
        double f = 31.4;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2() {
        System.out.println("Задача 2");

        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g);// для самопроверки
    }
    public static void task3() {
        System.out.println("Задача 3");

        byte amtStudentsLP = 23;
        byte amtStudentsAS = 27;
        byte amtStudentsEA = 30;
        int totalAmtStudents = amtStudentsLP + amtStudentsAS + amtStudentsEA;
        int totalPaper = 480;
        System.out.println("На каждого ученика рассчитано " + totalPaper/totalAmtStudents + " листов бумаги.");

    }
    public static void task4() {
        System.out.println("Задача 4");

        byte amtBottles1 = 16;
        byte time1 = 2;
        System.out.println("За " + time1 + " минуты машина произвела "+ amtBottles1 + " штук бутылок.");
        byte time2 = 20;
        int amtBottles2 = time2 * amtBottles1 / time1;
        System.out.println("За " + time2 + " минуты машина произвела "+ amtBottles2 + " штук бутылок.");
        int time3 = 24 * 60;
        int amtBottles3 = time3 * amtBottles2 / time2;
        System.out.println("За " + time3 + " минуты машина произвела "+ amtBottles3 + " штук бутылок.");
        int time4 = 24 * 60 * 3;
        int amtBottles4 = time4 * amtBottles3 / time3;
        System.out.println("За " + time4 + " минуты машина произвела "+ amtBottles4 + " штук бутылок.");
        int time5 = 24 * 60 * 31;
        int amtBottles5 = time5 * amtBottles4 / time4;
        System.out.println("За " + time5 + " минуты машина произвела "+ amtBottles5 + " штук бутылок.");
    }
    public static void task5() {
        System.out.println("Задача 5");

        byte totalPaintBottles = 120;
        byte klassPaintWhite = 2;
        byte klassPaintBrown = 4;
        int totalKlass = totalPaintBottles / (klassPaintBrown + klassPaintWhite);
        int totalPaintWhite = totalKlass * klassPaintWhite;
        int totalPaintBrown = totalKlass * klassPaintBrown;
        System.out.println("В школе, где " + totalKlass + " классов, нужно " + totalPaintWhite + " банок белой краски и " + totalPaintBrown + " банок коричневой каски.");
    }
    public static void task6() {
        System.out.println("Задача 6");

        byte banana = 5;
        int bananaWeightGr = banana * 80;
        short milkWeghtMl = 200;
        int milkWeightGr = milkWeghtMl * (105 / 100);
        byte iceCream = 2;
        int iceCreamWeightGr = iceCream * 100;
        byte egg = 4;
        int eggWeightGr = egg * 70;
        int totalWeightGr = bananaWeightGr + milkWeightGr + iceCreamWeightGr + eggWeightGr;
        float totalWeightKg = totalWeightGr / 1000f;
        System.out.println("Общий вес спортзавтрака составляет " + totalWeightGr + " грамм или " + totalWeightKg + " килограмм.");

    }
    public static void task7() {
        System.out.println("Задача 7");
        int totalWeightKg = 7;
        int totalWeightGr = totalWeightKg * 1000;
        int dayWeight1 = 250;
        int dayWeight2 = 500;
        int totalDays1 = totalWeightGr / dayWeight1;
        int totalDays2 = totalWeightGr / dayWeight2;
        int middleTotalDays = (totalDays1 + totalDays2) / 2;
        System.out.println("Спортсмену нужно " + totalDays1 + " дней на похудение, если будет терять " + dayWeight1 + " грамм в день.");
        System.out.println("Спортсмену нужно " + totalDays2 + " дней на похудение, если будет терять " + dayWeight2 + " грамм в день.");
        System.out.println("В среднем спортсмену нужно " + middleTotalDays + " день на похудение");
    }
    public static void task8() {
        System.out.println("Задача 8");

        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;

        double indexPercent = 1.1;

        double newSalaryM = salaryM * indexPercent;
        double newYearSalaryM = newSalaryM * 12;
        double oldYearSalaryM = salaryM * 12;
        System.out.println("Маша теперь получает " + newSalaryM + " рублей. Годовой доход вырос на " + (newYearSalaryM - oldYearSalaryM) + " рублей.");
        double newSalaryD = salaryD * indexPercent;
        double newYearSalaryD = newSalaryD * 12;
        double oldYearSalaryD = salaryD * 12;
        System.out.println("Денис теперь получает " + newSalaryD + " рублей. Годовой доход вырос на " + (newYearSalaryD - oldYearSalaryD) + " рублей.");
        double newSalaryK = salaryK * indexPercent;
        double newYearSalaryK = newSalaryK * 12;
        double oldYearSalaryK = salaryK * 12;
        System.out.println("Кристина теперь получает " + newSalaryK + " рублей. Годовой доход вырос на " + (newYearSalaryK - oldYearSalaryK) + " рублей.");

    }
}
