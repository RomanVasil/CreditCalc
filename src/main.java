public class main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPayment12 = service.calculate(12);
        System.out.println("Ежемесячный платеж по кредиту (руб.) " + monthlyPayment12 + ",если срок кредита 1 года");

        double monthlyPayment24 = service.calculate(24);
        System.out.println("Ежемесячный платеж по кредиту (руб.) " + monthlyPayment24 + ",если срок кредита 2 года");

        double monthlyPayment36 = service.calculate(36);
        System.out.println("Ежемесячный платеж по кредиту (руб.) " + monthlyPayment36 + ",если срок кредита 3 года");

    }
}
