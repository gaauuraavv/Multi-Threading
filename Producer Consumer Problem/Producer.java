class Producer extends Thread{

    Company c;

    public Producer(Company c){
        this.c = c;
    }

    @Override
    public void run() {

        int i = 1;
        while(true){
            this.c.Produce_item(i);
            try {
                Thread.sleep(1000);
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
