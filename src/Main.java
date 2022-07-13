import com.sun.source.util.Trees;

public class Main {
    public static void main(String[] args) {

        // первое задание
        byte car = 5;
        int samsung = 55;
        short theTable = 11;
        long theBook = 65L;
        float P = 3.14f;
        double apple = 75.015;
        char Trees = '3';
        boolean bigCar = car > 15;
        System.out.println(bigCar);


        // задание второе
        float boxer1 = 78.2f, boxer2 = 82.7f;
        float totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес боксеров " + totalWeight + "кг. ");
        float weightDifference = Math.abs(boxer1 - boxer2);
        System.out.println("Разница в весе " + weightDifference + "кг. ");

        // задание 3
        byte banana = 5, weightBanana = 80;
        short totalWeightBanana = (short) (banana * weightBanana);
        System.out.println("Вес бананов " + totalWeightBanana + "г.");
        short milk = 2, milkMass100 = 105;
        short totalWeightMilk = (short) (milkMass100 * milk);
        System.out.println("Вес молока " + totalWeightMilk + "г.");
        byte aceCream = 5;
        short weightAceCream = 100;
        short totalWeightAceCream = (short) (aceCream * weightAceCream);
        System.out.println("Вес мороженного " + totalWeightAceCream + "г.");
        byte agge = 5;
        short weightAgge = 70;
        short totalWeightAgge = (short) (agge * weightAgge);
        System.out.println("Вес яиц " + totalWeightAgge + "г.");
        short coctail = (short) (totalWeightAgge + totalWeightAceCream + totalWeightMilk + totalWeightBanana);
        System.out.println("Вес коктеля " + coctail + "г.");
        float coctailKg = coctail / 1000f;
        System.out.println("Вес коктеля " + coctailKg + "кг.");
        System.out.println("Остаток от деления " + Math.floor(coctailKg));

        // задание 4

        byte excessWeight = 7;
        short excessWeightG = (short) (excessWeight * 1000);
        System.out.println("Лишний вес " + excessWeightG + "г.");

        short loss1 = 250;
        int days1 = excessWeightG / loss1;
        System.out.println(days1 + " дней займет похудение при потере 250г. в день. ");

        short loss2 = 500;
        short days2 = (short) (excessWeightG / loss2);
        System.out.println(days2 + " дней займет похудение при потере 500г. в день. ");

        int days3 = (days1 + days2) / 2;
        System.out.println(days3 + " день среднее количество дней похудения.");
        System.out.println("Остаток от деления " + Math.ceil(days3));


        // задание 5

        int masha = 67760, denis = 83690, kristina = 76230;

        int masha1 = masha * 12;
        int denis1 = denis * 12;
        int kristina1 = kristina * 12;
        System.out.println("Годовой доход Маши до повышения зарплаты - " + masha1 + " ₽");
        System.out.println("Годовой доход Дениса до повышения зарплаты - " + denis1 + " ₽");
        System.out.println("Годовой доход Кристины  до повышения зарплаты - " + kristina1 + " ₽");

        int masha2 = (int) ((masha * 0.1) + masha);
        int denis2 = (int) ((denis * 0.1) + denis);
        int kristina2 = (int) ((kristina * 0.1) + kristina);

        System.out.println("Увеличение месячной зарплаты Маши за выслугу лет -  " + masha2 + " ₽");
        System.out.println("Увеличение месячной зарплаты Денис за выслугу лет - " + denis2 + " ₽");
        System.out.println("Увеличение месячной зарплаты Кристины за выслугу лет -  " + kristina2 + " ₽");

        int masha3 = masha2 * 12;
        int denis3 = denis2 * 12;
        int kristina3 = kristina2 * 12;

        int resultMasha = Math.abs(masha1 - masha3);
        int resultDenis = Math.abs(denis1 - denis3);
        int resultKristina = Math.abs(kristina1 - kristina3);

        System.out.println("Маша теперь получает " + masha2 + "₽. Годовой доход вырос на " + resultMasha + " ₽");
        System.out.println("Денис теперь получает " + denis2 + "₽. Годовой доход вырос на " + resultDenis + " ₽");
        System.out.println("Кристина теперь получает " + kristina2 + "₽. Годовой доход вырос на " + resultKristina + " ₽");
    }
}

