class Account {

    private int bal;

    public Account(int bal){
        this.bal = bal;
    }

    public boolean isSufficientBal(int withdraw){

        if(this.bal > withdraw){
            return true;
        }
        return false;
    }
    
    public void withdraw(int withdraw){

        this.bal = this.bal - withdraw;
        System.out.println("Ammount " + withdraw + ", Sucessfully withdrawn");
        System.out.println("Current Balance " + this.bal);
    }
}
