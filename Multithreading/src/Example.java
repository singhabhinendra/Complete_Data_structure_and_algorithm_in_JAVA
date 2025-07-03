public class Example {
    public static void main(String[] args) {
        Play p1=new Play();
        p1.start();
        Play p2=new Play();
        p2.start();
        Play p3=new Play();
        p3.start();
        Play p4=new Play();
        p4.start();
        Play p5=new Play();
        p5.start();


    }

}

class Play extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){

        }
    }
}
