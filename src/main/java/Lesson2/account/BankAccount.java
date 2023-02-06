package Lesson2.account;

public class BankAccount {
    /*
    -id:String
    -name:String
    -balance:int
    +BankAccount(id,name,balance)
    +get
    +credit(amount:int):int - добавляем деньги на счет возвращает деньи
    +debit(amount:int):int - снимаем деньги только если амаунт <=balance
    если не так то печатаем ошибку осталвяем баланс незименныи
   +transfer(account:BankAccount,amount:int):int
   +toString():String - BankAccount[id=?,name=?,balance=?]
     */
    private String Id, Name;
    private static int balance;

    public BankAccount(String id, String name, int balance) {
        Id = id;
        Name = name;
        this.balance = balance;

    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getBalance() {
        return balance;
    }

    public static int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Не хватает денег на счете");
        return balance;
    }

    public int transfer(BankAccount account, int amount) {
        if (amount <= balance) {
            balance -= amount;
            account.credit(amount);
        } else
            System.out.println("Не хватает денег на счете");
        return balance;
    }

    public String toString()
    {
        return String.format("BankAccount[id=%s,name=%s,balance=%d]",Id,Name,balance);
    }

}
