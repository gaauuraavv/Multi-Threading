public class BMain {
    
    public static void main(String[] args) {
 
        Account acc = new Account(1000);

        Customer cust1 = new Customer(acc, "Gaurav Singh");
        Customer cust2 = new Customer(acc, "Neha Singh");

        Thread thc1 = new Thread(cust1);
        Thread thc2 = new Thread(cust2);

        thc1.start();
        thc2.start();        
    }
}
