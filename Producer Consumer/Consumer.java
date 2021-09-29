class Consumer implements Runnable{

    Company c;

    public Consumer(Company c){
        this.c = c;
    }

    @Override
    public void run() {

        int i = 1;
        while(true){
            this.c.Consume_item();
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Thread Not Available!!");
            }
            if(i >= 20){
                break;
            }
            i++;
        }

    }
}
