/**
 * Created by RENT on 2017-02-28.
 */

    public class Tasks implements Runnable {

        public int id;

    public Tasks(int i){
    this.id = id;}


        @Override
        public void run() {
            while(true){

                System.out.println("Identyfikator: "+ id);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){}
