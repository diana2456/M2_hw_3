public class AmountException extends Exception {
    Double remainingAmout;

    public AmountException(String message, Double amount) {
        super(message);
        this.remainingAmout = amount;
    }

    public boolean amouns(Double remainingAmout) {
        Account account = new Account();
        if (remainingAmout == 2000.0) {
            System.out.println("�� �����: " + 2000.0 + " ��� " + "������� �� �����: " + (account.getAmount()) + " ���");
        }
        return false;
    }
}