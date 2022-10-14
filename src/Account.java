public class Account {
        private Double amount = 0.0;
        public Double getAmount() {
            return amount;
        }
        Double deposit(Double som) {
            if (amount <som | amount == 0.0) {
                System.out.println("Вы полнили счет на: " + (amount + som) + " сом");
            }
            return som;
        }
        boolean  withDraw(Double som){
            if (20000.0 > som  ) {
                System.out.println("Вы сняли: " + som + " сом " + "Остаток на счету:" + (20000.0 - som + " сом"));
                System.out.println("Вы сняли: " + som + " сом " + "Остаток на счету:" + (14000.0 - som + " сом"));
                System.out.println("Вы сняли: " + som + " сом " + "Остаток на счету:" + (8000.0 - som + " сом"));
            } if (som == 6000.0){
                String AmountException = "На вашем счету не достаточно денег!!!";
                System.out.println(AmountException + " На вашем счету: " + 2000.0 + "сом");
            }return true ;
        }
    }

