class Company{

    int n;
    boolean check = false;
    /*
        if check is false : chance of producer
        if check is true  : chance of consumer
    */

    synchronized public void Produce_item(int n){

        if(check == true){
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Thread Not Available!!");
            }
        }
        this.n = n;
        System.out.println("Item Produced : " + n);
        check = true;
        notify();
    }

    synchronized public int Consume_item(){

        if(check == false){
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Thread Not Available!!");
            }
        }
        System.out.println("Item Consumed : " + n);
        check = false;
        notify();
        return this.n;
    }
}
