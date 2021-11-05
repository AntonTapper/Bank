package bank;

import java.io.FileNotFoundException;
import java.io.IOException;

public class test
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        Bank b = new Bank();
        b.getCustomers();
        System.out.println(b.getCustomerList().get(0).getName());
        System.out.println(b.getCustomerList().get(1).getName());
        System.out.println(b.getCustomerList().get(2).getName());




//        Customer c = new Customer("Stig","Andresson",195002105354L);
//        
//        c.addStoreTransactionList(1_000_001, "s", 50.00, 75.00, 125.00, "+");
//        c.addStoreTransactionList(1_000_001, "s", 125.00, 500.00, 625.00, "+");
//        c.addStoreTransactionList(1_000_001, "s", 625.00, 1000.00, 1625.00, "+");
//        System.out.println(c.getTransactionList().get(0).getTransactionString() + "\n");
//        System.out.println(c.getTransactionList().get(1).getTransactionString() + "\n");
//        System.out.println(c.getTransactionList().get(2).getTransactionString() + "\n");
    }
}