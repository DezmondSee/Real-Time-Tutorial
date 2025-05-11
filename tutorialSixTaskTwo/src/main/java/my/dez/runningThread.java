package my.dez;

public class runningThread extends Thread
{
    private volatile boolean running = true;


    public void shutdown()
    {
        running = false;
    }

    @Override
    public void run()
    {
        while(running)
        {
            System.out.println("Thread running...");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
