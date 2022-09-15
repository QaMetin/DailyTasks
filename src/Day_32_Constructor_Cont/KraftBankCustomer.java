package Day_32_Constructor_Cont;

import java.util.Random;

public class KraftBankCustomer {
    public int customerId;
    public String customerFullName;
    public boolean isSms;
    public double customerAccount;
    public String customerToken;

    public KraftBankCustomer(int customerId, String customerFullName, boolean isSms) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.isSms = isSms;
        Random random=new Random();
        this.customerToken=customerId+customerFullName.substring(0,2)+(random.nextInt(8999)+1000);// 1000 ile 9999 arasında demektir.

    }

    public void addMoney(int money){
        this.customerAccount+=(money*18.22);
    }
}
