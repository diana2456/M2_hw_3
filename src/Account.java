public class Account {
        private Double amount = 0.0;
        public Double getAmount() {
            return amount;
        }
        Double deposit(Double som) {
            if (amount <som | amount == 0.0) {
                System.out.println("�� ������� ���� ��: " + (amount + som) + " ���");
            }
            return som;
        }
        boolean  withDraw(Double som){
            if (20000.0 > som  ) {
                System.out.println("�� �����: " + som + " ��� " + "������� �� �����:" + (20000.0 - som + " ���"));
                System.out.println("�� �����: " + som + " ��� " + "������� �� �����:" + (14000.0 - som + " ���"));
                System.out.println("�� �����: " + som + " ��� " + "������� �� �����:" + (8000.0 - som + " ���"));
            } if (som == 6000.0){
                String AmountException = "�� ����� ����� �� ���������� �����!!!";
                System.out.println(AmountException + " �� ����� �����: " + 2000.0 + "���");
            }return true ;
        }
    }

