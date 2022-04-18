public class CreditPaymentService {
    public double calculate(int month) {
        double percent = 9.99;
        int credit = 1_000_000;          //сумма кредита

        double interestRate = percent / 100 / 12;

        //месячный платеж
        double monthlyPayment = credit * (interestRate * Math.pow(1 + interestRate, month)) / (Math.pow(1 + interestRate, month) - 1);


        return monthlyPayment;
    }

}
