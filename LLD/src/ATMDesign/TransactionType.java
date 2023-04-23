package ATMDesign;

public enum TransactionType {
 CASH_WITHDRAWAL,
    BALANCE_CHEK;
 public  static void showAllTransactionTypes(){
     for(TransactionType transactionType : TransactionType.values()){
         System.out.println(transactionType.name());
     }
 }
}
