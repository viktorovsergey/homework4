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
        /* Объявите переменные типа int, byte, short, long, float, double.
           Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».*/
        int a = 128;
        byte b = 120;
        short c = -32766;
        long d = 3_333_333_888_888_888_888L;
        float e = 1.99999999999999999999999999999999999999f;
        double g = 4.589999999999999999999999999999999999999999999999;

        System.out.println("Задача 1");
        System.out.println("Значение переменной a c типом  int равно  " + a);
        System.out.println("Значение переменной b c типом  byte равно  " + b);
        System.out.println("Значение переменной c c типом  short равно  " + c);
        System.out.println("Значение переменной d c типом  long равно  " + d);
        System.out.println("Значение переменной e cтипом  float равно  " + e);
        System.out.println("Значение переменной g c типом  double равно  " + g);
        System.out.println();

    }

    static void task2() {
        System.out.println("Задача 2");
    /*Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.

    27.12
    987 678 965 549
    2,786
    569
    -159
    27897
    67
    * */
        float a = 27.12f;
        long b = 987_678_965_549L;
        float c = 2.786f;
        int d = 569;
        int e = -159;
        int f = 27_897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println();
    }

    static void task3() {
        System.out.println("Задача 3");
        /*   Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
         Три учительницы закупили все вместе 480 листов бумаги на все три класса.
         Посчитайте, сколько достанется листов каждому ученику.
          Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
         * */
        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int papersOneStudent = 480 / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + papersOneStudent + " листов бумаги");
        System.out.println();

    }

    static void task4() {
        System.out.println("Задача 4");
        /*
        Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.
        Какая производительность машины будет:
        за 20 минут,
        в сутки,
        за 3 дня,
        за 1 месяц
        Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
        * */
        int outputOneMinit = 16 / 2;
        int outputTwentyMinits = 20 * outputOneMinit;
        int outputOneDay = 24 * 60 * outputOneMinit;
        int outputThreeDay = 3 * outputOneDay;
        int ouputOneMonth = 30 * outputOneDay;
        System.out.println("За 20 минут машина произвела " + outputTwentyMinits + " бутылок");
        System.out.println("За сутки машина произвела " + outputOneDay + " бутылок");
        System.out.println("За 3 дня машина произвела " + outputThreeDay + " бутылок");
        System.out.println("За 1 месяц машина произвела " + ouputOneMonth + " бутылок");
        System.out.println();

    }

    static void task5() {
        System.out.println("Задача 5");
        /*
         * На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
         * На один класс уходит 2 банки белой и 4 банки коричневой краски.
         * Сколько банок каждой краски было куплено?
         * Выведите результат задачи в консоль в формате:
         * «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
         * */
        int whitePaintOneclass = 2;
        int brownPainOneClass = 4;
        int totalPaint = 120;
        int clases = totalPaint / (whitePaintOneclass + brownPainOneClass);
        int whitePaint = clases * whitePaintOneclass;
        int brownPaint = clases * brownPainOneClass;
        System.out.println("В школе, где " + clases + "  классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
        System.out.println();

    }

    static void task6() {
        System.out.println("Задача 6");
    /*
        Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        Бананы — 5 штук (1 банан — 80 грамм).
        Молоко — 200 мл (100 мл = 105 грамм).
        Мороженое-пломбир — 2 брикета по 100 грамм.
        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        Смешать всё в блендере — и готово.
        Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
        Результат в граммах и килограммах напечатайте в консоль.
    * */
        int bananWeight = 80;
        int totalBanan = 5;
        int milkWeight = 105;
        int totalMilk = 2;
        int icecreamWeight = 100;
        int totalIcecream = 2;
        int eggWight = 70;
        int totalegg = 4;
        int cocktailWeightGr = (totalBanan * bananWeight) + (totalMilk * milkWeight) + (totalIcecream * icecreamWeight)
                + (totalegg * eggWight);
        float cocktailWeightKg = cocktailWeightGr / 1000F;
        System.out.println("Общий вес завтрака в граммах равен " + cocktailWeightGr + " грамм");
        System.out.println("Общий вес завтрака в килограмах равен " + cocktailWeightKg + " килограмм");
        System.out.println();
    }

    static void task7() {
        System.out.println("Задача 7");
        /*
         спортсмену  нужно сбросить 7 кг
         спортсмен мог терять в весе от 250 до 500 грамм в день.
         сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм
         а сколько — если каждый день будет худеть на 500 грамм.
         Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
          Результаты всех подсчетов выведите в консоль.
         */
        int massa = 7 * 1000;
        int minDrop = 250;
        int maxDrop = 500;
        float maxDayDrop = (float) massa / minDrop;
        float mindayDrop = (float) massa / maxDrop;
        float avarageDayDrop = (mindayDrop + maxDayDrop) / 2;
        System.out.println("Минимальное количество дней похудения " + mindayDrop);
        System.out.println("максимальное количество дней похудения " + maxDayDrop);
        System.out.println("Среднее количество дней похудения " + avarageDayDrop);
        System.out.println();
    }

    static void task8() {
        System.out.println("Задача 8");
        /* Маша получает 67 760
           Денис получает 83 690
           Кристина получает 76 230
           Каждому нужно увеличить зарплату на 10% от текущей месячной.
           посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
           Посчитайте, сколько будет получать каждый из сотрудников,
           а также разницу между годовым доходом до и после повышения.
           Выведите в консоль информацию по каждому сотруднику.
           Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».*/
        int masha = 67_760;
        int denis = 83_690;
        int kris = 76_230;
        float increase = 1.1f;
        int months = 12;
        float mashaIndex = masha * increase;
        float mashaProfit = (mashaIndex - masha) * months;
        float denisIndex = denis * increase;
        float denisProfit = (denisIndex - denis) * months;
        float krisIndex = kris * increase;
        float krisProfit = (krisIndex - kris) * months;
        System.out.println(" Маша теперь получает " + mashaIndex + " рублей. Годовой доход вырос на " + mashaProfit + " рублей»");
        System.out.println(" Денис теперь получает " + denisIndex + " рублей. Годовой доход вырос на " + denisProfit + " рублей»");
        System.out.println(" Кристина теперь получает " + krisIndex + " рублей. Годовой доход вырос на " + krisProfit + " рублей»");
        float companyProfit = (mashaProfit + denisProfit + krisProfit) * months;
        System.out.println("Разница между годовым доходом с нынешней зарплатой и после повышения составляет " + companyProfit);
        System.out.println();


    }


}