import java.util.Scanner;

class Customer implements Runnable{

    private Account acc;
    private String customer_name;

    public Customer(Account acc, String name){
        this.acc = acc;
        this.customer_name = name;
    }
    
    @Override
    public void run() {
        
        Scanner sc = new Scanner(System.in);


        synchronized(this.acc){

            System.out.println("Welcome, " + customer_name + "\nEnter the ammount to be withdraw : ");
            int amt = sc.nextInt();
    
            if(this.acc.isSufficientBal(amt)){
                System.out.println(customer_name + ", ");
                this.acc.withdraw(amt);
            }else{
                System.out.println("Insufficient Fund!!");
            }
        }
    }
}
