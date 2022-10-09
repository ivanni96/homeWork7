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





    }
}