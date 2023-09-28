public class Main {
    public static void main(String[] args) {
        PersonalAccount almaz = new PersonalAccount(220104069, "Almaz");
        PersonalAccount bekzhan = new PersonalAccount(220104123, "Bekzhan");
        almaz.deposit(400);
        almaz.withdraw(-200);
        almaz.printTransactionHistory();
    }
}