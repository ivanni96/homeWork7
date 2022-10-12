public class Main {
    public static void main(String[] args) {

        //Задача 1

        int bankDeposit = 15000;
        int totalBankDeposit = 0;
        int a= 0;
        while (totalBankDeposit < 2_459_000) {
            a++;
            totalBankDeposit = totalBankDeposit + totalBankDeposit/100;
            totalBankDeposit = totalBankDeposit + bankDeposit;

            System.out.println("Месяц " + a + " ,cумма накоплений равна " + totalBankDeposit);}

        // Задача 2

        int b = 0;
        b++;
        while (b<10){
            b++;
            System.out.println(b);}
        for (int c = 10;c >= 0;c--){
            System.out.println(c);}

        //Задача 3

        int population = 12_000_000;
        int profitOfPopulation = population / 1000* 17;
        int declinePopulation = population / 1000* 8;
        int totalIncreasePopulation = profitOfPopulation - declinePopulation;

        for (int d = 1;d <= 10;d++) {
            population = population + totalIncreasePopulation;

            System.out.println("Год " + d + "численность населения составляет " + population);

        }
        // Задание 4

        int bankDeposit1 = 15000;
        int e = 1;
        for (;bankDeposit1 <= 12_000_000; e++){
            bankDeposit1 = (bankDeposit1 / 100 * 7) + bankDeposit1;
            System.out.println("Месяц " + e + " сумма накоплений равна" + bankDeposit1);
        }

        // Задача 5

        int bankDeposit2 = 15000;
        int g = 1;
        for (;bankDeposit2 <= 12_000_000; g++){
            bankDeposit2 = (bankDeposit2 / 100 * 7) + bankDeposit2;
            if (g % 6 == 0){
                System.out.println("Месяц " + g + " сумма накоплений равна" + bankDeposit2);}}

        // Задача 6

        int bankDeposit3 = 15000;
        int h = 1;
        for (;h <= 108; h++){
            bankDeposit3 = (bankDeposit3 / 100 * 7) + bankDeposit3;
            if (h % 6 == 0){
                System.out.println("Месяц " + h + " сумма накоплений равна" + bankDeposit3);}}

        // Задача 7


        for (int k= 1; k <= 31;k = k + 7){

                System.out.println("Сегодня пятница "+ k + "число. Необходимо сдать отчет" );
        }

        // Задача 8

        int l = 0;
        for (; l <= 2122; l = l + 79) {
            if (l >= 1822) {
                System.out.println(l);
            }
        }
        // Задача 9

        int x = 2;
        int y = 0;
        int z = 0;

        for (y = 1; y <= 10; y++){
            z= x * y;
            System.out.println(x + "*" + y + "=" + z);}


        }
    }










