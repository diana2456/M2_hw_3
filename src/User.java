public class User {
        public static void main(String[] args)  {
            Account account = new Account();
            AmountException amountException = new  AmountException("Вы сняли:",2000.0);
            account.deposit(20000.0);
            while (account.withDraw(6000.0))
                break;
            try {
                amountException.getCause();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
                amountException.amouns(2000.0);
            } catch (Exception e) {
                System.out.println(amountException.amouns(2000.0));
            }
        }
    }
  

