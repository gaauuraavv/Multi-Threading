public class Main {
    
    public static void main(String[] args) {
        
        Company c = new Company();

        Producer prd = new Producer(c);
        prd.start();

        Consumer con = new Consumer(c);
        Thread conTh = new Thread(con);
        conTh.start();
    }
}
