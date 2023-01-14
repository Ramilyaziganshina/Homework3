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

    public static void task1 () {
        System.out.println("Задача 1");
        int a = 1000000;
        byte b = 27;
        short c = 837;
        long d = 80;
        float e = 1.5f;
        double f = 2.5;
        System.out.println("Значение переменной a с типом int = " + a);
        System.out.println("Значение переменной b с типом byte = " + b);
        System.out.println("Значение переменной c с типом short = " + c);
        System.out.println("Значение переменной d с типом long = " + d);
        System.out.println("Значение переменной e с типом float = " + e);
        System.out.println("Значение переменной f с типом double = " + f);
        }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        int d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println("Значение переменной a с типом float = " + a);
        System.out.println("Значение переменной b с типом long = " + b);
        System.out.println("Значение переменной c с типом double = " + c);
        System.out.println("Значение переменной d с типом int = " + d);
        System.out.println("Значение переменной e с типом short = " + e);
        System.out.println("Значение переменной f с типом short = " + f);
        System.out.println("Значение переменной g с типом byte = " + g);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int pupilsLP = 23;
        int pupilsAS = 27;
        int pupilsEA = 30;
        int paper = 480;
        int pupilsTotal = pupilsLP + pupilsAS + pupilsEA;
        int pupilPaper = paper / pupilsTotal;
        System.out.println("На каждого ученика рассчитано " + pupilPaper + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int bottleProduction = 16;
        int time = 2;
        int time20Min = 20;
        int timeDay = time20Min * 3 * 24;
        int time3Days = timeDay * 3;
        int timeMonth = time3Days * 10;
        long bottleProduction20Min = time20Min / time * bottleProduction;
        long bottleProductionDay = timeDay / time * bottleProduction;
        long bottleProduction3Days = time3Days / time * bottleProduction;
        long bottleProductionMonth = timeMonth / time * bottleProduction;
        System.out.println("За 20 минут машина произвела " + bottleProduction20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleProductionDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleProduction3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottleProductionMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte paintsTotal = 120;
        byte paintsClassWhite = 2;
        byte paintsClassBrown = 4;
        int paintsClassTotal = paintsClassWhite + paintsClassBrown;
        int classes = paintsTotal / paintsClassTotal;
        int paintsWhite = classes * paintsClassWhite;
        int paintsBrown = classes * paintsClassBrown;
        System.out.println("В школе, где " + classes + " классов, нужно " + paintsWhite + " банок белой краски и " + paintsBrown + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int bananas = 5;
        int bananasWeight = 80;
        int milk = 2;
        int milkWeight = 105;
        int cream = 2;
        int creamWeight = 100;
        int eggs = 4;
        int eggsWeight = 70;
        int bananasTotal = bananas * bananasWeight;
        int milkTotal = milk * milkWeight;
        int creamTotal = cream * creamWeight;
        int eggsTotal = eggs * eggsWeight;
        int breakfastGram = bananasTotal + milkTotal + creamTotal + eggsTotal;
        float breakfastKilogram = breakfastGram / 1000.000f;
        System.out.println("Вес спортзавтрака " + breakfastGram + " грамм или " + breakfastKilogram + " килограмм");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int needToLoseWeight = 7 * 1000;
        int loseWeightDayMin = 250;
        int loseWeightDayMax = 500;
        int loseWeightTotalMin = needToLoseWeight / loseWeightDayMin;
        int loseWeightTotalMax = needToLoseWeight / loseWeightDayMax;
        int loseWeightTotalAverage = (loseWeightTotalMin + loseWeightTotalMax) / 2;
        System.out.println("Если спортсмен будет худеть каждый день на 250г, ему понадобится " + loseWeightTotalMin + " дней");
        System.out.println("Если спортсмен будет худеть каждый день на 500г, ему понадобится " + loseWeightTotalMax + " дней");
        System.out.println("В среднем для похудения на 7кг спортсмену потребуется " + loseWeightTotalAverage + " дней");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int monthM = 67760;
        int monthD = 83690;
        int monthK = 76230;
        int yearM = monthM * 12;
        int yearD = monthD * 12;
        int yearK = monthK * 12;
        float monthMNew = monthM + (monthM * 0.1f);
        float monthDNew = monthD + (monthD * 0.1f);
        float monthKNew = monthK + (monthK * 0.1f);
        float yearMNew = monthMNew * 12;
        float yearDNew = monthDNew * 12;
        float yearKNew = monthKNew * 12;
        float differenceM = yearMNew - yearM;
        float differenceD = yearDNew - yearD;
        float differenceK = yearKNew - yearK;
        System.out.println("Маша теперь получает " + monthMNew + " рублей. Годовой доход вырос на " + differenceM + " рублей");
        System.out.println("Денис теперь получает " + monthDNew + " рублей. Годовой доход вырос на " + differenceD + " рублей");
        System.out.println("Кристина теперь получает " + monthKNew + " рублей. Годовой доход вырос на " + differenceK + " рублей");
    }
}