package itmo.lesson6.BankTask;

public class BankEmployee extends Human implements BankInfo{
    String bankName;

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }
    public void whereWork(){
        System.out.println(getName()+" work in "+bankName);
    }
    @Override
    public void AbstractMethod() {
    }

    @Override
    public void whatUse() {

    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
    public BankEmployee(){


    }


}
