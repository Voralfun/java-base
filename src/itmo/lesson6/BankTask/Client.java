package itmo.lesson6.BankTask;

public class Client extends Human implements BankInfo{
    String bankName = "Swedbank";

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    public Client(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void AbstractMethod() {

    }
    public void whatUse(){
        System.out.println(getName()+" use "+bankName);
    }
    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    public void whereWork() {

    }

    public Client() {

    }


}
