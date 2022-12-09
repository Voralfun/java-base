package itmo.lesson6.BankTask;

public class Main {
    public static void main(String[] args){
        BankInfo client = new Client("James","River","Swedbank");
    client.printInfo();
    client.whatUse();
    BankInfo bankWorker = new BankEmployee("Bob","Bobovich","Sber");
    bankWorker.printInfo();
    bankWorker.whereWork();

    }

}

