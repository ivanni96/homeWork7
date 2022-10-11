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
        int e = 0;
        for (;bankDeposit1 <= 12_000_000; e++){
            bankDeposit1 = (bankDeposit1 / 100 * 7) + bankDeposit1;
            System.out.println("Месяц " + e + " сумма накоплений равна" + bankDeposit1);

        }







    }
}